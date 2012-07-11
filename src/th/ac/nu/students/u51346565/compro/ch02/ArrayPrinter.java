
package th.ac.nu.students.u51346565.compro.ch02;

public class ArrayPrinter {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 5, 8, 13};
        int index, initial = 0;
        for (index = initial; index < numbers.length; index++) {
    
            System.out.println("numbers[" + index + "] = " +numbers[index]);
        }
    }
}

