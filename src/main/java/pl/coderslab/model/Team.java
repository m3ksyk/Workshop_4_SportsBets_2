package pl.coderslab.model;

public class Team {
    private long id;
    private String name;
    private League league;
    private Sport sport;

    public Team() {
    }

    public Team(long id, String name, League league, Sport sport) {
        this.id = id;
        this.name = name;
        this.league = league;
        this.sport = sport;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }
}
