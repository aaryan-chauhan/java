import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);
        System.out.println("enter maths marks");
        float M=input.nextFloat();
        System.out.println("enter english marks");
        float E=input.nextFloat();
        System.out.println("enter hindi marks");
        float H=input.nextFloat();
        System.out.println("enter Physics marks");
        float P=input.nextFloat();
        System.out.println("enter Gujarati marks");
        float G=input.nextFloat();
        float percentage = ((M+E+H+P+G)/500)*100;
        System.out.println(percentage + " %");
    }
}