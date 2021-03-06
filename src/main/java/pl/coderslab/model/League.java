package pl.coderslab.model;

import java.util.Set;

public class League {
    private long id;
    private String name;
    private Sport sport;
    private Country country;
    private Set<Team> teams;

    public League() {
    }

    public League(long id, String name, Country country, Sport sport, Set<Team> teams) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.sport = sport;
        this.teams = teams;
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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }
}
