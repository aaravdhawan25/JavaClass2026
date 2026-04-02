package Utils;

import Constants.ScannerConstants;

import java.util.Scanner;

public class ScannerMethods{

    public static int getValidTeamNumber(Scanner sc) {
        while (true) {
            try {
                int input = Integer.parseInt(sc.next());

                if (input < ScannerConstants.TeamNumberThresh){
                    System.out.println("Invalid input. Please enter an integer greater than 1:");
                } else
                    return input;

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer:");
            }
        }
    }

    public static double getValidPower(Scanner sc){
        while (true){
            try{
                double input = Double.parseDouble(sc.next());

                if (input > ScannerConstants.RobotPowerThreshPos || input < ScannerConstants.RobotPowerThreshNeg){
                    System.out.println("Invalid input. Please enter a valid number");
                } else {
                    return input;
                }
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please enter a valid number");
            }
        }
    }
}
