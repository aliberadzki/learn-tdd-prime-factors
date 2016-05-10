package pl.aliberadzki.learn.tdd.primefactors;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aliberadzki on 10.05.16.
 */
public class PrimeFactorsTest {

    private static final Integer[] EMPTY_ARR = {};

    @Test
    public void itReturnsAnEmptyArrayFor1() {
        assertArrayEquals(EMPTY_ARR, PrimeFactors.generate(1));
    }

    @Test
    public void itReturns2For2() {
        Integer[] expected = {2};
        assertArrayEquals(expected, PrimeFactors.generate(2));
    }

    @Test
    public void itReturns3For3() {
        Integer[] expected = {3};
        assertArrayEquals(expected, PrimeFactors.generate(3));
    }

    @Test
    public void itReturns22For4() {
        Integer[] expected = {2,2};
        assertArrayEquals(expected, PrimeFactors.generate(4));
    }

    @Test
    public void itReturns5For5() {
        Integer[] expected = {5};
        assertArrayEquals(expected, PrimeFactors.generate(5));
    }

    @Test
    public void itReturns23For6() {
        Integer[] expected = {2,3};
        assertArrayEquals(expected, PrimeFactors.generate(6));
    }

    @Test
    public void itReturns33For9() {
        Integer[] expected = {3, 3};
        assertArrayEquals(expected, PrimeFactors.generate(9));
    }

    @Test
    public void itReturns2255For100() {
        Integer[] expected = {2,2,5,5};
        assertArrayEquals(expected, PrimeFactors.generate(100));
    }

}