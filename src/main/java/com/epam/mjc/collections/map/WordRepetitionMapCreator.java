package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        if (!sentence.isEmpty()) {
            List<String> delimiters = new ArrayList<>(Arrays.asList(" ", ",", "."));
            String s = sentence.toLowerCase();
            String[] split = s.split(delimiters.toString());
            map.put(split[0], 1);
            for (int i = 1; i < split.length; i++) {
                if (split[i].equals("")) {
                    continue;
                }
                if (!map.containsKey(split[i])) {
                    map.put(split[i], 1);
                } else {
                    Integer integer = map.get(split[i]);
                    map.put(split[i], ++integer);
                }
            }
        }
        return map;
    }
}

