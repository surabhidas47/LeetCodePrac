public class AddTwoNums {

//    Given an array of integers nums and an integer target, return
//    indices of the two numbers such that they add up to target.
//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]


    class Solution {
        public int[] twoSum(int[] nums, int target) {

            for (int i=0;i<nums.length; i++){
                for (int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target) {
                        return new int [] {i,j};
                    }

                }

            }
            throw new IllegalArgumentException("no matches");
        }
    }

}
