package com.company;

import java.sql.*;

public class Utils {

    public Connection connect() throws SQLException {

        String name = "postgres";
        String password = "osyourl";
        String url = "jdbc:postgresql://localhost:5432/postgres";
        return DriverManager.getConnection(url, name, password);
    }

    public void showMenu() {
        System.out.println("1. Добавить владельца");
        System.out.println("2. Добавит машину");
        System.out.println("3. Показать всех владельцев");
        System.out.println("4. Показать все машины");
        System.out.println("5. Показать все машины владельца");
        System.out.println("6. Показать все машины по цвету");
        System.out.println("7. Выход");
    }

    public void addOwner(String name, int age, int height) {
        try {
            Connection connection = connect();
            PreparedStatement preparedStatement = connection
                    .prepareStatement("INSERT INTO owner(name, age, height) VALUES (?, ?, ?)");
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setInt(3, height);
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public void addCar(int ownerId, int numberCar, String modelCar, String colorCar) {
        try {
            Connection connection = connect();
            PreparedStatement preparedStatement = connection
                    .prepareStatement("INSERT INT car(ownerId, numberCar, modelCar, colorCar) VALUES (?, ?, ?, ?)");
            preparedStatement.setInt(1, ownerId);
            preparedStatement.setInt(2, numberCar);
            preparedStatement.setString(3, modelCar);
            preparedStatement.setString(4, colorCar);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }


    public void showOwners() {
        try {
            Connection connection = connect();
            PreparedStatement preparedStatement = connection
                    .prepareStatement("SELECT * FROM owner ORDER BY id");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + ") " + resultSet.getString("name") + ", возраст: "
                        + resultSet.getInt("age") + ", рост: " + resultSet.getInt("height"));
            }

        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public void showCars() {
        try {
            Connection connection = connect();
            PreparedStatement preparedStatement = connection
                    .prepareStatement("SELECT * FROM car JOIN owner ON owner.id = car.owner_id ORDER BY car.id;");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + ") " + resultSet.getString("model") + ", цвет: "
                        + resultSet.getString("color") + ", гос.номер: " + resultSet.getInt("number") +
                        ", владелец: " + resultSet.getInt("owner_id") + " - " + resultSet.getString("name"));
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }


    public void showCarsOfOwner(int ownerId) {
        try {
            Connection connection = connect();
            PreparedStatement preparedStatementCheck = connection
                    .prepareStatement("SELECT COUNT(*) FROM car WHERE car.owner_id=?");
            preparedStatementCheck.setInt(1, ownerId);
            ResultSet resultSetCheck = preparedStatementCheck.executeQuery();
            resultSetCheck.next();
            int count = resultSetCheck.getInt("count");
            if (count == 0) {
                System.out.println("У владельца нет машин");
            } else {
                PreparedStatement preparedStatement = connection
                        .prepareStatement("SELECT * FROM car JOIN owner ON owner.id = car.owner_id WHERE owner.id=?");
                preparedStatement.setInt(1, ownerId);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt("id") + ") " + resultSet.getString("model") + ", цвет: "
                            + resultSet.getString("color") + ", гос.номер: " + resultSet.getInt("number") +
                            ", владелец: " + resultSet.getInt("owner_id") + " - " + resultSet.getString("name"));
                }
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public void showCarsByColor(String carColor) {
        try {
            Connection connection = connect();
            PreparedStatement preparedStatementCheck = connection
                    .prepareStatement("SELECT COUNT(*) FROM car WHERE car.color=?");
            preparedStatementCheck.setString(1, carColor);
            ResultSet resultSetCheck = preparedStatementCheck.executeQuery();
            resultSetCheck.next();
            int check = resultSetCheck.getInt("count");
            if (check == 0) {
                System.err.println("Машин такого цвета нет.");
            } else {
                PreparedStatement preparedStatement = connection
                        .prepareStatement("SELECT * FROM car JOIN owner ON owner.id = car.owner_id WHERE car.color=?");
                preparedStatement.setString(1, carColor);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt("id") + ") " + resultSet.getString("model") + ", цвет: "
                            + resultSet.getString("color") + ", гос.номер: " + resultSet.getInt("number") +
                            ", владелец: " + resultSet.getInt("owner_id") + " - " + resultSet.getString("name"));
                }
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
