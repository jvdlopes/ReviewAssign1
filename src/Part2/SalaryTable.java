
package Part2;

import java.text.NumberFormat;


public class SalaryTable {

    
    public static void main(String[] args) {
        int raise, newsal;
        int oldsal = 40000;
        NumberFormat nf = NumberFormat.getNumberInstance();
        
        System.out.format("%5s", "YEAR");
        System.out.format("%20s", "OLD SALARY");
        System.out.format("%15s", "RAISE");
        System.out.format("%20s\n", "NEW SALARY");
        System.out.format("%5s", "----");
        System.out.format("%20s", "----------");
        System.out.format("%15s", "-----");
        System.out.format("%20s\n", "----------");
        
            System.out.format("%5s", 1);
            System.out.format("%20s", "---");
            System.out.format("%15s", "$40,000");
            System.out.format("%20s\n", "$40,000");
            
        for (int x = 2; x <= 10; x++) {
            raise = (int) (0.03 * (int)oldsal);
            newsal = oldsal + raise;
            System.out.format("%5s", x);
            System.out.format("%20s", "$" + nf.format(oldsal));
            System.out.format("%15s", "$" + nf.format(raise));
            System.out.format("%20s\n", "$" + nf.format(newsal));
            oldsal = newsal;
        }
    }
    
}
