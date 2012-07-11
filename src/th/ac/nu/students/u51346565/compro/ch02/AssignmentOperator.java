/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.students.u51346565.compro.ch02;

/**
 *
 * @author 007
 */
public class AssignmentOperator {
    public static void main(String[] args) {
       

 int x, y, z;
         x = y = z = 1;
         System.out.println("x = " + x + ", y = " + y + ", z = " + z);

         x = (y = (z = z + 1) + 1) + 1;
         System.out.println("x = " + x + ", y = " + y + ", z = " + z);

         x = (y = 1) + (z = 1);
         System.out.println("x = " + x + ", y = " + y + ", z = " + z);
         System.out.println(1+1+1+1*0);
     }
}
