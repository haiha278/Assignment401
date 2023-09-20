import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static double divide(double a, double b) throws Exception {
        if (b == 0) {
            throw new Exception();
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;

        try {
            System.out.print("Enter first number: ");
            a = scanner.nextDouble();

            System.out.print("Enter second number: ");
            b = scanner.nextDouble();

            double result = divide(a, b);
            System.out.println("Kết quả phép chia: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Must be number");
        } catch (Exception e) {
            System.out.println("Illegal divide");
        }
    }

}