package pl.coderslab.dao;

import pl.coderslab.util.DbUtil;
import pl.coderslab.web.SportDto;
import pl.coderslab.web.UserDto;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SportDao {
    private static final String CREATE_SPORT_QUERY =
            "INSERT INTO sports(id, name) VALUES (?,?)";

    public static SportDto create(SportDto sport) {
        try (Connection connection = DbUtil.getConnection();
             PreparedStatement statement =
                     connection.prepareStatement(CREATE_SPORT_QUERY);) {
            statement.setLong(1, sport.getId());
            statement.setString(2, sport.getName());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }
        return sport;
    }

}
