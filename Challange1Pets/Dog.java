package Challange1Pets;

public class Dog extends Pet{

    private String breed;
    private static int numDogs;

    public Dog(){
        super();
        this.breed = "";
        Dog.numDogs++;
    }

    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
        Dog.numDogs++;
    }

    public String getBreed(){
        return this.breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public static int getNumDogs(){
        return numDogs;
    }

    public String speak(){
        return "Woof! " + super.toString() + this.breed;
    }
}
