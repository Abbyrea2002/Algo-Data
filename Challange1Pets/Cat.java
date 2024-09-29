package Challange1Pets;

public class Cat  extends Pet{//same as dog
  private String breed;
  private static int numCats = 0;
  private static String [] breeds = new String []{"Siamese", "Tuxedo", "Ragdoll", "Mainecoon", "British Short Hair"};
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

   public static String getRandomBreed(){

      // get random value from array
         // generate a random between 0 to size of array
         // return breed found at randomly generated index
      int randomNumber = UtilityMethods.getRandomValue(0, 4);
      return breeds[randomNumber];

   }


  public String speak(){
     return "Miaow! " + super.toString() + getRandomBreed();
  }

}
