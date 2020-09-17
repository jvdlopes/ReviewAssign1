package Part2;

import java.util.Scanner;

public class EmployeePay {

    public static void main(String[] args) {
        double regpay, overpay, totalpay;
        double totalreg = 0;
        double totalover = 0;
        double totaltotal = 0;
        int hours;
        Scanner s = new Scanner(System.in);

        for (int X = 1; X <= 5; X++) {

            while (true) {
                System.out.print("Enter hours worked for Employee " + X + ": ");
                hours = s.nextInt();
                if (hours >= 1 && hours <= 70) {
                    break;
                }
                System.out.println("Invalid -  try again");
            }

            if (hours > 40) {
                regpay = 40 * 15;
                overpay = (hours - 40) * 22.5;

            } else {
                regpay = hours * 15;
                overpay = 0;
            }
            totalpay = regpay + overpay;
            totalreg = totalreg + regpay;
            totalover = totalover + overpay;
            totaltotal = totaltotal + totalpay;
            System.out.format("Regular Pay:    $%.2f\n", regpay);
            System.out.format("Overtime Pay:    $%.2f\n", overpay);
            System.out.format("Total Pay:    $%.2f\n", totalpay);
        }
        System.out.println("---------------------");
        System.out.format("Regular Pay:    $%.2f\n", totalreg);
        System.out.format("Overtime Pay:    $%.2f\n", totalover);
        System.out.format("Total Pay:    $%.2f\n", totaltotal);
        
    }

}
