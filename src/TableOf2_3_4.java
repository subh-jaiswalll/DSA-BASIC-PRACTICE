public class TableOf2_3_4 {

    static void Table(int x, int y){


        for(int i = x; i <= y; i++){

            for(int j = 1; j <= 10; j++){
                if(j == 10){
                    System.out.print(i * j);
                }
                else {
                    System.out.print(i * j +" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int x = 2;
        int y = 4;
         Table(x, y);
    }
}
