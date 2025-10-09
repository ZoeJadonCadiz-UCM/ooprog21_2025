
import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee number: ");
        int empNum = input.nextInt();

        System.out.print("What is your regular pay rate? ");
        double rate = input.nextDouble();

        System.out.print("How many hours did you work this week? ");
        double hours = input.nextDouble();

        Employee emp = new Employee(empNum, rate);

        double regularPay = emp.getRegularPay(hours);
        double overtimePay = emp.getOvertimePay(hours);

        System.out.println("\nRegular pay is " + regularPay);
        System.out.println("Overtime pay is " + overtimePay);
    }
}
