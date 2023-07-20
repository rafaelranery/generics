package Car;

public class ModelS extends Car{
    public ModelS(String color) {
        super(color);
        this.isAutomatic = true;
        this.model = "Model S 2023";
        this.manufactor = "Tesla";
        this.fuelType = "electricity";
    }
}
