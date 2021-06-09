package EnteringTest;

import java.util.HashMap;

public class Translator {
    //Римские String в int
    public int romanToInt(String digitString) {
        HashMap<Character, Integer> romanNumbers = new HashMap<>();
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        int digitInt = 0;
        for (int i = 0; i < digitString.length(); i++) {
            if (i != digitString.length() - 1) {
                if (romanNumbers.get(digitString.charAt(i)) < romanNumbers.get(digitString.charAt(i + 1))) {
                    digitInt += romanNumbers.get(digitString.charAt(i + 1)) - romanNumbers.get(digitString.charAt(i));
                    i++;
                    continue;
                }
            }
            digitInt += romanNumbers.get(digitString.charAt(i));
        }
        return digitInt;
    }
//Арабские в римские
    public String ArabicToRoman(int resultArabian) {
        int[] translatingArrayArabic = {100, 90, 50, 40, 10, 5, 4, 1};
        String[] translatingArrayRoman = {"C", "XC", "L", "XL", "X", "V", "IV", "I"};
        String result = "";


        for (int i = 0; i < translatingArrayArabic.length; i++) {
            while (resultArabian >= translatingArrayArabic[i]) {
                result += translatingArrayRoman[i];
                resultArabian -= translatingArrayArabic[i];

            }
        }
        return result;

    }
}