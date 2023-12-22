public class main {
    public static void main(String[] args) {
        int [] arr = {1, 2, 6, 9, 10, 11, 15, 45, 66, 76};
        int target = 55;
        System.out.println(binary_search(arr, target));
    }
    public static int binary_search(int[]arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
