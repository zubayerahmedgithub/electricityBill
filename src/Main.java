import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Electricity Consumption KWH: ");
        int consumption = scanner.nextInt();
        double bill = calculatebill(consumption);
        System.out.println("Total Electricity Bill: $" + bill);
        scanner.close();
    }
    public static double calculatebill(int consumption) {
        double bill = 0;
        if (consumption <=50) {
            bill = consumption * 0.10;
        } else if (consumption <=150 ) {
            bill = 50 * 0.10 + (consumption - 50) * 0.16;
        } else if (consumption <= 250) {
            bill = 50 * 0.10 + 100 * 0.16 + (consumption - 150) * 0.22;
        } else {
            bill = 50 * 0.10 + 100 * 0.16 + 100 * 0.22 + (consumption - 250) * 0.30;
        }
        if (consumption <=250) {
            bill += 7; // If the Surcharge is below or equal to 250 $
        } else {
            bill += 12; // If the Surcharge is over 250$
        }
        return bill;
        }


        }




