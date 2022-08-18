package GaragePackage;/*
OOP-I Assignment3 - Question 1
Student Name: Tyrese Fisher
Teacher: Dr Rohini Arora
Class: Class #: 1201_4281
Term: Winter 2020
Date: 12/03/2020
Program Description: Employee Payroll Calculator
*/

import java.util.*;
public class SheridanPayroll {
    /**
     * @param args
     */
    public static void main (String [] args){
        //initializing variables
        int option;
        float hrsWorked, annualSalary, totalPay;
        boolean session = true;
        //creating scanner object
        Scanner scan = new Scanner(System.in);
        //while loop set to true
        while (session) {
            //Prompt and input of option
            System.out.println("Enter type of employee:\n" +
                    "1. Full-Time\n" +
                    "2. Part-Time\n" +
                    "3. Seasonal\n" +
                    "4. Partial Load\n" +
                    "5. Exit\n");
            option = scan.nextInt();
            //switch statement to control logic based on answer
            switch (option) {
                //case for full time employee
                case 1:
                    //prompt and input of salary
                    System.out.print("Enter salary: ");
                    annualSalary = scan.nextFloat();
                    //calculation and display of total pay
                    System.out.printf("Total pay: $%.2f%n%n", annualSalary / 44);
                    break;
                //case for part time employee
                case 2:
                    //prompt and input of hours worked
                    System.out.printf("Enters Hours Worked: ");
                    hrsWorked = scan.nextFloat();
                    //calculation and display of total pay
                    System.out.printf("Total pay: $%.2f%n%n", hrsWorked * 30);
                    break;
                //case for seasonal employee
                case 3:
                    //prompt and input of hours worked
                    System.out.printf("Enters Hours Worked: ");
                    hrsWorked = scan.nextFloat();
                    //calculation and display of total pay
                    System.out.printf("Total pay: $%.2f%n%n", hrsWorked * 32);
                    break;
                 // case for partial load employee
                case 4:
                    //prompt and input of hours worked
                    System.out.printf("Enters Hours Worked: ");
                    hrsWorked = scan.nextFloat();
                    //calculation and display of total pay
                    System.out.printf("Total pay: $%.2f%n%n", hrsWorked * 35);
                    break;
                //exit case
                case 5:
                    //setting session to false to end the loop
                    session = false;
                    break;
                 //error handling
                default:
                    System.out.println("Error! You entered an invalid employee type.\n");
            }
        }
        System.out.println("Pleasure doing business with you!");
        scan.close(); //closing the scanner
        System.exit(0); //exit statement for error checking
    }
}
