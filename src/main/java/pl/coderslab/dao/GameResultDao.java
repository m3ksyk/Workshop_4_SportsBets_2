package pl.coderslab.dao;

import pl.coderslab.model.GameResult;
import pl.coderslab.util.DbUtil;
import pl.coderslab.web.GameResultDto;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class GameResultDao {
    // SQL queries
    private static final String CREATE_GAMERESULT_QUERY =
            "INSERT INTO gameresults(id, leaguename, date, hometeamname, awayteamname, hometeamscore, awayteamscore) " +
                    "VALUES (?,?,?,?,?,?,?)";
    public static GameResultDto create(GameResultDto gameResult) {

        try (Connection connection = DbUtil.getConnection();
             PreparedStatement statement =
                     connection.prepareStatement(CREATE_GAMERESULT_QUERY);) {
            statement.setLong(1, gameResult.getMatchId());
            statement.setString(2, gameResult.getLeagueName());
            statement.setString(3,  gameResult.getDate());
            statement.setString(4,gameResult.getHomeTeamName());
            statement.setString(5,gameResult.getAwayTeamName());
            statement.setInt(6,gameResult.getHomeTeamScore());
            statement.setInt(7,gameResult.getAwayTeamScore());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }
        return gameResult;
    }
}
