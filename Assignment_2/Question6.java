package Assignment_2;

public class Question6 {
    private static int binarySearch(int []nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={-1,0,3,5,9,12};
        int target=9;
        int index=binarySearch(nums,target);
        System.out.println(index);

    }
}
