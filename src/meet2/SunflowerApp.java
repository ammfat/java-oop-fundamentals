package meet2;

/**
 *
 * @author ammfat
 */
public class SunflowerApp {
    public static void main(String[] args) {
        // var flower = new Flower();  // would be error!
        
        var sunflower = new Sunflower();
        
        sunflower.bloom();
        System.out.println(sunflower.PHOTOSYNTHESIS);
    }
}
