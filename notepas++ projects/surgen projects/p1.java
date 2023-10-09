import java.util.Scanner;

public class p1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter operator (+,-,*,/,%):");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        if (operator == '+') {
            System.out.println("The answer is: " +(first + second));
        } else if (operator == '-') {
            System.out.println("The answer is: " +(first - second));
        } else if (operator == '*') {
            System.out.println("The answer is: " +(first * second));
        } else if (operator == '/') {
            System.out.println("The answer is: " +(first / second));
        } else if (operator == '%') {
            System.out.println("The answer is: " +(first % second));
        } else {
            System.out.println("Invalid operation");
        }
    }
}