package Assignment_2;

import java.util.HashSet;

public class Question2 {
    public static int distributeCandies(int[] candyType) {
        int n = candyType.length / 2;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < candyType.length; i++) {
            set.add(candyType[i]);
        }

        int size = set.size();
        return Math.min(n, size);
    }
        public static void main (String[]args){
            int[] candyType = {1, 1, 2, 2, 3, 3};
            int maxCandy = distributeCandies(candyType);
            System.out.println(maxCandy);
        }

}
