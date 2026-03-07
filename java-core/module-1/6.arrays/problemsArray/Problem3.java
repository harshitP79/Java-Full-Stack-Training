public class Problem3 {
    /* WAJP to merge the two array without collection. 
    */
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,5,6,7,8};
        int[] arr2 = {9,10,11,12,13,14};
        int [] arr3;
        int len1 = arr1.length;
        int len2 = arr2.length;
        
        arr3 = new int[len1 + len2];

        for(int i=0; i<len1; i++){
            arr3[i] = arr1[i];
        }
        for(int j=0; j<len2; j++){
            arr3[len1 + j] = arr2[j];
        }

        for(int k=0; k<arr3.length; k++){
            System.out.print(arr3[k] + " ");
        }

    }
}
