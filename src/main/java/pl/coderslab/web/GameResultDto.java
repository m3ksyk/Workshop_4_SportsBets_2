package pl.coderslab.web;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Service;

@Service
@JsonIgnoreProperties(ignoreUnknown = true)
public class GameResultDto {
    @JsonProperty("match_id")
    private long matchId;
    @JsonProperty("league_name")
    private String leagueName;
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

    public GameResultDto() {
    }

    public GameResultDto(long matchId, String leagueName, String date, String homeTeamName,
                         int homeTeamScore, String awayTeamName, int awayTeamScore) {
        this.matchId = matchId;
        this.leagueName = leagueName;
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

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
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
        return "GameResult:" +
                "matchId= " + matchId +
                ", leagueName= " + leagueName +
                ", date= " + date +
                ", homeTeamName= " + homeTeamName +
                ", homeTeamScore= " + homeTeamScore +
                ", awayTeamName= " + awayTeamName +
                ", awayTeamScore= " + awayTeamScore + " ";
    }
}