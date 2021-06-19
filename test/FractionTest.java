import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//REFACTOR Test names are not good, they should express intention, not the test data
public class FractionTest {
    @Test
    public void sameDenominator() {
        Fraction firstAddendum = new Fraction(1, 4);
        Fraction secondAddendum = new Fraction(2, 4);

        Assertions.assertEquals("3/4", firstAddendum.add(secondAddendum).toString());

        firstAddendum = new Fraction(1, 5);
        secondAddendum = new Fraction(2, 5);

        Assertions.assertEquals("3/5", firstAddendum.add(secondAddendum).toString());
    }

    @Test
    public void sameDenominatorTheSumIsTheWhole() {
        Fraction firstAddendum = new Fraction(1, 2);
        Fraction secondAddendum = new Fraction(1, 2);

        Assertions.assertEquals("1/1", firstAddendum.add(secondAddendum).toString());
    }

    @Test
    public void anIntPlusAFractionsameDenominator() {
        Fraction firstAddendum = new Fraction(1);
        Fraction secondAddendum = new Fraction(1, 1);

        Assertions.assertEquals("2/1", firstAddendum.add(secondAddendum).toString());
    }

    @Test
    public void anIntPlusAFractionDifferentDenominator() {
        Fraction firstAddendum = new Fraction(1);
        Fraction secondAddendum = new Fraction(1, 2);

        Assertions.assertEquals("3/2", firstAddendum.add(secondAddendum).toString());
    }

    @Test
    public void differentDenominatorSumIsMoreThanOne() {
        Fraction firstAddendum = new Fraction(1, 2);
        Fraction secondAddendum = new Fraction(2, 3);

        Assertions.assertEquals("7/6", firstAddendum.add(secondAddendum).toString());
    }

    @Test
    public void TwoOverFourPlusFouwOverEightShouldBeEqualsToOneOverOne() {
        Fraction firstAddendum = new Fraction(2, 4);
        Fraction secondAddendum = new Fraction(4, 8);

        Assertions.assertEquals("1/1", firstAddendum.add(secondAddendum).toString());
    }

    @Test
    public void FourOverSixShouldBeTwoOverThree() {
        Fraction firstAddendum = new Fraction(1, 6);
        Fraction secondAddendum = new Fraction(3, 6);

        Assertions.assertEquals("2/3", firstAddendum.add(secondAddendum).toString());
    }

    @Test
    public void zeroIsZero() {
        Fraction firstAddendum = new Fraction(0);
        Fraction secondAddendum = new Fraction(1);

        Assertions.assertEquals("1/1", firstAddendum.add(secondAddendum).toString());
    }

    @Test
    public void StrangeOne() {
        Fraction firstAddendum = new Fraction(7, 3);
        Fraction secondAddendum = new Fraction(4, 5);

        Assertions.assertEquals("47/15", firstAddendum.add(secondAddendum).toString());
    }
}
