import java.util.HashMap;
import java.util.HashSet;

public class FirstDuplicateNumber {

    static int findDuplicate(int[] num){
        int n = num.length;
        for(int i = 0; i < n; i++){

            for(int j = i + 1; j < n; j++){
                if(num[i] == num[j]){
                    return num[i];
                }
            }
        }
        return  -1;
    }

    static int findDuplicateHashing(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){

            if(set.contains(num)){
                return num;
            }

            set.add(num);
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] arr = {7, 23, 15, 42, 7, 56, 89, 91, 42};

        int result = findDuplicate(arr);
        System.out.println(result);

        int hashing = findDuplicateHashing(arr);
        System.out.println(hashing);
    }
}
