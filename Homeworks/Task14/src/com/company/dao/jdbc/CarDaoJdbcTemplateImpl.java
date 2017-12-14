package com.company.dao.jdbc;

import com.company.dao.CarDao;
import com.company.models.Car;

import java.util.List;

public class CarDaoJdbcTemplateImpl implements CarDao {
    @Override
    public List<Car> findAllByColor(String color) {
        return null;
    }

    @Override
    public void save(Car model) {

    }

    @Override
    public Car find(int id) {
        return null;
    }

    @Override
    public void update(Car model) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Car> findAll() {
        return null;
    }
}