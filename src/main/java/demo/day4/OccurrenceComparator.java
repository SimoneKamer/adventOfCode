package demo.day4;

import java.util.Comparator;
import java.util.Map;

public class OccurrenceComparator implements Comparator<Map.Entry<Character, Integer>> {
    @Override
    public int compare(Map.Entry<Character, Integer> first, Map.Entry<Character, Integer> other) {
        int byTimesFound = other.getValue().compareTo(first.getValue());
        if (byTimesFound !=0) {
            return byTimesFound;
        }
        return first.getKey().compareTo(other.getKey());
    }
}
