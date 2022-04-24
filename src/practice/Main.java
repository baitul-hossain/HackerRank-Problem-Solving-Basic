package practice;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(9);

        MiniMaxSum.solution(arr);
    }
}
