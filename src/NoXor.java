public class NoXor {

    static long NoXor(long[] a){

        long sum = 0;
        long n = a.length;


        for(int i = 0; i < n; i++){

            sum = sum + ((n - (i + 1)) ^ a[i]);
        }
        return sum;
    }
    public static void main(String[] args) {

        long[] arr = {1, 2, 3, 4, 5};
        long result = NoXor(arr);
        System.out.println(result);
    }
}
