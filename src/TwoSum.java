

public class TwoSum {

public static void main(String args[]) {
	 int nums[] = {11,7,2,15};
	 int target= 9;
	TwoSum ss= new TwoSum();
	int[] arr= ss.solution(nums, target);
	System.out.println(arr[0]+" "+arr[1]);
   
    }
public  int[]  solution(int nums [], int target) {
	int[] arr = null;
for (int i = 0;i<nums.length;i++) {
	int temp = nums[i]+nums[i+1];
	if(temp == target) {
		 arr =new int[] {i,i+1};
		//arr.add(i);
		//arr.add(i+1);
		
		break;
	
	}
	
}

return arr;
}
}
/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

