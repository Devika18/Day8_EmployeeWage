package EmployeeWage;
import java.util.Scanner;
public class MonthWage extends MonthHour {
    public static void Month() {
        System.out.println("How many days employee was present? ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int wagePerHr = 20;
        int workingHr = 8;
        int salary, totalSalary = 0;
        if (day < 21) {
            for (day = 1; day <= 20; day++) {
                System.out.println("***********************************");
                salary = wagePerHr * workingHr;
                totalSalary = totalSalary + salary;
                System.out.println("Monthly salary of the Employee is: " + totalSalary);
            }
        } else
            System.out.println("Invalid Input");

        System.out.println("--------------------------------------------");
        MonthHour.Hour();
    }
}

