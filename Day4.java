import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
       // q3.  Ternary Operator in Program electricity bill

        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        int u1 = 100 * 2;
        int u2 = 50 * 3;
        int u3 = 50 * 4;
        int u4 = 50 * 5;
        int u5 = 50 * 6;
        int u6 = 200 * 7;
        if (100 > unit) {
            int a = unit * 2;
            System.out.println(a);
        } else if (100 < unit  && 150 >= unit) {
            int b = unit - 100;
            System.out.println(u1 + (b * 3));
        } else if (150 < unit  && 200 >= unit) {
            int n = unit - 150;
            System.out.println(u1 + u2 + (n * 4));
        } else if (200 < unit  && 250 >= unit) {
            int n = unit - 200;
            System.out.println(u1 + u2 + u3 + (n * 5));
        } else if (250 < unit && 300 >= unit) {
            int n = unit - 250;
            System.out.println(u1 + u2 + u3 + u4 + (n * 6));
        }  else if (301 < unit && 500 >= unit) {
            int n = unit - 300;
            System.out.println(u1 + u2 + u3 + u4 + u5 + (n * 7));
        } else if (500< unit) {
            int n = unit - 500;
            System.out.println(u1 + u2 + u3 + u4 + u5 + u6 + (n * 8));

        }
    }
}
