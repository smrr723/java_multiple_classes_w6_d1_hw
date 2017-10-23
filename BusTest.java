import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
   Bus bus;
   Person person;

   @Before
   public void before() {
      bus = new Bus("No.9");
      person = new Person();
   }

   @Test
   public void hasName(){
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
}
