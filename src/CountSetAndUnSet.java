import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class CountSetAndUnSet {

    static int[] count(int num){
        int set  = 0;
        int unSet = 0;

        while (num > 0){

            if((num & 1) == 1){
                set++;
            }
            else {
                unSet++;
            }
            num = num >> 1;
        }
        return new int[]{set, unSet};
    }
    public static void main(String[] args) {

        int num = 10;
        int[] result = count(num);
        System.out.println(Arrays.toString(result));
    }
}
