
class Problem5 {


    /* WAJP to print occurrence of each element without using Map. */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1, 3, 6, 4, 7};
        int len = arr.length;
        boolean[] visited = new boolean[len];
        
        for (int i = 0; i < len; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println("Element " + arr[i] + " occurs " + count + " times.");
        }


    }
}
