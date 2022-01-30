import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "What number am I thinking of?";
        String a = "One";
        String b = "Twenty-four";
        String c = "Three hundred";

        String answer = a;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println("A) " + a);
        System.out.println("B) " + b);
        System.out.println("C) " + c);

        // Have the user input an answer
        Scanner input = new Scanner(System.in);
        // Retrieve the user's input
        String userInput = input.next();
        
        // If the user's input matches the correctAnswer...
        if (userInput.equals(answer) || userInput.equals("A")) {
            // then the user is correct and we want to print out a congrats message to the user.
            System.out.println("CONGRATS!!! YOU WIN!!");
        } else {
            // If the user's input does not match the correctAnswer...
            // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
            System.out.println("Incorrect...");
        }

        
    }

}
