import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    Person person;
    BusStop busStop;

    @Before
    public void before(){
        person = new Person();
        busStop = new BusStop("Castle Terrace");
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addPerson(person);
        assertEquals(1, busStop.countPersons());
    }

    @Test
    public void canRemovePersonFromQueue() {
        busStop.addPerson(person);
        busStop.removePerson();
        assertEquals(0, busStop.countPersons());
    }
}
