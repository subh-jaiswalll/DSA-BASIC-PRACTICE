public class SearchAnElement {

    static int search(int[] arr, int k){
        int n = arr.length;

        if(n == 0){
            return  -1;
        }
        for(int i = 0; i<n; i++){
            if(arr[i] == k){
                return i;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {

        int[] arr = {3, 17, 8, 25, 12, 5, 14, 21};
        int k = 57;
        int result = search(arr, k);
        System.out.println(result);

    }
}
