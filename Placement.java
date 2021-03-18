import java.util.*;
class Placement {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of students placed in CSE:\n");
        int a=sc.nextInt();
        System.out.print("Enter the no of students placed in ECE:\n");
        int b=sc.nextInt();
        System.out.print("Enter the no of students placed in MECH:\n");
        int c=sc.nextInt();
        int max;
        if(a<0 || b<0 || c<0) {
            System.out.println("Input is Invalid");
        }
        else if(a==b && b==c) {
            System.out.println("None of the department has got the highest placement");
        }
        else {
            max=a>b?(a>c?a:c):(b>c?b:c);
            System.out.println("Highest placement");
            if(max==a) {
                System.out.println("CSE");
            }
            if(max==b) {
                System.out.println("ECE");
            }
            if(max==c) {
                System.out.println("MECH");
            }
        }
    }
}
