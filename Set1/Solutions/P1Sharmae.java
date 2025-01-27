import java.util.Scanner;

public class P1Sharmae {
     public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Print the greeting with the user's name
        System.out.println("Hello, KnightMarkerShellers! My name is " + name + "!");
        
        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
