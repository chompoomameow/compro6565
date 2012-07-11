
package th.ac.nu.students.u51346565.compro.ch02;

public class IntegerRage {
    
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        System.out.println("Overflow:");
        System.out.println(max);
        System.out.println(max + 1);
        System.out.println(max + 2);
            
        int min = Integer.MIN_VALUE;
        System.out.println("Unceerflow:");
        System.out.println(min);
        System.out.println(max - 1);
        System.out.println(max - 2);
    }   
}
