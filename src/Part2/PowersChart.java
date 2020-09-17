package Part2;

import java.util.Scanner;

public class PowersChart {

    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Please give an exponent value ");
            num = s.nextInt();
            if(num >= 0 && num <= 10) break;
            else System.out.println("The number must be between 0 and 10");
        }

        System.out.format("%5s", "X");
        System.out.format("%20s\n", "2^X");
        System.out.format("%5s", "-");
        System.out.format("%21s\n", "-----");

        for (int x = 0; x <= num; x++) {
            System.out.format("%5s", x);
            System.out.format("%19s\n", Math.pow(2, x));

        }
    }

}
