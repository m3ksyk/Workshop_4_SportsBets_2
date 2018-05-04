package pl.coderslab.web;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Service;
import pl.coderslab.model.League;
import pl.coderslab.model.Team;

import java.util.Set;

@Service
@JsonIgnoreProperties(ignoreUnknown = true)
public class SportDto {
    @JsonProperty("sport_id")
    private long id;
    @JsonProperty("sport_name")
    private String name;
    @JsonProperty("sport_leagues")
    private Set<League> leagues;
    @JsonProperty("sport_teams")
    private Set<Team> teams;

    public SportDto() {
    }

    public SportDto(long id, String name, Set<League> leagues, Set<Team> teams) {
        this.id = id;
        this.name = name;
        this.leagues = leagues;
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

    public Set<League> getLeagues() {
        return leagues;
    }

    public void setLeagues(Set<League> leagues) {
        this.leagues = leagues;
    }

    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "SportDto " +
                "id= " + id +
                ", name= " + name +
                ", leagues= " + leagues +
                ", teams= " + teams;
    }
}
