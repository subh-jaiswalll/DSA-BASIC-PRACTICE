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
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        rightRotateArray(arr);
        rightRotateArrayK(arr, 2);
    }
}
