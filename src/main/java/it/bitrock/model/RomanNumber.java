package it.bitrock.model;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {
    // i numeri romani in una mappa
    // Map.of si usa con al massimo 10 elementi
    public static final Map<String, Integer> romanNumbers = Map.of(
            "I", 1,
            "V", 5,
            "X", 10,
            "L", 50,
            "C", 100,
            "D", 500,
            "M", 1000
    );



}
