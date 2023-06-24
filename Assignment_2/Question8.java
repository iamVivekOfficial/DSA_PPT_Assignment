package Assignment_2;

public class Question8 {
    public static int smallestRangeI(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }

        int diff=(max-k)-(min+k);
        return diff<0?0:diff;
    }

    public static void main(String[] args) {
        int []nums = {0,10};
        int k = 2;
        System.out.println(smallestRangeI(nums,k));
    }
}
