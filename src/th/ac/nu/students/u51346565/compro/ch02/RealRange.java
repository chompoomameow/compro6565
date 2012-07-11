
package th.ac.nu.students.u51346565.compro.ch02;

public class RealRange {
    
    public static void main(String[] args) {
        float pMax = Float.MAX_VALUE;
        float pMin = Float.MIN_VALUE;

        System.out.println("Positive Overflow = " + pMax * 10);
        System.out.println("Positive Maximun = " + pMax);
        System.out.println("Positive Minimum = " + pMin);
        System.out.println("Positive Underflow = " + pMin / 10);

        System.out.println("0.0");

        float nMax = -Float.MIN_VALUE;
        float nMin = -Float.MAX_VALUE;

        System.out.println("Negative Overflow = " + nMax / 10);
        System.out.println("Negative Maximun = " + nMax);
        System.out.println("Negative Minimum = " + nMin);
        System.out.println("Negative Underflow = " + nMin * 10);
    }
}
