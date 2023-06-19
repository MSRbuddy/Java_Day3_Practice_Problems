import java.util.Scanner;

public class ForReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        int reversedNumber = 0;

        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }

        System.out.println("The reverse of the number is: " + reversedNumber);
    }
}