package Challange1Pets;

public class Pet {

    private String name;
    private int age;

    public Pet(){
       this.name = "";
       this.age = 0;
    }

    public Pet(String name, int age){
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        return "I am " + this.name + ",a " + this.age + " year old ";
    }
}
