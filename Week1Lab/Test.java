package Week1Lab;

/**
 * Created by abbyr on 25/09/2024
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Test
{
   public static void main(String[] args) {
      Building b1 = new Building();
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

   }
}//class
