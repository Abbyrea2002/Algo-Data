package Challange1Pets;

public class Cat  extends Pet{
  private String breed;
  private static int numCats;

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

  public String speak(){
     return "Miaow! " + super.toString() + this.breed + " Number of cats:" + numCats;
  }

}
