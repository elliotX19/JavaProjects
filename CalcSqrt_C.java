import java.util.Scanner;

public class CalcSqrt_C {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Provide the number: ");
        double number = scan.nextInt();

        double sqrt = Math.sqrt(number);

        if (number >= 0) {
            System.out.println("The square root of the " + number + " is " + sqrt);
        } else {
            System.out.println("You have entered a wrong number");
        }

    }

}