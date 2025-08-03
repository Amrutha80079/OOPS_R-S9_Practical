package conditionalStatments;

public class AcceptNumbers {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            try {
                int num = Integer.valueOf(args[i]); // Convert String to int
                
                if (num == 0) {
                    break; // Stop if 0 is entered
                }

                System.out.println("You entered: " + num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + args[i]);
            }
        }
    }
}

	          
