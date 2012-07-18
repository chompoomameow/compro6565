
package th.ac.nu.students.u51346565.compro.ch02;

import java.util.Scanner;

public class Rectangle {
    
        public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Width");
        double w = in.nextDouble();
        System.out.println("Enter Long");
        double l = in.nextDouble();
        System.out.println("Area:" +w*l);
        System.out.println("perimeter:" +(2*(w+1)));
        System.out.println("diagonal:" +Math.sqrt((w*w+l*1)));
        }
}
