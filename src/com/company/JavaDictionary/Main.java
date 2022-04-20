package com.company.JavaDictionary;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Dictionary> dictionaryHashMap = new HashMap<>();
        dictionaryHashMap.put("String",
                new Dictionary("String", "class that will help you handle text in java - String text = \"New Text\""));
        dictionaryHashMap.put("Set",
                new Dictionary("Set", "Structure to store unique data - Set<String> set = new HashSet<>()"));
        dictionaryHashMap.put("Override ",
                new Dictionary("Override", "Overrides a method in the child class - \n" +
                        "@Override\n" +
                        "Public void exampleMethod(){}\n"));
        dictionaryHashMap.put("Int",
                new Dictionary("Int", "a data type used to represent real numbers that do not have fractional values"));
        dictionaryHashMap.put("Double",
                new Dictionary("Double", "A double type variable is a 64-bit floating data type"));
        dictionaryHashMap.put("Object",
                new Dictionary("Object", "An object, in object-oriented programming (OOP), is an abstract data type created by a developer"));


        System.out.println(dictionaryHashMap.get("String"));
        System.out.println(dictionaryHashMap.get("Object"));
    }
}
