package pl.aliberadzki.learn.tdd.primefactors;

import java.util.ArrayList;

/**
 * Created by aliberadzki on 10.05.16.
 */
public class PrimeFactors {

    private static final Integer[] EMPTY_ARR = {};

    public static Integer[] generate(Integer number) {
        ArrayList<Integer> factors = new ArrayList<>();

        for(int divider = 2; number > 1; divider++) {
            for (;number % divider == 0; number /= divider) {
                factors.add(divider);
            }
        }

        if(number > 1) {
            factors.add(number);

        }
        return factors.toArray(EMPTY_ARR);
    }
}
