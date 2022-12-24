package com.epam.mjc.collections.map;

import java.util.*;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();
        Set<Map.Entry<Integer, String>> entries = sourceMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            Integer valueForNewMap = entry.getKey();
            String keyForNewMap = entry.getValue();
            if (map.isEmpty()) {
                map.put(keyForNewMap, valueForNewMap);
                continue;
            }
            if (map.containsKey(keyForNewMap)) {
                Integer integer = map.get(keyForNewMap);
                if (valueForNewMap < integer) {
                    map.put(keyForNewMap, integer);
                }
            } else map.put(keyForNewMap, valueForNewMap);
        }
        return map;
    }
}
//
//    public static void main(String[] args) {
//        Map<Integer, String> sourceMap = new HashMap<>();
//        sourceMap.put(1, "one");
//        sourceMap.put(2, "two");
//        sourceMap.put(3, "three");
//        sourceMap.put(10, "one");
//        Map<String, Integer> map = new HashMap<>();
//        Set<Map.Entry<Integer, String>> entries = sourceMap.entrySet();
//        for (Map.Entry<Integer, String> entry : entries) {
//            Integer valueForNewMap = entry.getKey();
//            String keyForNewMap = entry.getValue();
//            if (map.isEmpty()) {
//                map.put(keyForNewMap, valueForNewMap);
//                continue;
//            }
//            if (map.containsKey(keyForNewMap)) {
//                Integer integer = map.get(keyForNewMap);
//                if (valueForNewMap < integer) {
//                    map.put(keyForNewMap, integer);
//                }
//            } else map.put(keyForNewMap, valueForNewMap);
//        }
//        System.out.println(map);
//    }
