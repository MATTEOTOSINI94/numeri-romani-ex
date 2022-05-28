package it.bitrock.validator;

public class RomanNumberValidator {

    public static boolean isValid(String aRomanNumer) {
        if(aRomanNumer != null && aRomanNumer != "") {          //StringUtils isNullorEmpy
            aRomanNumer = aRomanNumer.toUpperCase().trim();
            aRomanNumer = aRomanNumer.replaceAll("\\s+", "");
            if(aRomanNumer.matches("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$"))
                return true;
        }
        return false;
    }
}
