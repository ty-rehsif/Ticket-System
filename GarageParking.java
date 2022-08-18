package GaragePackage;
/*
OOP-I Assignment3 - Question 2
Student Name: Tyrese Fisher
Teacher: Dr Rohini Arora
Class: Class #: 1201_4281
Term: Winter 2020
Date: 12/03/2020
Program Description: Program that allows clerks to calculate and display a bill for customer parking charges
*/

//importing util classes
import java.util.*;
//creating the main class
public class GarageParking {
    /**
     * @param args
     */
//creating the main method
 //driver code
    public static void main (String [] args) {
    //initialize scanner object
        Scanner scan = new Scanner(System.in);
    //prompt and input of customer hours parked and membership status
            System.out.println("Enter your number hours parked");
            double hrsParked = scan.nextFloat();
            if (hrsParked > 24){
                throw new ArithmeticException("Parking not allowed for more \n" +
                        "than 24 hours");
            }

    //creation of variable to keep loop going so customer do not skip payment
        boolean session = true;
    //while loop set to true
        while (session){
            System.out.println("Do you have a membership card? Enter a number: (1) Yes (2) No");
            int choice = scan.nextInt();
         //if customer is not a member
            if (choice == 1) {
            //creating object w/ two parameters for constructor
                Members mObject = new Members(hrsParked, 1.0);
            //setting instance variables based off passed constructor parameters
                mObject.setMemCharges();
            //Output of hourly rate, charged hours and the total charge
                System.out.printf("Hourly Rate: $%.2f\n", mObject.getHrRate());
                System.out.printf("Number of Hours Charged: %.1f\n", mObject.getCharHours());
                System.out.printf("Total Charge: $%.2f\n", mObject.getTotalCharge());
                //terminate loop
                session = false;
            }
        //if customer is not a member
            else if (choice == 2) {
             //creating object w/ two parameters for constructor
                Members nmObject = new Members(hrsParked, 2.0);
             //setting instance variables based off passed constructor parameters
                nmObject.setNonMemCharges();
             //Output of hourly rate, charged hours and the total charge
                System.out.printf("Hourly Rate: $%.2f\n", nmObject.getHrRate());
                System.out.printf("Number of Hours Charged: %.1f\n", nmObject.getCharHours());
                System.out.printf("Total Charge: $%.2f\n", nmObject.getTotalCharge());
             //terminate loop
                session = false;
            }
         //if customer did not enter 1 or 2
            else {
                System.out.println("Wrong number entered, try again");
            }
        }
        scan.close();
        System.exit(0);
    }
}
