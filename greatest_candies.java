import java.util.ArrayList;
import java.util.List;

public class greatest_candies {
    public static void main(String[] args) {
        int [] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

   public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int maxCandies = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            maxCandies = Math.max(candies[i], maxCandies);
        }

        List<Boolean> result = new ArrayList<>();
        for(int i = 0; i < n; i++){
            result.add(candies[i] + extraCandies >= maxCandies);
        }
        return result;
    }
}
