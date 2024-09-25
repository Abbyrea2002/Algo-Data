package Week1Lab;

/**
 * Created by abbyr on 25/09/2024
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Shop
{
   private int numEmployees;
   private int averageTurnover;

   public Shop(){
      /** default constructor calls super class and initalises instance variables*/
      super();
      this.numEmployees = 0;
      this.averageTurnover = 0;
   }
   public Shop(String address, String owner,int numEmployees, int averageTurnover){
      /** overload constructor all variables passed in call super and update house variables */
      super(address, owner);
      this.numEmployees = numEmployees;
      this.averageTurnover = averageTurnover;

   }

   public int getNumEmployees(){
      return this.numEmployees;
   }

   public void setNumEmployees(int numEmployees){
      this.numEmployees = numEmployees;
   }

   public int getAverageTurnover(){
      return this.averageTurnover;
   }

   public void setAverageTurnover(int averageTurnover){
      this.averageTurnover = averageTurnover;
   }

   public String toString(){

      return super.toString() + " this shop has " + this.numEmployees + " Employees, with an average turnover of " + this.averageTurnover ;
   }
}//class
