package positive;

import java.util.Arrays;

public class Positive {

    // Hiding constructor
    private Positive(){}
    public static int sum(int[] arr){
        int sum = 0;
        for(int num : arr) {
            sum += num >= 0 ? num : 0;
        }
        return sum;
    }

    public static int sumAlternative(int[] arr){
        return Arrays.stream(arr).filter(v -> v > 0).sum();
    }

    public static int sumMath(int[] arr){
        int sum = 0;
        for(int num : arr) {
            sum += Math.max(num, 0);
        }
        return sum;
    }
}
