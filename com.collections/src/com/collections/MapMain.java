package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMain {
    public static void main(String[] args) {
        HashMap countries = new HashMap();
        HashMap<Integer, String> countries1 = new HashMap<>();
        Map languages = new HashMap();
        Map<String, String> languages1 = new HashMap<>();

        countries1.put(1, "USA");
        countries1.put(2, "MEX");
        countries1.put(3, "CAN");

        System.out.println(countries1.get(1));

        System.out.println(countries1.keySet());

        countries1.remove(1);

        System.out.println(countries1.keySet());

        countries1.put(1, "USA");
        System.out.println(countries1.keySet());
        countries1.put(1, "SAN");
        System.out.println(countries1.get(1));

        System.out.println(countries1.values());

        System.out.println(countries1.containsKey(1));
        System.out.println(countries1.containsValue("CAN"));

        // TreeMap declaration.

        TreeMap<Integer, String> planets = new TreeMap<>();
        Map<String, String> englishSpanish = new TreeMap<>();

        planets.put(3, "Earth");
        planets.put(2, "Venus");
        planets.put(4, "Mars");

        englishSpanish.put("dog", "perro");
        englishSpanish.put("cat", "gato");
        englishSpanish.put("fish", "pez");

        System.out.println(planets.keySet().toString());
        System.out.println(englishSpanish.keySet().toString());
    }
}
