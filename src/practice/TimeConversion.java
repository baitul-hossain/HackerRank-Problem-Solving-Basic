package practice;

import java.time.format.DateTimeFormatter;

public class TimeConversion {
    public static String solution(String s) {

        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("hh:mm:ssa");
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("HH:mm:ss");

        String outputTime = outputFormat.format(inputFormat.parse(s));

        System.out.println(outputTime);

        return outputTime;
    }
}
