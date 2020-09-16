package Part1;

import TurtleGraphics.*;
import java.awt.Color;
import java.util.Scanner;
public class BarChart {

    
    public static void main(String[] args) {
        SketchPadWindow spw = new SketchPadWindow(700,500);
        Pen p = new StandardPen(spw);
        int line1, line2, line3, line4;
        Scanner s = new Scanner(System.in);
        
        //drawing x-axis line
        p.setWidth(5);
        p.setColor(Color.black);
        p.up();
        p.move(-350, -200);
        p.down();
        p.move(350, -200);
        p.home();
        
        //ask about graph
        System.out.print("Enter value 1 of 4 >> ");
        line1 = s.nextInt();
        System.out.print("Enter value 2 of 4 >> ");
        line2 = s.nextInt();
        System.out.print("Enter value 3 of 4 >> ");
        line3 = s.nextInt();
        System.out.print("Enter value 4 of 4 >> ");
        line4 = s.nextInt();
        
        //draw graph
        p.setWidth(10);
        makeBar(p,-330,-195,line1,Color.red);
        makeBar(p,-165,-195,line2,Color.blue);
        makeBar(p,0,-195,line3,Color.green);
        makeBar(p,165,-195,line4,Color.orange);
    }
    
    public static void makeBar(Pen p, int xloc, int yloc, int length, Color col){
        p.up();
        p.move(xloc, yloc);
        p.down();
        p.setColor(col);
        p.setDirection(90);
        p.move(length);
        p.up();
        p.move(15);
        p.down();
        p.drawString(length + "");
    }
}
