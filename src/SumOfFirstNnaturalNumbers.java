public class SumOfFirstNnaturalNumbers {

    static int sumOfNumbers(int n){
        int sum = 0;

        for(int i = 0; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {

        int n = 10;
        int result = sumOfNumbers(n);
        System.out.println(result);
    }
}
