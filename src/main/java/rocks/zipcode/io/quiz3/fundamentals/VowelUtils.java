package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        String vowels = "aeiou";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(String.valueOf(word.charAt(i)))) {
                return true;
            }
        }
        return false;


    }


    public static Integer getIndexOfFirstVowel(String word) {

        for (int index = 0; index < word.length(); index++) {
            if (isVowel(word.charAt(index))) {
                return index;
            }
        }
        return -1;


    }


    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }


        public static Boolean isVowel (Character character){
            return "AEIOUaeiou".indexOf(character) != -1;
        }
    }


