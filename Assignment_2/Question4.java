package Assignment_2;

public class Question4 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i=0;
        int size=flowerbed.length;
        int c=0;
        while(i<size){
            if(flowerbed[i]==0){
                if((i==0 || flowerbed[i-1]==0) &&(i==size-1 ||flowerbed[i+1]==0)){
                    flowerbed[i]=1;
                    c++;
                    if(c>=n){
                        return true;
                    }
                }
            }
            i++;

        }
        return c>=n;
    }
    public static void main(String[] args) {
       int[] flowerbed = {1,0,0,0,1};
       int n = 1;
        System.out.println(canPlaceFlowers(flowerbed,n));
    }
}
