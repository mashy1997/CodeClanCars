package Customers;

import Cars.Car;

import java.util.ArrayList;

public class Customer {

    private double availableMoney;
    ArrayList<Car> listOfCars;

    public Customer(double availableMoney, ArrayList<Car> listOfCars){
        this.availableMoney = availableMoney;
        this.listOfCars = listOfCars;
    }

    public ArrayList<Car> getListOfCars() {
        return listOfCars;
    }

    public void addToListOfCars(Car car){
        listOfCars.add(car);
    }

    public double getAvailableMoney() {
        return availableMoney;
    }
}
