package code;

import es.upm.miw.iwvg_devops.code.Searches;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchesTest {

    @Test
    void testFindUserFamilyNameByUserNameDistinct() {
        assertEquals(List.of("Torres"), new Searches().findUserFamilyNameByUserNameDistinct("Paula")
                .collect(Collectors.toList()));
    }

    @Test
    void testFindUserFractionNumeratorByFamilyName() {
        assertEquals(List.of(2, 4, 0, 1, 1), new Searches().findFractionNumeratorByUserFamilyName("Torres")
                .collect(Collectors.toList()));
    }

    @Test
    void testFindFamilyNameByFractionDenominator() {
        assertEquals(List.of("López", "Torres"), new Searches().findUserFamilyNameByFractionDenominator(2)
                .collect(Collectors.toList()));
    }

    @Test
    void testFindUserFamilyNameInitialByAnyProperFraction() {
        assertEquals(List.of("F","B","L","B"), new Searches().findUserFamilyNameInitialByAnyProperFraction()
                .collect(Collectors.toList()));
    }
    void testFindUserIdByAnyProperFraction() {

    }

    void testFindUserNameByAnyImproperFraction() {
    }

    @Test
    void testFindUserFamilyNameByAllSignFractionDistinct() {
        assertEquals(List.of("Blanco", "López"), new Searches().findUserFamilyNameByAllNegativeSignFractionDistinct()
                .collect(Collectors.toList()));
    }

    @Test
    void testFindDecimalFractionByUserName() {
        assertEquals(List.of(0.0, 1.0, 2.0, 0.2, -0.5, 0.5, 1.0), new Searches().findDecimalFractionByUserName("Oscar")
                .collect(Collectors.toList()));
    }

    void testFindDecimalFractionBySignFraction() {
    }

    void testFindFractionAdditionByUserId() {
    }

    void testFindFractionSubtractionByUserName() {
    }

    void testFindFractionMultiplicationByUserFamilyName() {
    }
}