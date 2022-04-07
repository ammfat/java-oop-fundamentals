package meet4.overriding;

/**
 *
 * @author ammfat
 */
public class Duck extends Animal {
    @Override
    void makeSound() {
        System.out.println(
                "Qwack qwack!"
        );
    }
}
