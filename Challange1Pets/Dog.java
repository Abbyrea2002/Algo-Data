package Challange1Pets;

public class Dog extends Pet{

    private String breed;

    public Dog(){
        super();
        this.breed = "";
    }

    public Dog(String name, int age, String breed){
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
        return "Woof! " + super.toString() + this.breed;
    }
}
