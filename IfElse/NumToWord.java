import java.util.Scanner;

public class NumToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single-digit number (0-9): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 9) {
            System.out.println("Invalid input! Please enter a single-digit number.");
        } else {
            String word;
            if (number == 0) {
                word = "zero";
            } else if (number == 1) {
                word = "one";
            } else if (number == 2) {
                word = "two";
            } else if (number == 3) {
                word = "three";
            } else if (number == 4) {
                word = "four";
            } else if (number == 5) {
                word = "five";
            } else if (number == 6) {
                word = "six";
            } else if (number == 7) {
                word = "seven";
            } else if (number == 8) {
                word = "eight";
            } else {
                word = "nine";
            }

            System.out.println("The number in words is: " + word);
        }
    }
}