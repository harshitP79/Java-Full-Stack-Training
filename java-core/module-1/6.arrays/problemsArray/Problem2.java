
public class Problem2 {

    // WAJP to find smallest element without sorting.
    public static void smallestElement(int[] arr) {
        // System.out.println("Finding smallest element in the array");
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest element in the array is : " + smallest);
    }

    // WAJP to find largest element without sorting.
    public static void largestElement(int[] arr) {
        // System.out.println("Finding largest element in the array");
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest element in the array is : " + largest);
    }

    // WAJP to find the second Smallest ELement without sorting.
    public static void secondSmallestElement(int[] arr) {
        int s = Integer.MAX_VALUE;
        int ss = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < s) {
                ss = s;
                s = arr[i];

            } else if (arr[i] < ss && arr[i] > s) {
                ss = arr[i];
            }
        }
        System.out.println("The Second Smallest Element in the array is : " + ss);
    }

    // WAJP to find the second largest ELement without sorting.
    public static void secondLargestElement(int[] arr) {
        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > l) {
                sl = l;
                l = arr[i];
            } else if (arr[i] > sl && arr[i] < l) {
                sl = arr[i];
            }
        }
        System.out.println("The Second Largest Element in the array is : " + sl);

    }

    // WAJP to find the third smallest ELement without sorting.
    public static void thirdSmallest(int[] arr){
        int s = Integer.MAX_VALUE;
        int ss = Integer.MAX_VALUE;
        int ts = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < s) {
                ts = ss;
                ss = s;
                s = arr[i];
            } else if (arr[i] < ss && arr[i] > s) {
                ts = ss;
                ss = arr[i];
            } else if (arr[i] < ts && arr[i] > ss) {
                ts = arr[i];
            }
        }
        System.out.println("The Third Smallest Element in the array is : " + ts);
    }
    // WAJP to find the third largest ELement without sorting.  
    public static void thirdLargestElement(int[] arr){
        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        int tl = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > l) {
                tl = sl;
                sl = l;
                l = arr[i];
            } else if (arr[i] > sl && arr[i] < l) {
                tl = sl;
                sl = arr[i];
            } else if (arr[i] > tl && arr[i] < sl) {
                tl = arr[i];
            }
        }
        System.out.println("The Third Largest Element in the array is : " + tl);
    }
    public static void main(String[] args) {
        int[] arr = {89,89,77,88,34, 12, 1, 1, 5, 67, 23,89, 89, 1, 1, 45, 78, 2};
        smallestElement(arr);
        largestElement(arr);
        secondSmallestElement(arr);
        secondLargestElement(arr);
        thirdSmallest(arr);
        thirdLargestElement(arr);
    }
}
