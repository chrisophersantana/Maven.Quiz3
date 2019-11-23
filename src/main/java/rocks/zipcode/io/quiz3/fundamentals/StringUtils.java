package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String capper = "";
        for (int i = 0; i < str.length(); i++) {
            if (i != indexToCapitalize) {
                capper += str.charAt(i) + "";
            } else {
                capper += (str.charAt(i) + "").toUpperCase();
            }
        }
        return capper;

    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        for (int i = 0; i < baseString.length(); i++) {
            if (baseString.charAt(indexOfString) == characterToCheckFor) {
                return true;
            }
        }

        return false;
    }

    public static String[] getAllSubStrings(String string) {
        ArrayList<String> subber = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length() + 1; j++) {
                if (!subber.contains(string.substring(i, j))) {
                    subber.add(string.substring(i, j));
                }
            }
        }
        return subber.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input) {
      int count = 0;
        ArrayList<String> subber = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length() + 1; j++) {
                if (!subber.contains(input.substring(i, j))) {
                    subber.add(input.substring(i, j));
                    count++;
                }
            }
        }
        return count;

    }

}