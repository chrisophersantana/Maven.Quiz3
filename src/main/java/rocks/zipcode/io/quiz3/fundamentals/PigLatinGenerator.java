package rocks.zipcode.io.quiz3.fundamentals;

import javafx.util.Builder;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {


      String [] pigger =  str.split(" ");

            StringBuilder builder;
            for (int i = 0; i < pigger.length; i++) {
                if (VowelUtils.isVowel(pigger[i].charAt(0))) {
                    pigger[i] = pigger[i] + "way";
                } else {
                    int x = 0;
                    builder = new StringBuilder();
                    while (!VowelUtils.isVowel(pigger[i].charAt(x)) && x < pigger[i].length() - 1) {
                        builder.append(pigger[i].charAt(x));
                        x++;
                    }
                    if (x > pigger[i].length() - 1){
                        pigger[i] = pigger[i] + "ay";
                    } else {
                        pigger[i] = pigger[i].substring(x) + builder.toString() + "ay";
                    }
                }
            }

        builder = new StringBuilder();
        for (String pig : pigger){
            builder.append(pig);
            builder.append(" ");
        }

        return builder.toString().substring(0, builder.length() - 1);
        }



    }

