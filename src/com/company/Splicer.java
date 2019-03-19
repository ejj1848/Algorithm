package com.company;

//Your assignment is to take a list of strings representing [city, state, and zip code] and print them in a nice table, one per line. However, the data was input on a keyboard that had a temperamental space bar. Sometimes it doesn't work and other times it generates multiple spaces, so the data may look like
//
//'Rolla,MO   65402'
//or
//
//'Springfield, MO65897'
//The one thing that is consistent is that there is a comma after the city name, the state is always two upper case characters, and the zip code is 5 adjacent characters 0-9.
//
//Your program needs to find the individual components [city, state, zip] in the string, then print them lined up in columns.
//
//One problem is the length of the city name. A simple way to start is to always make the city name be 15 characters long. Look at the string methods in section 9.5 for how to do this. You may have to look on the web for some additional examples. Here is what your output would look like doing that:
//
//Cape Girardeau  MO 63780
//Columbia        MO 65201
//Kansas City     MO 64108
//Rolla           MO 65402
//Springfield     MO 65897
//St Joseph       MO 64504
//St Louis        MO 63111
//Ames            IA 50010
//Enid            OK 73773
//West Palm Beach FL 33412
//International F MN 56649
//Frostbite Falls MN 56650
//A nicer table would always print out the full city name, not just the first 15 characters, but still line things up nicely. For full credit, make it so that there is exactly one space after the longest city name and the start of the state column, like this:
//
//Enid                OK 73773
//West Palm Beach     FL 33412
//International Falls MN 56649
//Frostbite Falls     MN 56650


import java.util.ArrayList;
import java.util.List;

public class Splicer {


    public static void main(String[] args) {
        String[] myCities = {
                "Cape Girardeau, MO 63780",
                "Columbia, MO  65201",
                "Kansas City, MO 64108",
                "Rolla,MO   65402",
                "Springfield, MO65897",
                "St Joseph, MO64504",
                "St Louis,MO63111",
                "Ames,   IA 50010 ",
                "Enid, OK 73773",
                "West Palm Beach, FL 33412",
                "International Falls, MN 56649",
                "Frostbite Falls,MN               56650     "};

        spliceCity(myCities);

    }

    private static List<String> spliceCity(String[] myCities) {

        List<String> formatted = new ArrayList<>();

        for (String s : myCities) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(retrieveCity(s)).append(",").append(retrieveState(s)).append(" ").append(retrieveZip(s));
            formatted.add(stringBuilder.toString());
        }

        formatted.forEach(System.out::println);

        return formatted;
    }

    private static String retrieveZip(String s) {
        String spaceless = s.replaceAll(" ", "");
        return spaceless.substring(spaceless.indexOf(',') + 3);
    }

    private static String retrieveState(String s) {
        String spaceless = s.replaceAll(" ", "");
        return spaceless.substring(spaceless.indexOf(',') + 1, spaceless.indexOf(',') + 3);
    }

    // substring out the city
    private static String retrieveCity(String s) {

        return s.substring(0, s.indexOf(','));
    }
}
