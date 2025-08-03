package Strings;
import java.util.Scanner;
public class StringMethods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("\nOriginal String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Character at index 2: " + str.charAt(2));
        System.out.println("Substring (2 to 6): " + str.substring(2, 6));
        System.out.println("Contains 'Java': " + str.contains("Java"));
        System.out.println("Replace 'a' with '@': " + str.replace('a', '@'));
        System.out.println("Starts with 'J': " + str.startsWith("J"));
        System.out.println("Ends with 'g': " + str.endsWith("g"));
        sc.close();
		

	}

}
