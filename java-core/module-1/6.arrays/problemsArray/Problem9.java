
import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] arr;
        arr = new int[n];
        System.out.println("Enter The elements: ");
        for( int i = 0 ; i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for( int i = 0;i< arr.length;i++){
            sum += arr[i];
        }
        int average = sum / arr.length;
        int count =0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == average){
                count ++;
            }
        }

        System.out.println("average: "+average + "\nIt contains " + count +" "+ average + " elements.");
    }
}
