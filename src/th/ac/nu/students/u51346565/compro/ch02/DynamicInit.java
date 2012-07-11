
package th.ac.nu.students.u51346565.compro.ch02;

public class DynamicInit {
    
    public static void main(String[] args) {
        if (args.length == 2) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        double c = Math.sqrt(a * a + b * b);
        System.out.println(c);
        
        }
    }
}
