public class UnSetKthBit {


    static int unSetKBit(int n, int k){
        return n &~ (1 << k);
    }

    public static void main(String[] args) {
        int n = 13;
        int k = 2;

        int result = unSetKBit(n, k);
        System.out.println(result);
    }
}
