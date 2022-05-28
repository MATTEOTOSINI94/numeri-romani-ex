import it.bitrock.converter.RomanNumberConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RomanNumberConverterTest {
    RomanNumberConverter romanNumberConverter;

    @Test
    void romanConverter(){
        Assertions.assertEquals(17, romanNumberConverter.romanConverter("XVII"));
        Assertions.assertEquals(null,romanNumberConverter.romanConverter(null));
        Assertions.assertEquals(null,romanNumberConverter.romanConverter("shjshkaj"));

        Assertions.assertEquals(319,romanNumberConverter.romanNumberConverter("CCCXIX"));
        Assertions.assertEquals(null,romanNumberConverter.romanNumberConverter(null));
        Assertions.assertEquals(null,romanNumberConverter.romanNumberConverter("9283839"));

    }
}
