import java.util.Arrays;

public class NumberOfSmallElements {
    public static void main(String[] args) {
        int [] array = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(SmallElementsCounter(array)));
    }
    public static int [] SmallElementsCounter(int[] array){
        int [] result = new int[array.length];
        int count = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i] > array[j]){
                    count++;
                }
            }
            result[i] = count;
            count = 0;  
        }
        return result;
    }
}
