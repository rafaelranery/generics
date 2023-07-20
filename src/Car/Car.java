package Car;

public abstract class Car implements ICar {
    protected String model;
    protected String manufactor;
    protected String fuelType;
    protected String color;
    private Long chassisNumber;
    protected Boolean isAutomatic;
    public Car(String color) {
        this.color = color;
        this.chassisNumber = (long) (Math.random() * 10000);
    }

    public Long getChassisNumber() {
        return chassisNumber;
    }

    @Override
    public void move() {
        System.out.println("The " + this.model +  " begun moving...");
    }

    @Override
    public void stop() {
        System.out.println("The " + this.model + " stopped.");
    }

    @Override
    public void refuel() {
        System.out.println("The " + this.model + " is being re-fuelled with " + this.fuelType);
    }

    @Override
    public String toString() {
        return this.manufactor + " " + this.model + " \nChassis: " + this.chassisNumber + '\n';
    }
}
