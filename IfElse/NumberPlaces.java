import java.util.Scanner;

public class NumberPlaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1, 10, 100, or 1000): ");
        int number = scanner.nextInt();

        if (number != 1 && number != 10 && number != 100 && number != 1000) {
            System.out.println("Invalid input! Please enter 1, 10, 100, or 1000.");
        } else {
            int unit, ten, hundred;

            if (number == 1) {
                unit = 1;
                ten = 0;
                hundred = 0;
            } else if (number == 10) {
                unit = 0;
                ten = 1;
                hundred = 0;
            } else if (number == 100) {
                unit = 0;
                ten = 0;
                hundred = 1;
            } else {
                unit = 0;
                ten = 0;
                hundred = 0;
            }

            System.out.println("Unit: " + unit);
            System.out.println("Ten: " + ten);
            System.out.println("Hundred: " + hundred);
        }
    }
}