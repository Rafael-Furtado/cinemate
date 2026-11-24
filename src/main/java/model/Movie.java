package model;

import java.sql.Timestamp;

public class Movie {
    int id;
    String name;
    String description;
    Timestamp date_session;
    String cinema_session;
    String city_session;
    String distance_session;
    boolean is_at_streaming;
    String ticket_link;
    String streaming_link;

    public Movie(){}

    public void getAllMovies(){

    };
}
