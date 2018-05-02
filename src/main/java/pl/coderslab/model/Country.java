package pl.coderslab.model;

import java.util.Set;

public class Country {
    private Long id;
    private String name;
    private Set<League> leagues;

    public Country() {
    }

    public Country(Long id, String name, Set<League> leagues) {
        this.id = id;
        this.name = name;
        this.leagues = leagues;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}
