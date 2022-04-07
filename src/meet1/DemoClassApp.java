package meet1;

/**
 *
 * @author ammfat
 */
class DemoClassApp {
    public static void main(String[] args) {
        // ClassAcuan namaObject = new ClassAcuan();
        DemoClass demoClass = new DemoClass();
        
        System.out.println(args);
        
        System.out.println("It is main function");
        printName();
    }
    
    static void printName() {
        System.out.println("My name is Maul");
    }
}
