package EmployeeWage;

import java.util.Random;

public class EmployeeWageMain extends MonthWage {
    public static void main(String[] args) {
        System.out.println("************* Welcome to Employee Wage Program **************");
        Available();
    }
    public static void Available() {
        Random random = new Random();
        int isPresent = random.nextInt(3);
        System.out.println("Random value is:"+ isPresent);
        if(isPresent >= 1) {
            System.out.println("Employee is Present");
            DailyWage();
        }
        else
            System.out.println("Employee is Absent");
    }
    public static void DailyWage() {
        Random random = new Random();
        int isPresent = random.nextInt(3);
        System.out.println("Random value is:"+ isPresent);
        int wagePerHr = 20;
        int fullTime = 8;
        int partTime = 4;
        int salary;
        switch(isPresent) {
            case 1:
                System.out.println("Employee is present for Full Time");
                salary = wagePerHr * fullTime;
                System.out.println("Salary of Full Time Employee is: "+salary);
                System.out.println("--------------------------------------------");
                MonthWage.Month();
                break;
            case 2:
                System.out.println("Employee is present for Part Time");
                salary = wagePerHr * partTime;
                System.out.println("Salary of Part Time Employee is: "+salary);
                System.out.println("--------------------------------------------");
                MonthWage.Month();
                break;
            default:
                System.out.println("Employee is Absent");
        }
    }
}
