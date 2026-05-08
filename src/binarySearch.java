public class binarySearch {

    static int searchInSortedArray(int[] arr, int target){

        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > target){
                end = mid - 1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 7, 12, 35, 64, 67, 99};
        int target = 0;

        int result = searchInSortedArray(arr, target);
        System.out.println(result);
    }
}
