import it.bitrock.validator.RomanNumberValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RomanNumberTest {

    @Test
    @DisplayName("check validation roman number")
    void checkValidationRomanNumber() {
        String romanNumber1 = "IX";
        String romanNumber2 = "IIII";
        String romanNumber3 = "XCIX";
        String romanNumber4 = " II";
        String romanNumber5 = "I II";

        Assertions.assertEquals(Boolean.TRUE, RomanNumberValidator.isValid(romanNumber1));
        Assertions.assertEquals(Boolean.FALSE, RomanNumberValidator.isValid(romanNumber2));
        Assertions.assertEquals(Boolean.TRUE, RomanNumberValidator.isValid(romanNumber3));
        Assertions.assertEquals(Boolean.TRUE, RomanNumberValidator.isValid(romanNumber4));
        Assertions.assertEquals(Boolean.TRUE, RomanNumberValidator.isValid(romanNumber5));
        Assertions.assertEquals(Boolean.FALSE, RomanNumberValidator.isValid(""));
        Assertions.assertEquals(Boolean.FALSE, RomanNumberValidator.isValid(null));
    }



}
