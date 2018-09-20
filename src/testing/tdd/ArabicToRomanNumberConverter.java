package testing.tdd;


import java.util.ArrayList;
import java.util.List;

public class ArabicToRomanNumberConverter {

    private List<Pair<Integer, String>> map;

    public ArabicToRomanNumberConverter() {
        map = new ArrayList<>();
        map.add(new Pair<>(5, "V"));
        map.add(new Pair<>(1, "I"));
    }

    public String convert(int arabicNumber) {
        boolean noNumber = arabicNumber == 0;

        if (noNumber) {
            return getDefaultRomanNumber();
        }

        return getRepeatingNumber(arabicNumber);
    }

    private String getRepeatingNumber(int arabicNumber) {
        String romanNumber = "";

//        while (arabicNumber >= 5) {
//            romanNumber.append("V");
//            arabicNumber -= 5;
//        }
//
//        while (arabicNumber >= 1) {
//            romanNumber.append("I");
//            arabicNumber -= 1;
//        }

        for (Pair<Integer, String> digit : map) {
            while (arabicNumber >= digit.getKey()) {
                romanNumber += digit.getValue();
                arabicNumber -= digit.getKey();
            }
        }


        return romanNumber;
    }

    private String getDefaultRomanNumber() {
        return "";
    }

}
