package practice;

import java.text.DecimalFormat;

public class PlusMinus {
    public static void solution(int[] arr) {

        int positivesCount = 0;
        int negativesCounts = 0;
        int zeroCount = 0;
        int arrayLength = arr.length;

        for(Integer number: arr) {
            if(number > 0) {
                positivesCount++;
            } else if(number < 0) {
                negativesCounts++;
            } else if(number == 0) {
                zeroCount++;
            }
        }

        DecimalFormat df = new DecimalFormat("#0.000000");

        System.out.println(df.format((double) positivesCount/arrayLength));
        System.out.println(df.format((double) negativesCounts/arrayLength));
        System.out.println(df.format((double) zeroCount/arrayLength));
    }
}
