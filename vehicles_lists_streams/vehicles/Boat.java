package vehicles;

public class Boat extends Vehicles {

    private final boolean speedboat;

    public Boat(String name, int speed, String brand, String colour, boolean speedboat) {
        super(name, speed, brand, colour);
        this.speedboat = false;
    }

    @Override
    public String makeSound() {
        return String.format("%s goes sploosh sploosh at %d", this.getName(), this.getSpeed());
    }

    public String toString() {
        return String.format("Boat - %s, Speedboat: %s", super.toString(), speedboat);
    }
}
