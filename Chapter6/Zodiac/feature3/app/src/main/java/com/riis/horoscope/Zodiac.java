package com.riis.horoscope;


public class Zodiac {
    private String name;
    private String description;
    private String symbol;
    private String month;


    public static final Zodiac[] signs = {
            new Zodiac("Aries","Enterprising, Incisive, Spontaneous, Daring, Active, Courageous and Energetic, the Aries are the proverbial infants, guileless and optimistic to the fault.", "Ram", "April"),
            new Zodiac("Taurus","Known for being reliable, practical, ambitious and sensual, the people born under the Zodiac Sign Taurus have an eye for beauty.", "Bull", "May"),
            new Zodiac("Gemini","Gemini-born are clever and intellectual people but they can also be tense and restless.", "Twins", "June"),
            new Zodiac("Cancer"," The otherwise tenacious, loyal, sympathetic and strong Crabs are vulnerable in many ways.", "Crab", "July"),
            new Zodiac("Leo","Warm, action-oriented and driven by the desire to be loved and admired, the Leo have an air royalty about them.", "Lion", "August"),
            new Zodiac("Virgo","Methodical, meticulous, analytical and mentally astute, the Virgo natives are perfectionists to the core, or at least, they like to believe that they are.", "Virgin", "September"),
            new Zodiac("Libra","Librans are famous for maintaining balance and harmony.", "Scales", "October"),
            new Zodiac("Scorpio","The Scorpio-born are strong willed and mysterious, and they know how to effortlessly grab the limelight, as they possess what it takes to achieve their goals.", "Scorpion", "November"),
            new Zodiac("Sagittarius","Sagittarians are born adventurers. They tend to get bored with things easily and move on with life", "Archer", "December"),
            new Zodiac("Capricorn","The Capricorn-born people are the most determined of the entire Zodiac.", "Goat", "January"),
            new Zodiac("Aquarius","The Aquarius-born people are humanitarians to the core", "Water Bearer", "February"),
            new Zodiac("Pisces","Pisces or the Fish is considered as the proverbial dreamers of the Zodiac.", "Fish", "March"),
    };


    private Zodiac(String name, String description, String symbol, String month) {
        this.name = name;
        this.description = description;
        this.symbol = symbol;
        this.month = month;
    }

    public String getName() { return name; }

    public String getDescription() { return description;  }

    public String getSymbol() { return symbol; }

    public String getMonth() { return month; }

    public String toString() { return this.name; }
}