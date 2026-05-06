public class Series_Printing03 {


    public static void Printing(int n){

        int a = 0;
        int b = 1;

        if(n == 0){
            System.out.println(0);
            return;
        }
        if(n == 1){
            System.out.println(0);
            return;
        }
        if(n == 2){
            System.out.println(1);
            return;
        }

        for(int i = 2; i < n; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(b);
    }
    public static void main(String[] args) {
        int n = 9;
        Printing(n);

    }
}
