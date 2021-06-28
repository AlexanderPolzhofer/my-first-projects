package at.campus.jdbc.firstProject.dao;

import at.campus.jdbc.firstProject.model.Car;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarDAO {

    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();

        try {

            Connection con = getDBConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from firstProjectCars");
            while (rs.next()) {
                Car c = new Car(rs.getInt(1), rs.getString(2), rs.getString(4), rs.getDouble(3));
                cars.add(c);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return cars;
    }

    private Connection getDBConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Cars", "caruser", "caruser");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public void addCar(Car car) {
        try {

            Connection con = getDBConnection();
            Statement stmt = con.createStatement();
            String sql = "insert into firstProjectCars (model, brand, price) values ('" + car.getModel() + "','" + car.getBrand() + "'," + car.getPrice() + ")";
            boolean result = stmt.execute(sql);

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteCar(int id){
        try {
            Connection con = getDBConnection();
            Statement stmt = con.createStatement();
            String sql = "delete from firstProjectCars where id = " + id;
            boolean result = stmt.execute(sql);

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
