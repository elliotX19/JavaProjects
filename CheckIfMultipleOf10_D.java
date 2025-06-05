import java.util.Scanner;

public class CheckIfMultipleOf10_D {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scan.nextInt();

        if (number % 10 == 0) {
            System.out.println(number + " is a multiple of 10");
        } else {
            System.out.println(number + " is not a multiple of 10");
        }

    }

}
