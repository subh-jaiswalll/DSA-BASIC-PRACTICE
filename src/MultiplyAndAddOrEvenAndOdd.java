public class MultiplyAndAddOrEvenAndOdd {


//    Multiply odd indexed elements by
//2 and add 10 to even indexed elements

    static void Multiplyodd(int[] arr){

        for(int i = 0; i < arr.length; i++){

            if(i % 2 == 0){
                arr[i] = arr[i] + 10;
            }
            else{
                arr[i] = arr[i] * 2;
            }
        }

        for (int num : arr){
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        Multiplyodd(arr);
    }
}
