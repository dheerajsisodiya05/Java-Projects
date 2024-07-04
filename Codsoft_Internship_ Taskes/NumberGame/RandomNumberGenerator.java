import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean playAgain = true;
        System.out.println("! You have 3 attempt to guess the number !");

        while (playAgain) {
        Random random = new Random();
        int randomNumber = random.nextInt();
        int min = 1;
        int max = 100;

        int randomInRange = random.nextInt(max - min + 1) + min;
            int attempt = 1;
            for (int number = 1; attempt <= 3; number++) {
                System.out.println("Attempt - " + attempt + "\n" + "- Guess the number?");
                int user = in.nextInt();
                if (randomInRange == user) {
                    System.out.println("congratulation right answer in attempt "+attempt);
                    System.out.println("correct number :" + randomInRange);
                    break;
                } else {
                    System.out.println("Your answer Wrong !");
                    if (user < randomInRange) {
                        System.out.println(" Guessing number Too low ...");
                    }
                    if (user > randomInRange) {
                        System.out.println("Guessing number Too high...");
                    }
                    if (attempt == 3) {
                        System.out.println("Correct answer: " + randomInRange);
                    }
                    attempt += 1;
                    System.out.println("");
                }
            } // asking from user for playing again.
            String AgainPlaying;
            System.out.println("Do you want to play again if want (yes/no)");
            String response = in.next();

            // Comparing two Strings ignoring upper case and lower case
            if (response.equalsIgnoreCase("no")) {
                playAgain = false;
                }
                if(response.equalsIgnoreCase("yes")) {
                    playAgain = true;

                }
        }
        System.out.println("=============Thank you for playing=============");
    }
}
