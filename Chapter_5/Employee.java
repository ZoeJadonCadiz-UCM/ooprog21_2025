public class Employee {
    private int employeeNumber;
    private double payRate;

    public static final int MAX_EMPLOYEE_NUMBER = 9999;
    public static final double MAX_RATE = 60.00;
    public static final double OVERTIME_MULTIPLIER = 1.5;

    public Employee(int employeeNumber, double payRate) {
        if (employeeNumber > MAX_EMPLOYEE_NUMBER)
            this.employeeNumber = MAX_EMPLOYEE_NUMBER;
        else
            this.employeeNumber = employeeNumber;

        if (payRate > MAX_RATE)
            this.payRate = MAX_RATE;
        else
            this.payRate = payRate;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getRegularPay(double hoursWorked) {
        double regularHours = Math.min(hoursWorked, 40);
        return regularHours * payRate;
    }

    public double getOvertimePay(double hoursWorked) {
        double overtimeHours = Math.max(0, hoursWorked - 40);
        return overtimeHours * (payRate * OVERTIME_MULTIPLIER);
    }
}
