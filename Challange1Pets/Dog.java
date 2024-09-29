package Challange1Pets;

import java.util.Arrays;

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

    public static String[] getRandomStringDog(){

        int r = (int) (Math.random()*5);
        String dogBreed = Arrays.toString(new String []{"Yorkie", "Lab", "Bull", "Jack Russel", "Huskie"});

        return new String[]{dogBreed};


    };

    //speak method
    public String speak(){
        return "Woof! " + super.toString() + getRandomStringDog();
    }

}
