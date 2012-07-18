package th.ac.nu.students.u51346565.compro.ch03;
import java.util.Scanner;
public class Switch2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         char grade = in.next().charAt(0);
         switch (grade) {
             case 'A':
             case 'B':
             case 'C':
                 System.out.println("Passes");
                 break;
             case 'D':
             case 'F':
                 System.out.println("Fail");
                 break;
             default:
                 System.out.println("Invalid");
                 break;
        }
    }
}
