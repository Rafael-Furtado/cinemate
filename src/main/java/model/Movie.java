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

    public int getId() { return this.id; }
    public void setId(int idMovie) { this.id = idMovie; }

    public String getName() { return this.name; }
    public void setName(String nameMovie) { this.name = nameMovie; }

    public String getDescription() { return this.description; }
    public void setDescription(String descriptionMovie) { this.description = descriptionMovie; }

    public Timestamp getDateSession() { return this.date_session; }
    public void setDateSession(Timestamp dateSessionMovie) { this.date_session = dateSessionMovie; }

    public String getCinemaSession() { return this.cinema_session; }
    public void setCinemaSession(String cinemaSessionMovie) { this.cinema_session = cinemaSessionMovie; }

    public String getCitySession() { return this.city_session; }
    public void setCitySession(String citySessionMovie) { this.city_session = citySessionMovie; }

    public String getDistanceSession() { return this.distance_session; }
    public void setDistanceSession(String distanceSessionMovie) { this.distance_session = distanceSessionMovie; }

    public boolean getIsAtStreaming() { return this.is_at_streaming; }
    public void setIsAtStreaming(boolean isAtStreamingMovie) { this.is_at_streaming = isAtStreamingMovie; }

    public String getTicketLink() { return this.ticket_link; }
    public void setTicketLink(String ticketLinkMovie) { this.ticket_link = ticketLinkMovie; }

    public String getStreamingLink() { return this.streaming_link; }
    public void setStreamingLink(String streamingLinkMovie) { this.streaming_link = streamingLinkMovie; }

}
