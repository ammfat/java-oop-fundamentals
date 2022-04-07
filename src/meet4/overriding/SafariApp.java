package meet4.overriding;

/**
 *
 * @author ammfat
 */
public class SafariApp {
    public static void main(String[] args) {
        var animal = new Animal();
        
        animal.name = "Animal";
        System.out.println(animal.name);
        animal.makeSound();
        
        var bird = new Bird();

        bird.name = "Bird";
        System.out.println(bird.name);
        bird.makeSound();

        var duck = new Duck();

        duck.name = "Duck";
        System.out.println(duck.name);
        duck.makeSound();
    }
}
