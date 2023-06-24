package Assignment_2;

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        int []nums={1,4,3,2};
        int sum=maxiSum(nums);
        System.out.println(sum);
    }

    private static int maxiSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<n-1;i+=2){
            sum+=nums[i];//min always first value in nums[i] and nums[i+1] bcz of sorting
        }
        return sum;
    }
}
