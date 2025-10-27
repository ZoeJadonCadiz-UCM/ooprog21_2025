import java.util.Scanner;

public class BankBalanceByRateandYear {

    public static void main(String[] a) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial bank balance: ");
        double initialBalance = scanner.nextDouble();

        double[] interest = {0.02, 0.03, 0.04, 0.05};

        for (double rate : interest) {
            double balance = initialBalance;
            System.out.println("\nWith an initial balance of " + initialBalance + " at an interest rate of " + rate);

            for (int year = 1; year <= 4; year++) {
                balance = balance + (balance * rate);
                System.out.println("After year " + year + " balance is $" + balance);
            }
        }
        
        scanner.close();
    }
}
