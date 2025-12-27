public class Problem7 {
    /*WAJP to find duplicates(Which occurs more than 1) from array without using Collection
and Map. */

public static void main(String[] args) {
    int arr[] = {1,3,2,4,5,3,6,7,8,2,4,1,9,5};
    int len = arr.length;
    System.out.print("Duplicate elements in the array: ");
    for(int i = 0 ;i <len ; i++){
        boolean isDuplicate = false;{
            for(int j = 0 ; j<len ;j++){
                if(i!= j && arr[i]==arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate){
                boolean isAlreadyPrinted = false;
                for(int k =0 ; k<i ; k++){
                    if(arr[i]==arr[k]){
                        isAlreadyPrinted = true;
                        break;
                    }
                }
                if(!isAlreadyPrinted){
                    System.out.print(arr[i] + " ");
                }
            }

            
        }
    }
}
}
