package model;

import java.sql.Timestamp;

public class MovieSession {
    int id;
    int movie_id;
    Timestamp starts_at;
    String cinema;
    String city;
    double distance_km;
    String audio;
    String ticket_link;
    String source_url;

    public MovieSession(){}

    public int getIdSession() { return this.id; }
    public void setIdSession(int idSession) { this.id = idSession; }

    public int getMovieSessionId() { return this.movie_id; }
    public void setMovieSessionId(int movieSessionId) { this.movie_id = movieSessionId; }

    public Timestamp getStartsAt() { return this.starts_at; }
    public void setStartsAt(Timestamp sessionStartsAt) { this.starts_at = sessionStartsAt; }

    public String getCinema() { return this.cinema; }
    public void setCinema(String sessionCinema) { this.cinema = sessionCinema; }

    public String getCinemaSession() { return this.cinema; }
    public void setCinemaSession(String cinemaSessionMovie) { this.cinema = cinemaSessionMovie; }

    public String getCitySession() { return this.city; }
    public void setCitySession(String citySessionMovie) { this.city = citySessionMovie; }

    public double getDistanceSession() { return this.distance_km; }
    public void setDistanceSession(double distanceSessionMovie) { this.distance_km = distanceSessionMovie; }

    public String getSessionAudio() { return this.audio; }
    public void setSessionAudio(String sessionAudio) { this.audio = sessionAudio; }

    public String getTicketLink() { return this.ticket_link; }
    public void setTicketLink(String ticketLinkMovie) { this.ticket_link = ticketLinkMovie; }

    public String getSourceUrl() { return this.source_url; }
    public void setSourceUrl(String sourceUrl) { this.source_url = sourceUrl; }
}
