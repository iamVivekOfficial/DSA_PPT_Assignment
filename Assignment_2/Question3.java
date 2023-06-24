package Assignment_2;

import java.util.HashMap;
import java.util.Iterator;

public class Question3 {
    public static int findLHS(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int len=0;

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Iterator<Integer> itr=map.keySet().iterator();
        while(itr.hasNext()){
            int key=(int)itr.next();
            if(map.containsKey(key+1)){
                len=Math.max(len,map.get(key)+map.get(key+1));
            }

        }
        return len;

    }
    public static void main(String[] args) {
        int [] nums={1,3,2,2,5,2,3,7};
        int len=findLHS(nums);
        System.out.println(len);
    }
}
