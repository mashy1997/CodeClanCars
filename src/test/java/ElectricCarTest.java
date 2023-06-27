import Cars.Car;
import Cars.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;

    @Before
    public void before(){
        electricCar = new ElectricCar(4, 10000, "BMW", "Pink", 56);
    }

    @Test
    public void canDrive(){
        assertEquals("I am starting to drive now!!!", electricCar.drive());
    }

    @Test
    public void canGetManufacturer(){
        electricCar.setManufacturer("Tesla");
        assertEquals("Tesla", electricCar.getManufacturer());
    }

    @Test
    public void canChargeCar(){
        electricCar.chargeCar();
        assertEquals(66, electricCar.chargePercentage());
    }

    @Test
    public void canChargeCarTo100Percent(){
        electricCar.chargeCar();
        electricCar.chargeCar();
        electricCar.chargeCar();
        electricCar.chargeCar();
        electricCar.chargeCar();
        assertEquals(100, electricCar.chargePercentage());
    }
}
