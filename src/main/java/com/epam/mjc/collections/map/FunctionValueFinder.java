package com.epam.mjc.collections.map;

import java.util.*;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        if (sourceList.isEmpty()) {
            return false;
        }
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        return functionMap.containsValue(requiredValue);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> map = new HashMap<>();
        if (sourceList.isEmpty()) {
            return map;
        }
        for (Integer value : sourceList) {
            map.put(value, value * 5 + 2);
        }
        return map;
    }
}
