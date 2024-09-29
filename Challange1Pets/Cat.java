package Challange1Pets;

import java.util.Arrays;

public class Cat  extends Pet{//same as dog
  private String breed;
  private static int numCats = 0;

  public Cat(){
      super();
      this.breed = "";
      Cat.numCats++;
  }

  public Cat( String name, int age, String breed){
      super(name, age);
      this.breed = breed;
     Cat.numCats++;
  }

  public String getBreed(){
        return this.breed;
  }

  public void setBreed(String breed){
      this.breed = breed;
  }

  public static int getNumCats(){
     return numCats;
  }

   public static String[] getRandomStringCat(){

      int r = (int) (Math.random()*5);
      String catBreed = Arrays.toString(new String []{"Siamese", "Tuxedo", "Ragdoll", "Mainecoon", "British Short Hair"});

      return new String[]{catBreed};

   };

  public String speak(){
     return "Miaow! " + super.toString() + getRandomStringCat();
  }

}
