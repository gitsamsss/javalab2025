import java.util.Scanner;

public class javalab1 {
    public static void main(String[] args) {
        int first, second, sum, difference, product;
        float quotient;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        first = scanner.nextInt();
        second = scanner.nextInt();

        sum = first + second;
        difference = first - second;
        product = first * second;
        quotient = (float) first / second;

        System.out.println("SUM = " + sum);
        System.out.println("DIFFERENCE = " + difference);
        System.out.println("PRODUCT = " + product);
        System.out.println("QUOTIENT = " + quotient);

        scanner.close();
    }
}

