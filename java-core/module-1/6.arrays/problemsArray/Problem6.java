public class Problem6 {
    /*WAJP to find unique elements from array without using collection and map. */
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 4, 5, 1, 6, 7, 5, 8};
        int len = arr.length;
        System.out.print("Unique elements in the array: ");
        for(int i = 0;i<len;i++){
            boolean isUnique = true;
            for(int j =0;j<len;j++){
                if(i != j && arr[i] == arr[j]){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                System.out.print(arr[i] + " ");
            }
        }
    }
} 
