package it.bitrock.converter;

import it.bitrock.model.RomanNumber;
import it.bitrock.validator.RomanNumberValidator;

import java.util.Map;

import static it.bitrock.model.RomanNumber.romanNumbers;

public class RomanNumberConverter {


    public static Integer romanNumberConverter(String aRomanNumber) {
        Integer add = 0;
        Integer diff = 0;
        if (RomanNumberValidator.isValid(aRomanNumber)) {
            for (int i = 0; i < aRomanNumber.length(); i++) {
                Integer value = romanNumbers.get(String.valueOf(aRomanNumber.charAt(i)));
                if (i != 0 && romanNumbers.get(String.valueOf(aRomanNumber.charAt(i))) > romanNumbers.get(String.valueOf(aRomanNumber.charAt(i - 1)))) {
                    add += romanNumbers.get(String.valueOf(aRomanNumber.charAt(i)));
                    diff += (romanNumbers.get(String.valueOf(aRomanNumber.charAt(i - 1))) * 2);
                } else
                    add += value;
            }

            return add - diff;
        } else return null;
    }


    public static Integer romanConverter(String romanNumber) {
        Integer result = 0;
        if (RomanNumberValidator.isValid(romanNumber)) {
            for (int i = romanNumber.length() - 1; i >= 0; i--) {
                Integer value = romanNumbers.get(String.valueOf(romanNumber.charAt(i)));
                if (i != romanNumber.length() - 1 && romanNumbers.get(String.valueOf(romanNumber.charAt(i))) < romanNumbers.get(String.valueOf(romanNumber.charAt(i + 1)))) {
                    result -= romanNumbers.get(String.valueOf(romanNumber.charAt(i)));
                } else result += value;
            }
            return result;
        } else return null;

    }
}
