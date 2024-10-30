package com.enigma.learning_collection.collection;

import java.util.*;

public class CollectionBasic {
    public static void main(String[] args) {
        Iterable<String> iterableList = new ArrayList<>();

        for (String item : iterableList) {
            System.out.println(item);
        }

//        iterableList.add // gak ada method add

        iterableList.forEach(item -> System.out.println(item));

        Collection<String> collection = new ArrayList<>();
        collection.add("Aku");

        List<String> arrayListollection = new ArrayList<>(List.of("Red", "Green", "Blue"));
        List<String> linkedListCollection = new LinkedList<>();

        arrayListollection.set(1, "Yellow");
        arrayListollection.get(1);

        Set<String> hashSet = new HashSet<>();

        hashSet.add("A");
        hashSet.add("A");
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        System.out.println(hashSet);

        SortedMap<String, String> sortedTreeMap = new TreeMap<>();

        sortedTreeMap.put("R", "Red");
        sortedTreeMap.put("G", "Green");
        sortedTreeMap.put("B", "Blue");

        System.out.println(sortedTreeMap);

        Map<String, String> hashMap = new HashMap<>();

        Map<String, String> hashMapVariable = new HashMap<>();

        hashMap.put("R", "Red");
        hashMap.put("G", "Green");
        hashMap.put("G", "Goblin");
        hashMap.put("B", "Blue");
        hashMap.putIfAbsent("B", "Brown");

        System.out.println(hashMap);

        System.out.println("G value=" + hashMap.get("G"));

        System.out.println("C value=" + hashMap.getOrDefault("C", ""));

        System.out.println(hashMap);

        String encodedColor = "RGBBGG";
        String decodedColor = "";
        for (int i = 0; i < encodedColor.length(); i++) {
            decodedColor += hashMap.get(String.valueOf(encodedColor.charAt(i)));
        }
        System.out.println(decodedColor);

        Set<String> listOfColorKeys = hashMap.keySet();
        System.out.println(listOfColorKeys);

        Collection<String> listOfColorValues = hashMap.values();
        System.out.println(listOfColorValues);

//        hashMap {R=Red, B=Blue, G=Green}
    // EntrySet { {R, Red}, {B=Blue}, {G=Green}}
        for (Map.Entry<String, String> keyValuePairEntry : hashMap.entrySet()) {
            System.out.println("key: " + keyValuePairEntry.getKey() + " value: " + keyValuePairEntry.getValue());
        }

//        hashMap.

        hashMap.forEach((key, value) -> System.out.println("key: " + key + " value: " + value));

        String abc = "abc";
//        abc.has

        hashMap.containsKey("R"); // true
        hashMap.containsValue("Red"); // true
    }
}
