public class Bus{
   private String name;
   private Person[] passengers;

   public Bus(String name){
      this.name = name;
      this.passengers = new Person[25];
   }

   public String getName(){
      return this.name;
   }

   public int passengerCount(){
      int count = 0;
      for(Person person : this.passengers){
         if (person != null) {
            count++;
         }
      }
      return count;
   }
// collects a single person
   public void collect(Person person){
      if(!isBusFull()){
         int passengerCount = passengerCount();
         this.passengers[passengerCount] = person;
      }
   }

// uses the BusStop and collects people from there.
   public void pickupAll(BusStop person){
      if(!isBusFull()){
         int passengerCount = passengerCount() + queueCount();
         this.passengers[passengerCount] = person;
      }
   }


   public boolean isBusFull(){
      return passengerCount() == passengers.length;

   }

}
