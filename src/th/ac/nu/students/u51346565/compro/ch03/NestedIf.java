package th.ac.nu.students.u51346565.compro.ch03;
import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score = Integer.parseInt(in.next());
         if (score > 85) {
             System.out.println("A");
         } else if (score > 75) {
             System.out.println("B");
         } else if (score > 65) {
             System.out.println("C");
         } else if (score > 55) {
             System.out.println("D");
         } else {
             System.out.println("F");
         }
    }
}
