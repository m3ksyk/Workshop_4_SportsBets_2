package pl.coderslab.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import pl.coderslab.util.DbUtil;
import pl.coderslab.web.GameResultDto;
import pl.coderslab.web.StandingsDto;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StandingsDao {
    private static final String CREATE_STANDING_QUERY =
            "INSERT INTO standings(leaguename, teamname, leagueposition) " +
                    "VALUES (?,?,?)";
    public static StandingsDto create(StandingsDto standing) {

        try (Connection connection = DbUtil.getConnection();
             PreparedStatement statement =
                     connection.prepareStatement(CREATE_STANDING_QUERY);) {
            statement.setString(1, standing.getLeagueName());
            statement.setString(2, standing.getTeamName());
            statement.setLong(3, standing.getPosition());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }
        return standing;
    }
}
