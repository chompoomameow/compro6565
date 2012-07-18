package th.ac.nu.students.u51346565.compro.ch03;

public class DanglingElse {

    public static void main(String[] args) {
        int x = 5;
         if (x < 5)
             if (x > 5)
                 System.out.println('b');
         else
             System.out.println('a');

    }
}
