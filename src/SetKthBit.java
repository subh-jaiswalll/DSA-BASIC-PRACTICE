public class SetKthBit {

    static int setKBit(int n, int k){
        return n |(1 << k);
    }
    public static void main(String[] args) {
        int n = 5;
        int k = 1;
        System.out.println(setKBit(n, k));
    }
}
