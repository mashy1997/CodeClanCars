import Cars.Car;
import Cars.ElectricCar;
import Cars.HybridCar;
import Customers.Customer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    HybridCar ferrari;
    ArrayList<Car> listOfCars;

    @Before
    public void before(){
        ferrari = new HybridCar(4, 3000000, "ferrari", "red", 80);
        ArrayList<Car> listOfCars = new ArrayList<>();
        listOfCars.add(ferrari);
        customer = new Customer(10000, listOfCars);
    }

    @Test
    public void canAddToListOfCars(){
        customer.addToListOfCars(new ElectricCar(4,3000,"Toyota", "blue", 66));
//        listOfCars.(new ElectricCar(4,3000,"Toyota", "blue", 40));
        assertEquals(2, customer.getListOfCars().size());
    }
}
