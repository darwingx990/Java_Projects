import java.util.Random;
import java.util.Scanner;

public class WishTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wishedNumber = 50;
        int randomNumber = new Random().nextInt(100);
        System.out.println("""
                ===============================
                |       WISH THE NUMBER       |
                ===============================""");
        for (int i = 0; i != randomNumber; i++) {
            System.out.println("Enter a number from 1 to %d".formatted(wishedNumber));
            int number = sc.nextInt();

            if (number < randomNumber) {
                System.out.println("The number is higher. Please try again. ");
            } else if (number > randomNumber) {
                System.out.println("The number is lower. Please try again. ");

            } else {
                break;
            }
        }

        System.out.printf("Congrarts. You wish the number. It is %d. %n", randomNumber);

    }
}
