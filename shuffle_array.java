import java.util.Arrays;

public class shuffle_array {
    public static void main(String[] args) {
        int [] array = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(ShuffleOFArray(array, n)));
    }
    public static int [] ShuffleOFArray(int [] array, int n){
        int [] array1 = new int[2 * n];
        int j = 0;
        for(int i = 0; i < n; i++){
            array1[j] = array[i];
            j = j + 2;
        }        
        int k = 1;
        for(int i = n; i < 2 * n; i++){
            array1[k] = array[i];
            k = k + 2;
        }

        return array1;
    }
}
