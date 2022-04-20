package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<String> hashSetCountries = new HashSet<>();
        ArrayList<String> listCountries = new ArrayList<>();

        listCountries.add("Germany");
        listCountries.add("Spain");
        listCountries.add("Germany");
        listCountries.add("Bulgaria");
        listCountries.add("Greece");
        listCountries.add("France");
        listCountries.add("France");


        hashSetCountries.add("Germany");
        hashSetCountries.add("Spain");


        System.out.println("HashSet: " + hashSetCountries);
        System.out.println("List:" + listCountries);
        System.out.println(listCountries.size());
        System.out.println(hashSetCountries.size());

        hashSetCountries.clear();

        hashSetCountries.addAll(listCountries);

        System.out.println(listCountries);
        System.out.println(hashSetCountries);


        Set<Country> countries = new HashSet<>();
        countries.add(new Country("Bulgaria", "Sofia", "bulgarian"));
        countries.add(new Country("Romania", "Bucharest", "romanian"));
        countries.add(new Country("Italy", "Rome", "italian"));

        System.out.println(findCountryByCapital(countries, "Sofia"));

        Map<Long, String> students = new HashMap<>();
        students.put(1L, "Ted");
        students.put(2L, "Bob");
        students.put(3L, "Ted");
        students.put(443234L, "Josh");

        System.out.println(students);

        System.out.println(students.keySet());
        System.out.println(students.values());
        students.put(1L, "Sam");

        System.out.println(students);
        System.out.println(students.get(2L));
        System.out.println(students.remove(1L));
        students.put(1L, "Ted");

        System.out.println(students.entrySet());

        System.out.println(students);

        HashMap<String, Country> countryMap = new HashMap<>();

        fillMapFromSet(countries, countryMap);

        System.out.println(countryMap.get("Sofia"));

        System.out.println(findCountryBySpokenLanguage(countryMap, "italian"));


    }

    private static void fillMapFromSet(Set<Country> countries, HashMap<String, Country> countryMap) {
        for (Country country : countries) {
            countryMap.put(country.getCapital(), country);
        }
    }

    public static Country findCountryByCapital(Collection<Country> countries, String capital) {
        Country result = null;
        for (Country country : countries) {
            if (country.getCapital().equals(capital)) {
                result = country;
            }
        }
        return result;
    }


    public static Country findCountryBySpokenLanguage(HashMap<String, Country> countryMap, String language) {
        Country result = null;
        Set<Map.Entry<String, Country>> countrySet = countryMap.entrySet();
        for (Map.Entry<String, Country> stringCountryEntry : countrySet) {
            if (stringCountryEntry.getValue().getLanguage().equals(language)) {
                result = stringCountryEntry.getValue();
            }
        }
        return result;
    }
}
