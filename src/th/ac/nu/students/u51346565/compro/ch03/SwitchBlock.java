
package th.ac.nu.students.u51346565.compro.ch03;

public class SwitchBlock {
    public static void main(String [] args){
        int x = 1;
        switch (x){
            //int y
            case 1:
                int a;
                System.out.println(0);
                break;  
            case 2:{
                int b;
                System.err.println(1);
            }
            default :
                System.err.println(2);
        }       
    }
}
