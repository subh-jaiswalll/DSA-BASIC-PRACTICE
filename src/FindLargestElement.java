public class FindLargestElement {

    static int largestElement(int[] arr){
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int[] arr = {12, 5, 32, 18, 25};
        int result = largestElement(arr);
        System.out.println(result);
    }
}
