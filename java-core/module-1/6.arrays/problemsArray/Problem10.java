public class Problem10 {
    /*Find the average of the largest and smallest element of an unsorted array! */
    public static void main(String[] args) {
        int arr[] = {1,4,3,4};
        int len = arr.length;

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < len; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        int count = 0;
        double sum = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] == largest || arr[i] == smallest) {
                sum += arr[i];
                count++;
            }
        }
       double average = sum / count;
        System.out.println("Average of largest and smallest element: " + average);

        
    }
}
