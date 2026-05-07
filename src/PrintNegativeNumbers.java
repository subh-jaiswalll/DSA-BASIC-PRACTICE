public class PrintNegativeNumbers {

    static void printNegative(int[] arr){

        for(int i = 0; i < arr.length; i++){

            if(arr[i] < 0){
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {-1, 3, 0, -3, -5, -6};
        printNegative(arr);
    }
}
