package carshop;

import list.LinkedList;
import vehicles.*;

import java.util.Iterator;

public class CarShop {

    public static void main(String[] args) {
        // Create LinkedLists
        LinkedList<Vehicles> vehiclesList = new LinkedList<>();
        LinkedList<Car> carList = new LinkedList<>();
        LinkedList<Boat> boatList = new LinkedList<>();
        LinkedList<Motorcycle> motorcycleList = new LinkedList<>();

        // Add vehicles to the vehiclesList
        vehiclesList.add(new Car("BMW", 100, "brand 1", "blue", false));
        vehiclesList.add(new Boat("Speedboat", 200, "brand 3", "skypink", true));
        vehiclesList.add(new Motorcycle("KTM", 3000000, "brand 2", "nightblack", 2));

        // Add more vehicles to the vehiclesList
        vehiclesList.add(new Car("Audi", 120, "brand 4", "red", false));
        vehiclesList.add(new Boat("Yacht", 180, "brand 5", "white", false));
        vehiclesList.add(new Motorcycle("Harley-Davidson", 2000000, "brand 6", "black", 2));

        // Add vehicles from the vehiclesList to their respective specialized lists
        addCarsFromVehiclesList(vehiclesList, carList);
        addBoatsFromVehiclesList(vehiclesList, boatList);
        addMotorcyclesFromVehiclesList(vehiclesList, motorcycleList);

        // Print the contents of each list using the iterators
        System.out.println("Cars:");
        Iterator<Car> carIterator = carList.carIterator();
        while (carIterator.hasNext()) {
            Car car = carIterator.next();
            System.out.println(car);
        }

        System.out.println("\nBoats:");
        Iterator<Boat> boatIterator = boatList.boatIterator();
        while (boatIterator.hasNext()) {
            Boat boat = boatIterator.next();
            System.out.println(boat);
        }

        System.out.println("\nMotorcycles:");
        Iterator<Motorcycle> motorcycleIterator = motorcycleList.motorcycleIterator();
        while (motorcycleIterator.hasNext()) {
            Motorcycle motorcycle = motorcycleIterator.next();
            System.out.println(motorcycle);
        }
    }

    private static void addCarsFromVehiclesList(LinkedList<? extends Vehicles> vehiclesList, LinkedList<Car> carList) {
        for (Vehicles vehicle : vehiclesList) {
            if (vehicle instanceof Car) {
                carList.add((Car) vehicle);
            }
        }
    }

    private static void addBoatsFromVehiclesList(LinkedList<? extends Vehicles> vehiclesList, LinkedList<Boat> boatList) {
        for (Vehicles vehicle : vehiclesList) {
            if (vehicle instanceof Boat) {
                boatList.add((Boat) vehicle);
            }
        }
    }

    private static void addMotorcyclesFromVehiclesList(LinkedList<? extends Vehicles> vehiclesList, LinkedList<Motorcycle> motorcycleList) {
        for (Vehicles vehicle : vehiclesList) {
            if (vehicle instanceof Motorcycle) {
                motorcycleList.add((Motorcycle) vehicle);
            }
        }
    }
}
