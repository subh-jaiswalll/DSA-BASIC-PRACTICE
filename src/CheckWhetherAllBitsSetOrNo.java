public class CheckWhetherAllBitsSetOrNo {


    static boolean checkBits(int n){
        return (n & (n + 1)) == 0;
    }

    public static void main(String[] args) {

        int n = 10;
        System.out.println(checkBits(n));
    }
}
