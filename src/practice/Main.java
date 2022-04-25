package practice;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();

        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(3);
        input.add(2);
        input.add(1);

        LonelyInteger.solution(input);
    }
}
