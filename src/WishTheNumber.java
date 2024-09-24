import java.util.Scanner;

public class WishTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100);
        System.out.println("""
                ===============================
                |       WISH THE NUMBER       |
                ===============================""");
        for (int i = 0; i != randomNumber; i++) {
            System.out.println("Enter a number between 1 and 100");
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
