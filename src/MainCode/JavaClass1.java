package MainCode;

import Utils.ScannerMethods;

import java.util.Scanner;

public class JavaClass1 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter Robot Name:");
        String name = myScanner.nextLine();

        System.out.println("Enter Team Number:");
        int TeamName = ScannerMethods.getValidTeamNumber(myScanner);



        System.out.println("Enter Robot Power from 0-1");
        double power = ScannerMethods.getValidPower(myScanner);

//

        System.out.println("System Online: " + name + " from Team " + TeamName + " is set to " + power + " power!");
        System.out.println();
        System.out.println("To Caps: " + name.toUpperCase());
        System.out.println();
        System.out.println("Name Length: " + name.length());
    }
}
