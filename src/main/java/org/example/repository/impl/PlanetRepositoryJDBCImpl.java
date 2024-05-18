package org.example.repository.impl;

import org.example.entity.Planet;
import org.example.repository.PlanetRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlanetRepositoryJDBCImpl implements PlanetRepository {
    @Override
    public List<Planet> findAll() {
        List<Planet> resultList = new ArrayList<>();
        String url = "jdbc:postgresql://localhost:5433/postgres";
        String username = "aston";
        String password = "aston";
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM planet");
            while (resultSet.next()) {
                resultList.add(new Planet(
                        resultSet.getString(1),
                        resultSet.getInt(2),
                        resultSet.getDouble(3)));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return resultList;
    }
}
