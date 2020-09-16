package Part1;


import java.util.Scanner;


public class PizzzaCost1 {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final double labour = 1.5;
        final double heat = 0.75;
        double TopCost, PizzaSize, PizzaCost, TotalCost;
        int TopNum;
        
        System.out.print("What is the diameter of the pizza (in inches) >> ");
        PizzaSize = s.nextDouble();
        PizzaCost = PizzaSize * .5;
        System.out.print("How many toppings >> ");
        TopNum = s.nextInt();
        TopCost = TopNum * .75;
        TotalCost = TopCost + PizzaCost + labour + heat;
        System.out.println(String.format("Your total cost is $%.2f", TotalCost));
    }
    
}
