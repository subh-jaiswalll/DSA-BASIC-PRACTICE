import java.util.Arrays;

public class LeftRotateArray {



    static void leftRotateArray(int[] arr){

        int first = arr[0];

        for(int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = first;


        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static void leftRotateArrayK(int[] arr, int k){

        for(int j = 0; j < k; j++) {


            int first = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[arr.length - 1] = first;
        }

        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static void leftRotateTwoPointer(int[] arr, int k){

        int n = arr.length;

        k = k % n;

        // Step 1
        rotate(arr, 0, k - 1);

        // Step 2
        rotate(arr, k, n - 1);

        // Step 3
        rotate(arr, 0, n - 1);

        for (int num : arr){
            System.out.print(num + " ");
        }


    }

    static void rotate(int[] arr, int start, int end){

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        leftRotateArray(arr);

        leftRotateArrayK(arr, 2);
        int k  = 2;
        leftRotateTwoPointer(arr, k);
    }
}
