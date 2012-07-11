
package th.ac.nu.students.u51346565.compro.ch02;

public class IncDecOperator {
    
    public static void main(String[] args) {
        int x = 1, y = 1;
        int a = 0, b = 0;

        x++; ++y;
        System.out.println("a = " + a + ", b = " + b + ", x = " + x + ", y = " + y);      

        a = x++; b = ++y;
        System.out.println("a = " + a + ", b = " + b + ", x = " + x + ", y = " + y);
        
        a = x--; b = --y;
        System.out.println("a = " + a + ", b = " + b + ", x = " + x + ", y = " + y);
        
    }
}
