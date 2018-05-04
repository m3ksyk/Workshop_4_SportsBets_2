package pl.coderslab.dao;

import pl.coderslab.model.Country;
import pl.coderslab.util.DbUtil;
import pl.coderslab.web.CountryDto;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CountryDao {
    // SQL queries
    private static final String CREATE_COUNTRY_QUERY =
            "INSERT INTO countries(id, name) VALUES (?,?)";
//add leagues insertion to the statement
    public static CountryDto create(CountryDto country) {

        try (Connection connection = DbUtil.getConnection();
             PreparedStatement statement =
                     connection.prepareStatement(CREATE_COUNTRY_QUERY);) {
            statement.setLong(1, country.getApiCountryId());
            statement.setString(2, country.getName());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }
        return country;
    }
}
