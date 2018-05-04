package pl.coderslab.dao;

import pl.coderslab.util.DbUtil;
import pl.coderslab.web.LeagueDto;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class LeagueDao {
    private static final String CREATE_LEAGUE_QUERY =
        "INSERT INTO leagues(id, name, sport, country) " +
                "VALUES (?,?,?,?)";

    public static LeagueDto create(LeagueDto league) {
        try (Connection connection = DbUtil.getConnection();
             PreparedStatement statement =
                     connection.prepareStatement(CREATE_LEAGUE_QUERY);) {
            statement.setLong(1, league.getApiLeagueId());
            statement.setString(2, league.getApiLeagueName());
            statement.setLong(3, league.getApiCountryId());
            statement.setString(4, league.getApiCountryName());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }
        return league;
    }
}
