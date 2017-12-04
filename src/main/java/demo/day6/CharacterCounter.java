package demo.day6;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class CharacterCounter {
    Map<Character, Integer> countedCharacterMap = new HashMap<>();

    void countEveryCharacter(Character letter) {

        if (countedCharacterMap.containsKey(letter)) {
            Integer timesFound = countedCharacterMap.get(letter);
            countedCharacterMap.put(letter, (timesFound + 1));
        } else {
            countedCharacterMap.put(letter, 1);
        }
    }

    public Character getMostCommunicatedCharacter() {
        Character mostFoundCharacter = '\0';
        int maxValueInMap=(Collections.max(countedCharacterMap.values()));
        for (Map.Entry<Character, Integer> entry : countedCharacterMap.entrySet()) {
            if (entry.getValue()==maxValueInMap) {
                mostFoundCharacter = (entry.getKey());
            }
        }
        return mostFoundCharacter;
    }

    public Character getLeastCommunicatedCharacter () {
        Character leastFoundCharacter = '\0';
        int minValueInMap=(Collections.min(countedCharacterMap.values()));
        for (Map.Entry<Character, Integer> entry : countedCharacterMap.entrySet()) {
            if (entry.getValue()==minValueInMap) {
                leastFoundCharacter = (entry.getKey());
            }
        }
        return leastFoundCharacter;
    }
}
