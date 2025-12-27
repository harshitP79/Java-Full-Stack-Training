

public class Problem15 {
    /*Trapping Rain Water
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

Example 1
Input:
	height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output:
	6
	
	
Explanation:


​
The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
In this case, 6 units of rain water (blue section) are being trapped.

Example 2
Input:
	height = [4,2,0,3,2,5]
Output:
	9
	
	
Constraints
n == height.length
1 <= n <= 2 * 10^4
0 <= height[i] <= 10^5 */
public static int trappingRainwater(int [] arr){
    // nt arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
    int len  = arr.length;
    int left[] = new int[len];
    int right[] = new int[len];
    left[0]= arr[0]; 
    for(int i = 1;i<len;i++){
        left[i] = Math.max(left[i-1],arr[i]);
    }

    right[len-1]=arr[len-1];
    for(int i = len-2;i>0;i--){
        right[i] = Math.max(right[i+1], arr[i]); 
    }

    int sum = 0;
    for(int i = 0;i<len;i++){
        sum+= Math.min(left[i],right[i]) - arr[i];
    }
    return sum;
}
public static void main(String[] args) {
    
    int arr[]= {0,1,0,2,1,0,1,3,2,1,2,1};
    System.out.println(trappingRainwater(arr));
}
}
