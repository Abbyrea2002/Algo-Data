package Challange1Pets;

public class Dog extends Pet{

    private String breed;
    private static int numDogs = 0;

    public Dog(){
        //calling parent class
        super();
        //initialise variables
        this.breed = "";
        Dog.numDogs++;
    }//default constructor

    public Dog(String name, int age, String breed){
        //calling parent class
        super(name, age);
        //initialise variables
        this.breed = breed;
        Dog.numDogs++;
    }//overloaded constructed

    //gets and setters
    public String getBreed(){
        return this.breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public static int getNumDogs(){
        return numDogs;
    }

    //speak method
    public String speak(){
        return "Woof! " + super.toString() + this.breed;
    }

}
