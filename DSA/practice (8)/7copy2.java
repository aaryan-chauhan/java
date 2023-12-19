import java.util.*;

class Max {
    int positive;
    int negative;
    int zero;
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        Max m1 = new Max();
        String result = m1.posNegZero();  // Store the result in a String variable
        System.out.println(result);       // Print the result
    }

    public String posNegZero() {
        boolean continueInput = true;

        while (continueInput) {
            System.out.println("Enter any number: ");
            int num = sc.nextInt();

            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }

            System.out.println("Press '1' to continue and '0' to stop: ");
            int isContinue = sc.nextInt();

            if (isContinue == 1) {
                continue;
            } else if (isContinue == 0) {
                continueInput = false;
            } else {
                return "Invalid input. Press '1' or '0'";
            }
        }

        // Build the result string and return it
        return "Number of positive numbers: " + positive +
               "\nNumber of negative numbers: " + negative +
               "\nNumber of zero numbers: " + zero;
    }
}
