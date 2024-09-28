package Challange1Pets;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {

    public static int getRandomValue(int low, int high){
        Random random = new Random();
        return random.nextInt(high - low)+ low;
    }

    public static String[] getRandomStringCat(){

       int r = (int) (Math.random()*5);
       String catBreed = Arrays.toString(new String []{"Siamese", "Tuxedo", "Ragdoll", "Mainecoon", "British Short Hair"});

       return new String[]{catBreed};

    };
   public static String[] getRandomStringDog(){

      int r = (int) (Math.random()*5);
      String dogBreed = Arrays.toString(new String []{"Yorkie", "Lab", "Bull", "Jack Russel", "Huskie"});

      return new String[]{dogBreed};

   };

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

          Cat[] cats = new Cat[5];
          Dog[] dogs = new Dog[5];
          Scanner input = new Scanner(System.in);
          String name, species;
          int age;
          String breed;

          for(int i = 0; i < 5; i++){
              System.out.println("Would you like add a cat or dog?");
              species = input.next();
              System.out.println("What is the pets name?");
              name = input.next();

              if(species == "cat"){
                 age = getRandomValue(1, 14);
                 breed = Arrays.toString(getRandomStringCat());
                 cats[i] = new Cat(name, age, breed);



              }else if(species == "dog"){
                 age = getRandomValue(1, 14);
                 breed = Arrays.toString(getRandomStringDog());
                 dogs[i] = new Dog(name, age, breed);
              }

          }


          for(int i = 0; i < 5; i++){
             System.out.println(cats[i]);
             System.out.println(dogs[i]);
          }




    }
}
