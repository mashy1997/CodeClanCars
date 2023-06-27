package Cars;

import Behaviours.IChargeable;

public class ElectricCar extends Car implements IChargeable {

    private int chargePercentage;
    public ElectricCar(int tyres, double price, String manufacturer, String colour, int chargePercentage){
        super(tyres, price, manufacturer, colour);
        this.chargePercentage = chargePercentage;
    }

    public int chargePercentage() {
        return this.chargePercentage;
    }

    public int chargeCar(){
            int chargeAmount = Math.min((chargePercentage += 10), 100);
            this.chargePercentage = chargeAmount;
            return this.chargePercentage;
    }


}
