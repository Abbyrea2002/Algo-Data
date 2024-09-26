package Week1Lab;

/**
 * Created by abbyr on 25/09/2024
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Building {
   private String address;
   private String owner;
   private static int numBuildings = 0;

   public Building() {
      this.address = "";
      this.owner = "";
      Building.numBuildings++;
   }

   public Building(String address, String owner) {
      this.address = address;
      this.owner = owner;
      Building.numBuildings++;
   }

   public String getAddress() {
      return this.address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getOwner() {
      return this.owner;
   }

   public void setOwner(String owner) {
      this.owner = owner;
   }

   public static int getNumBuildings(){
      return numBuildings;
   }

   public String toString() {
      return this.address + " occupied by " + this.owner;
   }

   public static void main(String[] args) {
      Building b1 = new Building();
      Building b2 = new Building("27 Main Street", "Rex Dog Groomer");
      Building b3 = new Building("18 Low Street", "Mary Jones");
      b1.setAddress("3 High Street, Smiths Newsagent");
      b1.setOwner("Smiths");
      System.out.println(b1);
      System.out.println(b2);
      System.out.println(b3);
   }
}

