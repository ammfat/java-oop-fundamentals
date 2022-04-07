package meet4.overriding;

/**
 *
 * @author ammfat
 */
public class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println(
                "Kii kiii"
        );
    }
}
