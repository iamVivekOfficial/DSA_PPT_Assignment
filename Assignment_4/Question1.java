import java.util.ArrayList;
import java.util.List;

public class Question1{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 7, 9};
        int[] arr3 = {1, 3, 4, 5, 8};

        int[] result = findCommonElements(arr1, arr2, arr3);
        for (int element : result) {
            System.out.print(element + " ");
        }
    }

    public static int[] findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> commonElements = new ArrayList<>();

        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                commonElements.add(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }

        int[] result = new int[commonElements.size()];
        for (int index = 0; index < commonElements.size(); index++) {
            result[index] = commonElements.get(index);
        }

        return result;
    }
}
