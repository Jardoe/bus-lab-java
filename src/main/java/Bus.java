import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int countPassengers() {
        return passengers.size();
    }

    public void addPassenger(Person person) {
        if (countPassengers() < capacity) {
            passengers.add(person);
        }
    }


    public Person removePassenger() {
        return passengers.remove(0);
    }


    public void pickUpPassenger(BusStop stop) {
       if (stop != null){
           Person p = stop.removePerson();
           addPassenger(p);
       }

    }
}
