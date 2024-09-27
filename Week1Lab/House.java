package Week1Lab;

/**
 * Created by abbyr on 25/09/2024
 * COMMENTS ABOUT PROGRAM HERE
 */
public class House extends Building /** Building subclass */
{
   private int numBedrooms;
   private boolean hasGarage;
   private static int numHouses = 0; /** static variable belongs to the class*/
   public House(){
      /** default constructor calls super class and initalises instance variables*/
      super();
      this.numBedrooms = 0;
      this.hasGarage = false;
      House.numHouses++;
   }
   public House(String address, String owner,int numbBedrooms, boolean hasGarage){
      /** overload constructor all variables passed in call super and update house variables */
      super(address, owner);
      this.numBedrooms = numBedrooms;
      this.hasGarage = hasGarage;
      House.numHouses++;
   }

   public int getNumBedrooms(){
      return this.numBedrooms;
   }

   public void setNumBedrooms(int numBedrooms){
      this.numBedrooms = numBedrooms;
   }

   public boolean getHasGarage(){
      return this.hasGarage;
   }

   public void setHasGarage(boolean hasGarage){
      this.hasGarage = hasGarage;
   }

   public static int getNumHouses(){
      return numHouses;
   }

   public String toString(){

      return super.toString() + " this house contains " + this.numBedrooms + " bedrooms";
   }



}//class
