package Challange1Pets;

public class Test {


    public static void main (String[] args) {
        Pet p1 = new Pet();
        Pet p2 = new Pet("teddy", 9);
        Pet p3 = new Pet("Mereidith", 4);

        p1.setName("luna");
        p1.setAge(7);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        Cat c1 = new Cat();
        Cat c2 = new Cat("Abby", 6, "Siamese");

        c1.setName("Jax");
        c1.setAge(3);
        c1.setBreed("Tuxedo");

        System.out.println(c1);
        System.out.println(c2);

        Dog d1 = new Dog();
        Dog d2 = new Dog("George", 6, "yorkie");

        d1.setName("alfie");
        d1.setAge(6);
        d1.setBreed("terrior");

        System.out.println(d1);
        System.out.println(d2);

        System.out.println(c1.getBreed());
        System.out.println(d1.getBreed());



    }
}
