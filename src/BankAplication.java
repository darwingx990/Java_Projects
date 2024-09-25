import java.util.Scanner;

public class BankAplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                ==============================
                   Welcome to Darwing's Bank
                ==============================
                """);

        System.out.println("Please enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter the Type of the account: ");
        String type = sc.nextLine();

        System.out.println("Enter the amount on the account: ");
        double amount = sc.nextDouble();

        System.out.println("""
                =============================
                     ACCOUNT DETAILS
                =============================
                Account holder´s name: %S
                Account Type: %S
                Account Amount: %.2f
                """.formatted(name, type, amount));

        int choice = 0;
        while (choice != 9) {
            System.out.println("""
                    **** Choose one of the options below ****
                      1. Check Balance
                      2. Withdraw
                      3 Deposit
                      9. Exit
                    Please enter the number of the option:\s
                    \s""");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.printf("Your balance is: $ %.2f%n \n", amount);
                    break;

                case 2:
                    System.out.println("How much money do you want to withdraw? ");
                    double amountWithdrwawal = sc.nextDouble();
                    amount -= amountWithdrwawal;
                    System.out.println("Mr %S, You have withdrawed $ %.2f. The remaining balance on the account is $ %.2f \n".formatted(name, amountWithdrwawal, amount));
                    break;

                case 3:
                    System.out.println("Enter the amount to deposit: ");
                    double amountDeposit = sc.nextDouble();
                    amount += amountDeposit;
                    System.out.println("You have deposited $ %.2f.".formatted(amountDeposit));
                    System.out.println("Your new balance is: $ %.2f \n".formatted(amount));
                    break;

                case 9:
                    System.out.println("Thanks for using our services. Bye!👍");
                    break;
            }
        }

    }
}
