import java.util.Scanner;

public class Day5 {
    // q opposite of peak element
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int arr[] = new int[length];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int j=0; j< arr.length; j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        for(int i=1; i< arr.length-1; i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
