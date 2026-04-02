import java.util.Scanner;

public class Class {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter Robot Name:");
        String name = myScanner.nextLine();

        System.out.println("Enter Team Number:");
        int TeamName = getValidTeamNumber(myScanner);



        System.out.println("Enter Robot Power from 0-1");
        double power = getValidPower(myScanner);

//

        System.out.println("System Online: " + name + " from Team " + TeamName + " is set to " + power + " power!");
        System.out.println();
        System.out.println("To Caps: " + name.toUpperCase());
        System.out.println();
        System.out.println("Name Length: " + name.length());
    }

    public static int getValidTeamNumber(Scanner sc) {
        while (true) {
            try {
                int input = Integer.parseInt(sc.next());

                if (input < 1){
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

                if (input > 1 || input < 0){
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
