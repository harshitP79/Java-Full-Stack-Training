

public class Problem1 {
     /*WAJP to print even elements from the given array */

    public static void evenElements(int[] arr){
        System.out.print("Even Elements in the array are : ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i] + " ");
            }
        }
    }
 /*WAJP to print prime elements from the given array*/
   
    public static void primeElements(int[] arr){
        System.out.print("Prime Elements in the array are : ");
        for(int i = 0;i<arr.length;i++){
            int count = 0;
            for(int j=1;j<=arr[i];j++){
                if(arr[i]%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(arr[i]+" ");
            }
        }
    }
 /*WAJP to print  perfect elements from the fiven array */
    public static void perfectNum(int[] arr){
        System.out.print("Perfect Numbers in the array are : ");
        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            for(int j=1;j<arr[i];j++){
                if(arr[i]%j==0){
                    sum+=j;
                }
            }
            if(sum==arr[i]){
                System.out.print(arr[i]+" ");
            }
        }
    }
    /*WAJP to find sum of all element.*/
    public static void sumOfElements(int[] arr){
        int sum = 0;
        for(int i = 0 ;i < arr.length;i++){
            sum += arr[i];
        }
        System.out.println("Sum of all elements in the array is : " + sum);
    }
    // WAJP to find product of all elements
    public static void productOfElements(int[] arr){
        int product = 1;
        for(int i = 0 ;i < arr.length;i++){
            product *= arr[i];
        }
        System.out.println("Product of all elements in the array is : " + product);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        // Scanner sc = new Scanner(System.in);
        evenElements(arr);
        System.out.println();
        primeElements(arr);
        System.out.println();
        perfectNum(arr);
        System.out.println();
        sumOfElements(arr);
        System.out.println();
        productOfElements(arr);
    }
}
