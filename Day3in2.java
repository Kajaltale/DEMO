public class Day3in2 {
    public static void main(String[] args) {
       // q2. swap values of 2 variable without using 3rd variable

        int a = 10;
        int b = 20;
        System.out.println("a  = " + a);
        System.out.println("b  = " + b);
        a = a+b;
        b= a-b;
        a=a-b;
        System.out.println( );
        System.out.println("a  = " + a);
        System.out.println("b  = " + b);
    }
}
