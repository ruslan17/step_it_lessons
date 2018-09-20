package testing.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArabicToRomanNumberConverterTest {

    private String convertToRoman(int arabicNumber) {
        ArabicToRomanNumberConverter converter = new ArabicToRomanNumberConverter();

        return converter.convert(arabicNumber);
    }

    @Test
    void convertNullToEmptyString() {

        String romanNumber = convertToRoman(0);
        assertEquals("", romanNumber);

    }

    @Test
    void convert1_To_I() {

        String romanNumber = convertToRoman(1);
        assertEquals("I", romanNumber);

    }

    @Test
    void convert2_To_II() {

        String romanNumber = convertToRoman(2);
        assertEquals("II", romanNumber);

    }

    @Test
    void convert5_To_V() {

        String romanNumber = convertToRoman(5);
        assertEquals("V", romanNumber);

    }

    @Test
    void convert6_To_VI() {

        String romanNumber = convertToRoman(6);
        assertEquals("VI", romanNumber);

    }

    @Test
    void convert8_To_VIII() {

        String romanNumber = convertToRoman(8);
        assertEquals("VIII", romanNumber);

    }

}