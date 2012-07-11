
package th.ac.nu.students.u51346565.compro.ch02;

public class AssignmentOperator1 {
    
    public static void main(String[] args) {
        int x, y, z;
        x = y = z = 1;
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);

        x = (y = (z = z + 1) + 1) + 1;
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);        

        x = (y = 1) + (z = 1);
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
        
    }
}
