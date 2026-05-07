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
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        leftRotateArray(arr);

        leftRotateArrayK(arr, 2);
    }
}
