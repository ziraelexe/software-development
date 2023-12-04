package vehicles;

public class Vehicles {

    private final String name;
    private final int speed;
    private final String brand;
    private final String colour;

    public Vehicles(String name, int speed, String brand, String colour) {
        this.name = name;
        this.speed = speed;
        this.brand = brand;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public String makeSound() {
        return String.format("%s goes wrommm wromm at %d !!!!!", this.getName(), this.getSpeed());
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Speed: %d, Brand: %s, Colour: %s", getName(), getSpeed(), getBrand(), getColour());
    }
}
