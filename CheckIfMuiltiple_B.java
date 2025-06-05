import java.util.Scanner;

public class CheckIfMuiltiple_B {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Provide 1st value: ");
        int firstValue = scan.nextInt();

        System.out.print("Provide 2nd value: ");
        int secondValue = scan.nextInt();

        if (secondValue % firstValue == 0) {
            System.out.println(secondValue + " is a multiple of " + firstValue);
        } else {
            System.out.println(secondValue + " is not a multiple of " + firstValue);
        }

    }

}
