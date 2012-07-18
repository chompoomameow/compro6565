
package th.ac.nu.students.u51346565.compro.ch02;

import java.util.Scanner;

public class Comma {
        public static void main(String[]args){
    Scanner in = new Scanner(System.in);
      System.out.println("Enter an integer between 1000 to 999,999:");
      String number = in.nextLine();
      int length = number.length();
      System.out.print(number.substring(0, length -4)+number.substring(length -3, length));
        }
}
