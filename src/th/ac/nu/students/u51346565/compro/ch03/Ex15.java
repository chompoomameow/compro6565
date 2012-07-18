
package th.ac.nu.students.u51346565.compro.ch03;

import java.util.Scanner;

public class Ex15 {
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Name of Employee:");
        String name = in.next();
        System.out.println("Enter salary");
        double rate = in.nextDouble();
        System.out.println("Enter many hours to work");
        double hours = in.nextDouble();
        double ot = 0;
        if(hours>40){
        ot = hours - 40;
        hours = 40;
        }
        double salary = (hours * rate)+((rate*1.5)*ot);
        System.out.println(name+" will get "+salary+" $");
    }
}
