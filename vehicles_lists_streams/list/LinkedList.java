package list;

import vehicles.Boat;
import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.Vehicles;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class LinkedList<T> implements List<T>, Iterable<T> {

    private static class Node<T> {
        final T value;
        Node next;

        Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }

        Node(T value) {
            this(value, null);
        }

    }

    private Node<T> head = null;
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T value) {
        head = new Node<>(value, head);
        size++;
    }

    @Override
    public boolean contains(Object obj) {
        Node<T> current = head;
        while (current != null) {
            if (obj.equals(current.value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("No more element to go to!");
                }
                T value = current.value;
                current = current.next;
                return value;
            }
        };
    }

    public Iterator<Car> carIterator() {
        return new CarIterator();
    }

    private class CarIterator implements Iterator<Car> {
        private Node<T> current;

        CarIterator() {
            current = head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Car next() {
            if (!hasNext()) {
                throw new NoSuchElementException("There are no more cars!");
            }
            Car car = (Car) current.value;
            current = current.next;
            return car;
        }
    }

    public Iterator<Motorcycle> motorcycleIterator() {
        return new MotorcycleIterator();
    }

    private class MotorcycleIterator implements Iterator<Motorcycle> {
        private Node<T> current;

        MotorcycleIterator() {
            current = head;
        }

        public boolean hasNext() {
            return current != null;
        }

        public Motorcycle next() {
            if (!hasNext()) {
                throw new NoSuchElementException("There are no more motorcycles!");
            }
            Motorcycle motorcycle = (Motorcycle) current.value;
            current = current.next;
            return motorcycle;
        }
    }

    public Iterator<Boat> boatIterator() {
        return new BoatIterator();
    }

    private class BoatIterator implements Iterator<Boat> {
        private Node<T> current;

        BoatIterator() {
            current = head;
        }

        public boolean hasNext() {
            return current != null;
        }

        public Boat next() {
            if (!hasNext()) {
                throw new NoSuchElementException("There are no more boats!");
            }
            Boat boat = (Boat) current.value;
            current = current.next;
            return boat;
        }
    }

    public Iterator<? extends Vehicles> vehiclesIterator() {
        return new VehiclesIterator();
    }

    private class VehiclesIterator implements Iterator<Vehicles> {
        private Node<T> current;

        VehiclesIterator() {
            current = head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        public Vehicles next() {
            if(!hasNext()) {
                throw new NoSuchElementException("There are no more vehicles!");
            }
            Vehicles vehicles = (Vehicles) current.value;
            current = current.next;
            return vehicles;
        }
    }
}
