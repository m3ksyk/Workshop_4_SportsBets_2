package pl.coderslab.dao;

import pl.coderslab.model.User;
import pl.coderslab.util.DbUtil;
import pl.coderslab.web.UserDto;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDao {
    private static final String CREATE_USER_QUERY =
            "INSERT INTO users(id, name,email,password) VALUES (?,?,?,?)";

    public static UserDto create(UserDto user) {
        try (Connection connection = DbUtil.getConnection();
             PreparedStatement statement =
                     connection.prepareStatement(CREATE_USER_QUERY);) {
            statement.setLong(1, user.getId());
            statement.setString(2, user.getUserName());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getPassword());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }
        return user;
    }

}
