
package Part2;

import java.util.Scanner;


public class Divide {

    
    public static void main(String[] args) {
        int num1, num2, ans, r;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number > ");
        num1 = s.nextInt();
        System.out.print("Enter another number > ");
        num2 = s.nextInt();
        
        if(num1 > num2) {
            ans = num1 / num2;
            r = num1 % num2;
        }
        else if(num2 > num1) {
            ans = num2 / num1;
            r = num2 % num1;
        }
        else {
            ans = num1 / num2;
            r = 0;
        }
        System.out.format("The answer is %d with %d remaining", ans, r);
    }
    
}
