package vehicles;

public class Motorcycle extends Vehicles {

    private final int wheels;

    public Motorcycle(String name, int speed, String brand, String colour, int wheels) {
        super(name, speed, brand, colour);
        this.wheels = wheels;
    }
    public String makeSound() {
        return super.makeSound();
    }

    @Override
    public String toString() {
        return String.format("Motorcycle - %s, Wheels: %d", super.toString(), wheels);
    }
}
