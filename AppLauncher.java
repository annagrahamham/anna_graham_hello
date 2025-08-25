/**
 * This class serves as the entry point for the application.
 * It creates instances of HelloWorld and demonstrates their functionality.
 */
public class AppLauncher {
    /**
     * The main method is the entry point of the application.
     * It creates HelloWorld objects and calls their methods to demonstrate usage.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("""
                            /\\_/\\  
                           ( o.o )  <(mow!!!)
                            > ^ < 
                           """);
    
    
        HelloWorld student1 = new HelloWorld("Jason", 4);
        HelloWorld student2 = new HelloWorld();

        student1.introduce();
        student1.greet("Jason");
        student2.introduce();
        student2.greet();
}
}
