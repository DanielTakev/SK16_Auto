import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInputManual = new Scanner(System.in);

        System.out.print("Enter a integer: ");
        int firstInt = userInputManual.nextInt();

        System.out.print("Enter second integer: ");
        int secondInt = userInputManual.nextInt();

        System.out.println("Result: " + firstInt % secondInt);
    }
}
