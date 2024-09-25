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

   }
}//class
