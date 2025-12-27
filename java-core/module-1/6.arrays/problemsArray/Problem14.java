
public class Problem14 {

    /* Given an integer array nums, move all 0’s to the end of it while maintaining the relative order of the non-zero elements.

Note: You must do this in-place without making a copy of the array.

Example 1 :
Input:
	nums = [0,1,0,3,12]
Output:
	[1,3,12,0,0]
	
Example 2 :
Input:
	nums = [0]
Output:
	[0]
	
	
Constraints :
1 <= nums.length <= 10^4
-2^31 <= nums[i] <= 2^31 - 1
Difficulty Level*/

    public static void main(String[] args) {
        int nums[] = {0, 1, 0, 3, 12};
        int n = nums.length;
        int nonZeroIndex = 0;
        for(int i = 0;i<n;i++){
            if(nums[i] != 0){
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        // Fill remaining positions with 0s
        for(int i = nonZeroIndex;i<n;i++){
            nums[i] = 0;
        }

        for(int i =0;i<n;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
