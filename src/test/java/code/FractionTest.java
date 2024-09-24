package code;


import es.upm.miw.iwvg_devops.code.Fraction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FractionTest {
    @Test
    void testIsProper() {
        assertEquals(true, new Fraction(4, 5).isProper());
        assertEquals(false, new Fraction(5, 4).isProper());
    }

    @Test
    void testIsImproper() {
        assertEquals(true, new Fraction(5, 4).isImproper());
        assertEquals(false, new Fraction(4, 5).isImproper());
    }

    @Test
    void testIsEquivalent() {
        assertEquals(true, new Fraction(1, 2).isEquivalent(new Fraction(2, 4)));
        assertEquals(false, new Fraction(1, 2).isEquivalent(new Fraction(3, 4)));
    }

    @Test
    void testAdd() {
        Fraction expected = new Fraction(4, 4);
        Fraction actual = new Fraction(1, 2).add(new Fraction(1, 2));
        assertEquals(expected.getNumerator(), actual.getNumerator());
        assertEquals(expected.getDenominator(), actual.getDenominator());
    }

    @Test
    void testMultiply() {
        Fraction expected = new Fraction(1, 4);
        Fraction actual = new Fraction(1, 2).multiply(new Fraction(1, 2));
        assertEquals(expected.getNumerator(), actual.getNumerator());
        assertEquals(expected.getDenominator(), actual.getDenominator());
    }

    @Test
    void testDivide() {
        Fraction expected = new Fraction(2, 2);
        Fraction actual = new Fraction(1, 2).divide(new Fraction(1, 2));
        assertEquals(expected.getNumerator(), actual.getNumerator());
        assertEquals(expected.getDenominator(), actual.getDenominator());
    }
}
