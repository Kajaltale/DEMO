import java.util.Scanner;

 //q1.  2nd largest element

public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //short arr

        int temp;
        for (int k = 0; k < arr.length; k++) {
            for (int m = k + 1; m < arr.length; m++) {
                if (arr[k] > arr[m]) {
                    temp = arr[k];
                    arr[k] = arr[m];
                    arr[m] = temp;
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println( );

        //2nd largest element

        for(int n = arr.length; n>=1; n--){
            if(arr[arr.length-1] >arr[n-2]){
                System.out.println(arr[n-2]);
                break;
            }else {
                System.out.println("second largest element is not available");
                break;
            }
        }
    }
}
