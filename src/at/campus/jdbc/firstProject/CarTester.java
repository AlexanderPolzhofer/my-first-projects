package at.campus.jdbc.firstProject;

import at.campus.jdbc.firstProject.dao.CarDAO;
import at.campus.jdbc.firstProject.model.Car;

import java.util.List;

public class CarTester {
    public static void main(String[] args) {

        CarDAO dao = new CarDAO();
        Car carEQC = new Car(0, "EQC", "Mercedes Benz", 80235.49);
        Car carCLS = new Car(0,"CLS","Mercedes Benz",120000);

        List<Car> cars = dao.getAllCars();


        for (Car car : cars) {
            System.out.println(car.getId() + " -|- " + car.getModel() + " -|- " + car.getBrand() + " -|- " + car.getPrice());
        }






    }
}
