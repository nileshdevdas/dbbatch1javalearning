/**
 * Pacakge namespace
 */
package com.vinsys.airports;

// java.net

import java.net.Socket;
//java.sql
import java.sql.Array;
import java.sql.Connection;
// collection api
import java.util.*;
// io Library
import java.io.File;
// Native io
import java.nio.file.Files;
import java.util.stream.Collectors;

/**
 * Import statements
 */

public class SampleExample {
    public static void main(String[] args) {
        /** invoked a ArrayList(); of type List **/
        List<String> airportNames = getAirports();
        airportNames.add(24, "Airport x12");
        airportNames.forEach(SampleExample::printAirports);
        Set<String> airports = getUniqueAirports();
        Set<String> filteredAirports =
                airports.stream().filter(
                        (each) -> each.endsWith("2"))
                        .collect(Collectors.toSet());
        System.out.println("Filtered Airports Size "+ filteredAirports.size());
        filteredAirports.forEach((e)-> System.out.println(e));
    }

    private static Set<String> getUniqueAirports() {
        Set<String> uniqueAirports = new HashSet<>();
        for (int i = 0; i < 1000; i++) {
            uniqueAirports.add("Airport " + i);
        }
        uniqueAirports.add("Airport " + 1);
        uniqueAirports.add("Airport " + 2);
        uniqueAirports.add("Airport " + 1);
        uniqueAirports.add("Airport " + 2);
        System.out.println(uniqueAirports.size());
        return uniqueAirports;
    }

    static void printAirports(String st) {
        System.out.println(st);
    }

    public static List<String> getAirports() {
        List<String> airports = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            airports.add("Airport " + i);
        }
        return airports;
    }
}
