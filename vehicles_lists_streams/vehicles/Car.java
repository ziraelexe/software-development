package vehicles;

public class Car extends Vehicles {

    private final boolean selfdriving;

    public Car(String name, int speed, String brand, String colour, boolean selfdriving) {
        super(name, speed, brand, colour);
        this.selfdriving = false;
    }
    public String makeSound() {
        return super.makeSound();
    }

    @Override
    public String toString() {
        return String.format("Car - %s, Self-Driving: %s", super.toString(), selfdriving);
    }
}
