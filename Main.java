package Project.Assigment2.Question2;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Sound made by animal:");
        animal.makeSound();

        System.out.println("\nSound made by dog:");
        dog.makeSound();

        System.out.println("\nSound made by cat:");
        cat.makeSound();
    }
}
