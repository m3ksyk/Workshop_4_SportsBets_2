package pl.coderslab.web;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Service;

@Service
@JsonIgnoreProperties(ignoreUnknown = true)
public class LastMatchDto {
    @JsonProperty("match_id")
    private long matchId;
    @JsonProperty("match_date")
    private String date;
    @JsonProperty("match_hometeam_name")
    private String homeTeamName;
    @JsonProperty("match_hometeam_score")
    private int homeTeamScore;
    @JsonProperty("match_awayteam_name")
    private String awayTeamName;
    @JsonProperty("match_awayteam_score")
    private int awayTeamScore;

    public LastMatchDto() {
    }

    public LastMatchDto(long matchId, String date, String homeTeamName, int homeTeamScore, String awayTeamName, int awayTeamScore) {
        this.matchId = matchId;
        this.date = date;
        this.homeTeamName = homeTeamName;
        this.homeTeamScore = homeTeamScore;
        this.awayTeamName = awayTeamName;
        this.awayTeamScore = awayTeamScore;
    }

    public long getMatchId() {
        return matchId;
    }

    public void setMatchId(long matchId) {
        this.matchId = matchId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    public int getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(int homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }

    public int getAwayTeamScore() {
        return awayTeamScore;
    }

    public void setAwayTeamScore(int awayTeamScore) {
        this.awayTeamScore = awayTeamScore;
    }

    @Override
    public String toString() {
        return "LastMatchDto:" +
                "matchId= " + matchId +
                ", date= " + date +
                ", homeTeamName= " + homeTeamName +
                ", homeTeamScore= " + homeTeamScore +
                ", awayTeamName= " + awayTeamName +
                ", awayTeamScore= " + awayTeamScore + " ";
    }
}
