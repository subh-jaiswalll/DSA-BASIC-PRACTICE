public class PerfactSqureOfRange {


    static void SqureRange(int n){

        for(int i = 1; i * i <= n; i++){

            System.out.println(i * i);
        }
    }
    public static void main(String[] args) {
        int n = 15;
        SqureRange(n);
    }
}
