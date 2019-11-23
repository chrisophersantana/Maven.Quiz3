package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for (SomeType t : this.array) {
            if (getNumberOfOccurrences(t) % 2 == 1) {
                return t;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for (SomeType t : this.array) {
            if (getNumberOfOccurrences(t) % 2 == 0) {
                return t;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int result = 0;
        for (SomeType t : this.array) {
            if (t.equals(valueToEvaluate)) {
                result++;
            }
        }
        return result;
    }


    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        // return Arrays.stream(array).filter(predicate::apply).collect(Collectors.toList()).toArray(Arrays.copyOf(array,0));

        ArrayList<SomeType> lister = new ArrayList<>();
        for (SomeType t : this.array) {
            if (predicate.apply(t)) {
                lister.add(t);
            }
        }
        return lister.toArray(Arrays.copyOf(this.array, 0));

    }
}
