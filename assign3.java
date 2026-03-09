import java.util.Scanner;

class Payroll {

    void salary(int employeeID) {
        System.out.println("Employee ID: " + employeeID);
    }

    void salary(int hoursWorked, double rate) {
        double pay = hoursWorked * rate;
        System.out.println("Salary (Hours and Rate): " + pay);
    }

    void salary(int employeeID, int bonus) {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Bonus: " + bonus);
    }

    void salary(double annualSalary) {
        System.out.println("Annual Salary: " + annualSalary);
    }

    void salary(int hoursWorked, double rate, double overtime) {
        double pay = (hoursWorked * rate) + overtime;
        System.out.println("Salary with Overtime: " + pay);
    }

    void salary(double salary, double deductions) {
        double pay = salary - deductions;
        System.out.println("Salary after Deductions: " + pay);
    }

    void salary(double salary, double bonus, double deductions) {
        double pay = salary + bonus - deductions;
        System.out.println("Salary with Bonus and Deductions: " + pay);
    }
}

public class assign3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Payroll p = new Payroll();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        p.salary(id);

        System.out.print("Enter Hours Worked: ");
        int hours = sc.nextInt();
        System.out.print("Enter Rate per Hour: ");
        double rate = sc.nextDouble();
        p.salary(hours, rate);

        System.out.print("Enter Bonus for Employee ID: ");
        int bonus1 = sc.nextInt();
        p.salary(id, bonus1);

        System.out.print("Enter Annual Salary: ");
        double annual = sc.nextDouble();
        p.salary(annual);

        System.out.print("Enter Overtime Amount: ");
        double overtime = sc.nextDouble();
        p.salary(hours, rate, overtime);

        System.out.print("Enter Salary for Deduction Calculation: ");
        double sal = sc.nextDouble();
        System.out.print("Enter Deductions: ");
        double ded = sc.nextDouble();
        p.salary(sal, ded);

        System.out.print("Enter Bonus: ");
        double bonus2 = sc.nextDouble();
        System.out.print("Enter Deductions: ");
        double ded2 = sc.nextDouble();
        p.salary(sal, bonus2, ded2);
    }
}