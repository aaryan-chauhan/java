package com.company;
import java.util.Scanner;
public class CWH_Exercise1_CBSE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your marks as told");
        System.out.println("please enter maths marks: ");
        float maths = input.nextFloat();
        System.out.println("please enter phy marks: ");
        float phy = input.nextFloat();
        System.out.println("please enter chem marks: ");
        float chem = input.nextFloat();
        System.out.println("please enter english marks: ");
        float english = input.nextFloat();
        System.out.println("please enter hindi marks: ");
        float hindi = input.nextFloat();
                float sum = maths +phy +chem +english+ hindi;
                float Percentage = (sum/500)*100;
        System.out.println(Percentage+"%");
    }
}
