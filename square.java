import java.util.*;
class square {
    public int[] sortedSquares(int[] nums) {
        int[] newArr = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            newArr[i] = (int)Math.pow(nums[i],2);
        }
        Arrays.sort(newArr);
        return newArr;
    }
}