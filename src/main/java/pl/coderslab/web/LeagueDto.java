package pl.coderslab.web;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Service;

@Service
@JsonIgnoreProperties(ignoreUnknown = true)
public class LeagueDto {
    @JsonProperty("country_id")
    long apiCountryId;
    @JsonProperty("country_name")
    String apiCountryName;
    @JsonProperty("league_id")
    long apiLeagueId;
    @JsonProperty("league_name")
    String apiLeagueName;

    public LeagueDto() {
    }

    public LeagueDto(long apiLeagueId, String apiLeagueName) {
        this.apiLeagueId = apiLeagueId;
        this.apiLeagueName = apiLeagueName;
    }
        public LeagueDto(long apiCountryId, String apiCountryName, long apiLeagueId, String apiLeagueName) {
        this.apiCountryId = apiCountryId;
        this.apiCountryName = apiCountryName;
        this.apiLeagueId = apiLeagueId;
        this.apiLeagueName = apiLeagueName;
    }

    public long getApiCountryId() {
        return apiCountryId;
    }

    public void setApiCountryId(long apiCountryId) {
        this.apiCountryId = apiCountryId;
    }

    public String getApiCountryName() {
        return apiCountryName;
    }

    public void setApiCountryName(String apiCountryName) {
        this.apiCountryName = apiCountryName;
    }

    public long getApiLeagueId() {
        return apiLeagueId;
    }

    public void setApiLeagueId(long apiLeagueId) {
        this.apiLeagueId = apiLeagueId;
    }

    public String getApiLeagueName() {
        return apiLeagueName;
    }

    public void setApiLeagueName(String apiLeagueName) {
        this.apiLeagueName = apiLeagueName;
    }

    @Override
    public String toString() {
        return "LeagueDto: " +
                "apiCountryId= " + apiCountryId +
                ", apiCountryName= " + apiCountryName  +
                ", apiLeagueId= " + apiLeagueId +
                ", apiLeagueName= " + apiLeagueName + " ";
    }
}

