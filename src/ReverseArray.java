import java.util.Arrays;

public class ReverseArray {


    static int[] reverse(int[] arr){
        int length = arr.length;

        int[] reverse = new int[length];

        for(int i = 0; i < length; i++){
            reverse[i] = arr[length - i - 1];
        }
        return reverse;
    }

    static int[] reverseTwoPointer(int[] arr){
        int start = 0;
        int end = arr.length- 1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] result =reverse(arr);
        System.out.println(Arrays.toString(result));

        System.out.println(Arrays.toString(reverseTwoPointer(arr)));
    }
}
