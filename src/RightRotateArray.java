public class RightRotateArray {


    static void rightRotateArray(int[] arr){

        int last = arr[arr.length - 1];

        for(int i = arr.length - 1; i > 0; i--){
            arr[i] = arr[i - 1];
        }

        arr[0] = last;

        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }


    static void rightRotateArrayK(int[] arr, int k){

        for(int j = 0; j < k; j++){

            int last = arr[arr.length - 1];

            for(int i = arr.length - 1; i > 0; i--){
                arr[i] = arr[i - 1];
            }

            arr[0] = last;
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static void rotateTwoPointer(int[] arr, int k){
        int n = arr.length;

        k = k % n;

        rotate(arr, 0, n- 1 );
        rotate(arr, 0 , k - 1);
        rotate(arr, k , n -1);

        for (int num : arr){
            System.out.print(num + " ");
        }
    }
    static void rotate(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        rightRotateArray(arr);
        rightRotateArrayK(arr, 2);
        rotateTwoPointer(arr, 2);
    }
}
