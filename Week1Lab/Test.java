package Week1Lab;

import java.util.Random;
import java.util.Scanner;
/**
 * Created by abbyr on 25/09/2024
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Test
{
   private static int getRandomValue(int low, int high){
      Random random = new Random();
      return random.nextInt(high - low) + low;
   }


   public static void main(String[] args) {

      /**Building b1 = new Building();
      Building b2 = new Building("27 Main Street", "Rex Dog Groomer");
      Building b3 = new Building("18 Low Street", "Mary Jones");
      b1.setAddress("3 High Street, Smiths Newsagent");
      b1.setOwner("Smiths");
      System.out.println(b1);
      System.out.println(b2);
      System.out.println(b3);

      House h1 = new House();
      House h2 = new House("3 Main Street", "John Smith", 3, false);

      System.out.println(h2);

      Shop s1 = new Shop();
      Shop s2 = new Shop("2 Main Street", " Freds news", 3, 300);

      System.out.println(s2);

      h1.setAddress("30 Ballyway");
      h1.setOwner("Mereidth Grey");
      h1.setNumBedrooms(4);
      h1.setHasGarage(true);

      System.out.println(h1);

      s1.setAddress("30 Ballyway");
      s1.setOwner("Mereidth Grey");
      s1.setNumEmployees(4);
      s1.setAverageTurnover(8);

      System.out.println(s1);

      System.out.println(h1.getNumBedrooms());
      System.out.println(h1.getHasGarage());
      System.out.println(s1.getNumEmployees());
      System.out.println(s1.getAverageTurnover());

      House h3 = new House();
      House h4 = new House();
      Shop s3 =  new Shop();

      System.out.println("There are a total of " + Building.getNumBuildings() + " buildings of which " + House.getNumHouses() + " are houses and " + Shop.getNumShops() + " are shops.");
      */
      Building[] buildings = new Building[10];
      Scanner input = new Scanner(System.in);
      String address;
      int numBeds;
      boolean garage;
      String owner;

      for (int i = 0; i < 5; i++){
         address = " " + (31+i) + " Main street";
         numBeds = getRandomValue(1, 5);
         garage = (getRandomValue(1, 100) < 50);
         System.out.print("Enter the name of the owner > ");
         owner = input.next();
         buildings[i] = new House(address, owner, numBeds, false);
      }

      int turnover, employeees;

      for(int i = 5; i < 10; i++){
         address = "" + i + "Main Street ";
         turnover = getRandomValue(10000, 1000000 );
         employeees = getRandomValue(5, 50);
         System.out.print("Enter the name of the owner > ");
         owner = input.next();
         buildings[i] = new Shop(address, owner, employeees, turnover);
      }

      for(int i = 0; i < 10; i++){
         System.out.println(buildings[i]);
      }

      input.close();

   }
}//class
