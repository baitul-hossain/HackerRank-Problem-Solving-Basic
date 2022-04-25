package practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class LonelyInteger {
    public static int solution(List<Integer> a) {

        HashMap<Integer, Boolean> duplicateNumbers = new HashMap<>();

        for(int i: a) {
            if(!duplicateNumbers.containsKey(i)) {
                duplicateNumbers.put(i, false);
            } else {
                duplicateNumbers.put(i, true);
            }
        }

        return duplicateNumbers.entrySet().stream().
                filter(entry -> entry.getValue().equals(false)).
                map(Map.Entry::getKey).
                collect(Collectors.toList()).get(0);
    }
}
