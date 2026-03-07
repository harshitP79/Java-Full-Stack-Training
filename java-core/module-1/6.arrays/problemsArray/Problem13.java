
public class Problem13 {

    /*
    Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs on O(n) time complexity and without using the division operation.

Example 1 :
Input:
	nums = [1,2,3,4]
Output:
	[24,12,8,6]
	
Example 2 :
Input:
	nums = [-1,1,0,-3,3]
Output:
	[0,0,9,0,0]
	
	
Constraints
2 <= nums.length <= 10^5
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int n = nums.length;
        int[] answer = new int[n];

        // for(int i =0;i<n;i++){
        //     answer[i] = 1;
        //     for(int j=0;j<n;j++){
        //         if(i!=j){
        //             answer[i] = answer[i] * nums[j];
        //         }
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(answer[i] + " ");
        // }

        // Initialize the answer array with 1s
        // for (int i = 0; i < n; i++) {
        //     answer[i] = 1;
        // }

        // Calculate the prefix products
        int prefixProduct = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = prefixProduct;
            prefixProduct *= nums[i];
        }

        // Calculate the suffix products and multiply with the prefix products
        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }

        // Print the result
        for (int value : answer) {
            System.out.print(value + " ");
        }
        
        
     }
}
