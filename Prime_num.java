package recursion;

import java.util.Scanner;

public class Prime_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        for(int j=2;j<=n;j++)
        {
          int  count=0;
            for(int i=1;i<=j;i++)
            {
                if(j%i==0)
                {
                    count++;
                }
            }
            if(count==2)
                System.out.print(j+"  ");
        }

    }

}
