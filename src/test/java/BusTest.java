import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("CodeClan", 2);
        person = new Person();
    }

    @Test
    public void checkNumberOfPassengersIsZero(){
        assertEquals(0, bus.countPassengers());
    }

    @Test
    public void checkNumberOfPassengersis1() {
        bus.addPassenger(person);
        assertEquals(1, bus.countPassengers() );
    }

    @Test
    public void canAddIfNotFull() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(2, bus.countPassengers());
    }

    @Test
    public void canRemovePassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.countPassengers());
        bus.removePassenger();
        assertEquals(0, bus.countPassengers());
    }

    @Test
    public void canPickUpPassenger() {
       bus.pickUpPassenger(busStop);
       assertEquals(1, bus.countPassengers());
    }

}

