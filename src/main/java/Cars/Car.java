package Cars;

public abstract class Car {

    private String engine;
    private int tyres;
    private double price;
    private String manufacturer;
    private String colour;

    public Car(int tyres, double price, String manufacturer, String colour){
        this.tyres = tyres;
        this.price = price;
        this.manufacturer = manufacturer;
        this.colour = colour;
    }

    public String drive(){
        return "I am starting to drive now!!!";
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
