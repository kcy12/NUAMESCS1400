import java.util.Random;
import java.util.Scanner;
class guessnumber {
    public static void main(String args[]) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to guess my number, The number is between 1-100.");
        int MIN = 1;
        int MAX = 100;
        int comp = random.nextInt(MAX - MIN + 1) + MIN;
        int user;
        int guesses = 0;
        do {
            System.out.print("Guess number:  ");
            user = input.nextInt();
            guesses++;
            if (user > comp)
                System.out.println("number is less than " + user + ".");
            else if (user < comp)
                System.out.println("number is greater than " + user + ".");
            else
                System.out.println("Correct! " + comp + " is my number! You guessed it in " + guesses + " guesses.");
        } while (user != comp);
    }
}