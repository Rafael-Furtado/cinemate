package dao;

import config.ConnectionFactory;
import model.Movie;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieDAO {
    public List<Movie> getAllMovies() {
        String sql = "SELECT * FROM movies";
        List<Movie> movies = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Movie movie = new Movie();
                movie.setId(rs.getInt("id"));
                movie.setName(rs.getString("name"));
                movie.setDescription(rs.getString("description"));
                movie.setDateSession(rs.getTimestamp("date_session"));
                movie.setCinemaSession(rs.getString("cinema_session"));
                movie.setCitySession(rs.getString("city_session"));
                movie.setDistanceSession(rs.getString("distance_session"));
                movie.setIsAtStreaming(rs.getBoolean("is_at_streaming"));
                movie.setTicketLink(rs.getString("ticket_link"));
                movie.setStreamingLink(rs.getString("streaming_link"));
                movies.add(movie);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error trying to list all the movies: " + e.getMessage(), e);
        }

        return movies;
    }
}
