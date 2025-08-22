import java.util.Scanner;

public class HelloWorld {
    Scanner scn = new Scanner(System.in);
    String name; 
    private final int age;

    /**
     * This constructor initializes the HelloWorld object by prompting the user for their name and age.
     */
    public HelloWorld() {
        System.out.print("Enter your name: ");
        this.name = scn.next();
        System.out.print("Enter your age: ");
        this.age = scn.nextInt();
    }

/**
     * This constructor initializes the HelloWorld object with a given name and age.
     * @param name The name of the user.
     * @param age The age of the user.
     */
    public HelloWorld(String name, int age) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        this.name = name;
        this.age = age;
    }
    /**
     * This method introduces the user by printing their name and age.
     */
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    /**
     * This method greets the user with a personalized message.
     */
    public void greet(String name) {
        System.out.println("Heyyyyy " + name + "!");
    }
    /**
     * This method greets the user with a default message.
     */
    public void greet() {
        System.out.println("Hello, " + name + "!");
    }
    

    }
    

