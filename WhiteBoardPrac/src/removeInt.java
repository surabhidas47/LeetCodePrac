import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeInt {

//    Input: nums = [3,2,2,3], val = 3
//    Output: 2, nums = [2,2,_,_]
    public int removeElement(int[] nums, int val) {

        int x = 0;

        for (int i =0;i<nums.length;i++){
            if (nums[i]!=val){
                nums[x]=nums[i];
                x++;
            }

        }
        return x;
    }

}
