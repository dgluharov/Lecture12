package com.company;

public class Country {
    private String countryName;
    private String capital;
    private String language;

    public Country(String countryName, String capital, String language) {
        this.countryName = countryName;
        this.capital = capital;
        this.language = language;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", capital='" + capital + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
