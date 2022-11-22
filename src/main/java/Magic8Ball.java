import java.util.Random;
import java.util.Scanner;

/*
 * Create a Magic 8-ball program that gives custom responses to yes or no questions
 */
public class Magic8Ball {

    // 1. Make a main method that includes all the steps below
    public static void main(String[] args) {


        // 2. Get the user to enter a question for the magic 8-ball to answer
        //    Scanner scannerObject = new Scanner(System.in);
        //    String userQuestion = scanner.nextLine();
        while (true){
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("\nWelcome to Orange Magic Ball \nPlease ask me a yes or no question: ");
        String userQuestion = scannerObject.nextLine();
                if (userQuestion.equalsIgnoreCase("quit")){
                    break;
                }
        // 3. Make a variable and initialize it to a random number.
        //
        //    // Get random a number from: [0, 1, 2, 3]
        //    int randNumber = new Random().nextInt(4);
            int randNumber = new Random().nextInt(4);

            // 4. If the random number is 0
            if (randNumber == 0) {
                // Tell the user "Yes"
                System.out.println("\nYes");
            }
            // 5. If the random number is 1
            if (randNumber == 1) {
                // Tell the user "No"
                System.out.println("\nNo");
            }
            // 6. If the random number is 2
            if (randNumber == 2) {
                // Tell the user a custom response
                System.out.println("\nYou look like you would be a great potato.");
            }
            // 7. If the random number is 3
            if (randNumber == 3) {
                // Tell the user a custom response
                System.out.println("\nYou have always known the answer to this question, stop overthinking and start executing!");
            }

        }
        System.out.println("Thanks for asking me weird questions, now go and live a little.");
    }
}


