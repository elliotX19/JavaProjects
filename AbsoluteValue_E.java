import java.util.Scanner;

public class AbsoluteValue_E {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Provide an integer: ");
        int number = scan.nextInt();

        int absoluteValue;

        if (number < 0) {
            absoluteValue = number * -1;
        } else {
            absoluteValue = number;
        }

        System.out.println("The absolute value of " + number + " is " + absoluteValue);

    }

}
