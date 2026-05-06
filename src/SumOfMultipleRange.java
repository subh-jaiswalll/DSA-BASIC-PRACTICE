public class SumOfMultipleRange {

    static int sumOfRange(int n, int k){
        int sum = 0;

        for(int i = 1; i <= n; i++){
            if(i % k == 0){
                sum += i;
            }
        }
        return  sum;
    }
    public static void main(String[] args) {

        int n = 10;
        int k = 3;

        int result = sumOfRange(n, k);
        System.out.println(result);
    }
}
