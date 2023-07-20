package Car;

public class Strada extends Car{
    public Strada(String color) {
        super(color);
        this.isAutomatic = false;
        this.model = "Strada 2023";
        this.manufactor = "FIAT";
        this.fuelType = "gasoline";
    }
}
