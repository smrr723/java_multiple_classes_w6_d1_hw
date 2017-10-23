import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
   BusStop busstop;
   Bus bus;
   Person person;

   @Before
   public void before() {
      bus = new Bus("No.9");
      person = new Person();
      busstop = new BusStop("Glasgow")
   }

   @Test
   public void busHasName(){
      assertEquals("No.9", bus.getName());
   }

   @Test
   public void busStartsEmpty(){
      assertEquals(0, bus.passengerCount());
   }

   @Test
   public void canCollectPeople(){
      bus.collect(person);
      assertEquals(1, bus.passengerCount());
   }
   @Test
   public void addPeopleToBusStop(){

   }

   @Test
   public void canCollectAllFromBusStop(){
      bus.pickupAll(person);
      assertEquals
   }
}
