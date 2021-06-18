import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YearShould {
    @Test
    public void not_be_a_leap_year_if_not_divisible_by_four() {
        Assertions.assertFalse(new Year(1997).isLeap());
    }

    @Test
    public void be_a_leap_year_if_divisible_by_four() {
        Assertions.assertTrue(new Year(1996).isLeap());
    }

    @Test
    public void not_be_a_leap_year_if_divisible_by_oneHundred() {
        Assertions.assertFalse(new Year(1800).isLeap());
    }

    @Test
    public void be_a_leap_year_if_divisible_by_fourHundred() {
        Assertions.assertTrue(new Year(1600).isLeap());
    }

}
