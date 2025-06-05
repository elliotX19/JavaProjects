import java.util.Scanner;

public class CheckNumSign_F {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Provide an integer: ");
        double number = scan.nextDouble();

        if (number > 0) {
            System.out.println("It is a positive number");
        } else {
            System.out.println("It is a negative number");
        }

    }

}
