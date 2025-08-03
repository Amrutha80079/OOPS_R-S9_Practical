package Strings;
import java.util.Scanner;
public class ReadStringPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("You entered: " + input);
        sc.close();
		

	}

}
