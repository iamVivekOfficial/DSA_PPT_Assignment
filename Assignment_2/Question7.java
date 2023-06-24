package Assignment_2;

public class Question7 {
    public static boolean isMonotonic(int[] nums) {
        boolean monInc=true;
        boolean monDec=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                monInc=false;
            }
            if(nums[i]<nums[i+1]){
                monDec=false;
            }
        }
        return monInc||monDec;
    }

    public static void main(String[] args) {
        int []nums={1,2,2,3};
        System.out.println(isMonotonic(nums));
    }
}
