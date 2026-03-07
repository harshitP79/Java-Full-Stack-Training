public class Problem4 {
    //WAJP to find union from two array without collection.
    // WAJP to find intersection from two array without collection.
    
    
    public static void union(int arr1[], int arr2[]) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int arr3[] = new int[len1 + len2];
        int k = 0;

        for (int i = 0; i < len1; i++) {
            arr3[k++] = arr1[i];
        }
        for (int j = 0; j < len2; j++) {
            boolean found = false;
            for (int i = 0; i < len1; i++) {
                if (arr2[j] == arr1[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                arr3[k++] = arr2[j];
            }
        }


        
        System.out.print("Union of two arrays: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
    }

    public static void intersection(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int arr3[] = new int[Math.min(len1, len2)];
        int k = 0;

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (arr1[i] ==  arr2[j]) {
                    arr3[k++] = arr1[i];
                    break;
                }
            }
        }

        System.out.print("Intersection of two arrays: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        
    }
    
    
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {4, 5, 6, 2,3 ,8};
        union(arr1, arr2);
        intersection(arr1, arr2);
    }
}
