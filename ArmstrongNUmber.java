package recursion;

import java.util.Scanner;

public class ArmstrongNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isArmstrong(n))
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n+ " is not an Armstrong number.");
    }
    public static boolean isArmstrong(int n) {
        int sum = 0;
        int realNumber = n;

        // number of digit length
        int num = String.valueOf(n).length();
        for (int i = 0; i < num; i++) {
            int d = n % 10;
            sum += Math.pow(d, num);
            n /= 10;
        }

        return sum == realNumber;
    }
}
