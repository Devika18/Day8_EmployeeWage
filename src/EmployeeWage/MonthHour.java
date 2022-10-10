package EmployeeWage;

import java.util.Scanner;

public class MonthHour {
    public static void Hour() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter working hours: ");
        int workingHr = sc.nextInt();
        int wagePerHr = 20;
        int fullTime = 8;
        int workingDays, salary, totalSalary = 0;
        for(workingDays=1;workingDays<=20;workingDays++) {
            if(workingHr<=100) {
                System.out.println("Employee is Present");
                salary = wagePerHr * fullTime * workingHr;
                totalSalary = totalSalary + salary;
                System.out.println("Salary of Employee as per Working Hour is: "+totalSalary);
                System.exit(0);
            }
            else
                System.out.println("Employee is Absent");
        }
    }
}
