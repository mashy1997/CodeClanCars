package Cars;

import Behaviours.IChargeable;

public class HybridCar extends Car implements IChargeable {
    private int chargePercentage;
    public HybridCar(int tyres, double price, String manufacturer, String colour, int chargePercentage){
        super(tyres, price, manufacturer, colour);
        this.chargePercentage = chargePercentage;
    }

    public int chargeCar(){
        int chargeAmount = Math.min((chargePercentage += 10), 100);
        this.chargePercentage = chargeAmount;
        return this.chargePercentage;

    }
}
