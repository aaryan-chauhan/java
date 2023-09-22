import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        System.out.println("The sum of 3 numbers");
        int num1 = 5;
        int num2 = 6;
        int num3 = 7;
        int sum = num1 + num2 + num3;
        System.out.println(sum);
        System.out.println("gym");
        System.out.println(num1 + num2 + num3);
        byte age = 45;
        int age2 =31;
        short age3 =43;
        long num = 644763746;
        char name = 'a';
        float dec = 4.5f;
        double dec2 =2.6d;
        String lastName = "Chauhan";
        System.out.println(lastName);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int a = sc.nextByte();
        System.out.println("enter number 2");
        int b = sc.nextByte();
        int sum2 = a+b;
        System.out.println("sum of two numbers is ");
        System.out.println(sum2);
        boolean check = sc.hasNextInt();
        System.out.println(check);
    }
}