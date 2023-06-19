import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();

        // Arithmetic Operations
        int result1 = a + b * c;
        int result2 = c + a / b;
        int result3 = a % b + c;
        int result4 = a * b + c;

        // Finding Maximum and Minimum
        int max = Math.max(Math.max(result1, result2), Math.max(result3, result4));
        int min = Math.min(Math.min(result1, result2), Math.min(result3, result4));

        System.out.println("Results:");
        System.out.println("a + b * c = " + result1);
        System.out.println("c + a / b = " + result2);
        System.out.println("a % b + c = " + result3);
        System.out.println("a * b + c = " + result4);
        System.out.println("Maximum is : " + max);
        System.out.println("Minimum is : " + min);
    }
}