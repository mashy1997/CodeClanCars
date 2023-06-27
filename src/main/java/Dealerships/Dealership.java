package Dealerships;

import Cars.Car;

import java.util.ArrayList;

public class Dealership {

    private double moneyInTill;
    private ArrayList<Car> listOfCars;

    public Dealership(double moneyInTill, ArrayList<Car> listOfCars){
        this.moneyInTill = moneyInTill;
        this.listOfCars = listOfCars;
    }
}
