package Challange1Pets;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.List;
public class Test {

   private List<Pet> pets;
    public static int getRandomValue(int low, int high){
        Random random = new Random();
        return random.nextInt(high - low)+ low;
    }//get random value method for age of pet

    public static String[] getRandomStringCat(){

       int r = (int) (Math.random()*5);
       String catBreed = Arrays.toString(new String []{"Siamese", "Tuxedo", "Ragdoll", "Mainecoon", "British Short Hair"});

       return new String[]{catBreed};

    }; //gets random string from array (what im having issues with)
   //fixed the errors but might still be issues as output is null

   public static String[] getRandomStringDog(){

      int r = (int) (Math.random()*5);
      String dogBreed = Arrays.toString(new String []{"Yorkie", "Lab", "Bull", "Jack Russel", "Huskie"});

      return new String[]{dogBreed};


   };// same as above method


//   public void displayCounts(){
//      int catCount = 0;
//      int dogCount = 0;
//
//      for(Pet pet: pets)
//   }

    public static void main (String[] args) {
//        Pet p1 = new Pet();
//        Pet p2 = new Pet("teddy", 9);
//        Pet p3 = new Pet("Mereidith", 4);
//
//        p1.setName("luna");
//        p1.setAge(7);
//
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//
//        Cat c1 = new Cat();
//        Cat c2 = new Cat("Abby", 6, "Siamese");
//
//        c1.setName("Jax");
//        c1.setAge(3);
//        c1.setBreed("Tuxedo");
//
//        System.out.println(c1);
//        System.out.println(c2);
//
//        Dog d1 = new Dog();
//        Dog d2 = new Dog("George", 6, "yorkie");
//
//        d1.setName("alfie");
//        d1.setAge(6);
//        d1.setBreed("terrior");
//
//        System.out.println(d1);
//        System.out.println(d2);
//
//        System.out.println(c1.getBreed());
//        System.out.println(d1.getBreed());

       //cat and dog array (need to fix)
       //user should only inout 5 pets, different type of array?? one array?cat
          //changed to one array
          Pet[] pets = new Pet[5];
          Scanner input = new Scanner(System.in);
          //variables
          String name, species;
          int age;
          String breed;

          //for loop to iterate over inside code x5(thats how many times the user needs to input a pet for the arrays)
          for(int i = 0; i < 5; i++){
             //prompts for what species theyd like to enter, stores in variable 'species'
              System.out.println("Would you like add a cat or dog?");
              species = input.next();
              //prompts for pet name, stores in variable 'name'
              System.out.println("What is the pets name?");
              name = input.next();

              //if species is cat
              if(species == "cat"){
                 //calls random value method, generates and stores in age
                 age = getRandomValue(1, 14);
                 //calls random string, generates and stores in breed (maybe issues)
                 breed = Arrays.toString(getRandomStringCat());
                 //adds attributes into array
                 pets[i] = new Cat(name, age, breed);


               //if dog
              }else if(species == "dog"){
                 //calls random value method, generates and stores in age
                 age = getRandomValue(1, 14);
                 //calls random string, generates and stores in breed (maybe issues)
                 breed = Arrays.toString(getRandomStringDog());
                 //adds attributes into array (possible issues as outputting null)
                 pets[i] = new Dog(name, age, breed);

              }

          }

          //for loop iterates 5 times to output arrays (dont actually need test)


         System.out.println("Number of cats entered: " + Cat.getNumCats());
         System.out.println("Number of dogs entered: " + Dog.getNumDogs());
         String name2 = "";
         do{
            System.out.println("Please enter the name of your pet: ");
            name2 = input.next();



         }while(name2 != "exit");








    }
}
