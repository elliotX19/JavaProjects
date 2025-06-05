import java.util.Scanner;

public class CheckNum_A {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Provide a number?: ");
        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println("It's an even number");
        } else {
            System.out.println("It's an odd number");
        }
        if (number == Math.sqrt(number) * Math.sqrt(number)) {
            System.out.println("It's a perfect square");
        } else {
            System.out.println("It's not a perfect square");
        }

    }

}