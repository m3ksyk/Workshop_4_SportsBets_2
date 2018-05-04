package pl.coderslab.dao;

import pl.coderslab.util.DbUtil;
import pl.coderslab.web.TeamDto;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TeamDao {

    private static final String CREATE_TEAM_QUERY =
            "INSERT INTO teams(name) VALUES (?)";
    public static TeamDto create(TeamDto team) {
        try (Connection connection = DbUtil.getConnection();
             PreparedStatement statement =
                     connection.prepareStatement(CREATE_TEAM_QUERY);) {
            statement.setString(1, team.getTeamName());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }
        return team;
    }
}
