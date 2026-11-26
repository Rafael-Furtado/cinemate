package dao;

import config.ConnectionFactory;
import model.Movie;
import model.MovieSession;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieSessionDAO {
    public List<MovieSession> getAllMovieSessions() {
        String sql = "SELECT * FROM movies_sessions";
        List<MovieSession> movieSessions = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                MovieSession movieSession = new MovieSession();
                movieSession.setIdSession(rs.getInt("id"));
                movieSession.setMovieSessionId(rs.getInt("movie_id"));
                movieSession.setStartsAt(rs.getTimestamp("starts_at"));
                movieSession.setCinemaSession(rs.getString("cinema"));
                movieSession.setCinemaSession(rs.getString("city"));
                movieSession.setDistanceSession(rs.getDouble("distance_km"));
                movieSession.setSessionAudio(rs.getString("audio"));
                movieSession.setTicketLink(rs.getString("ticket_link"));
                movieSession.setSourceUrl(rs.getString("source_url"));
                movieSessions.add(movieSession);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error trying to list all the movie sessions: " + e.getMessage(), e);
        }

        return movieSessions;
    }
}
