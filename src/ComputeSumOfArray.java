public class ComputeSumOfArray {


    static int SumOfArray(int[] arr){
        int sum  = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++){
            sum = arr[i] + sum;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr =  {4, 8 ,2, 9, 12, 1};

        int result = SumOfArray(arr);
        System.out.println(result);
    }
}
