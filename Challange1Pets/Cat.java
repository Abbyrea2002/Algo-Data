package Challange1Pets;

public class Cat  extends Pet{
  private String breed;

  public Cat(){
      super();
      this.breed = "";
  }

  public Cat( String name, int age, String breed){
      super(name, age);
      this.breed = breed;
  }

  public String getBreed(){
        return this.breed;
  }

  public void setBreed(String breed){
      this.breed = breed;
  }

  public String toString(){
     return "Miaow! " + super.toString() + this.breed;
  }

}
