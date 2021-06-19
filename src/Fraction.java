public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        //REFACTOR A fraction can be constructed already to lowest terms
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int numerator) {
        //REFACTOR Should use the basic constructor
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction add(Fraction addendum) {
        return new Fraction((this.numerator * addendum.denominator) +
                (addendum.numerator * this.denominator),
                this.denominator * addendum.denominator).toLowestTerms();
    }

    private Fraction toLowestTerms() {
        int MCD = this.calcMCDWithEuclide(numerator, denominator);
        return new Fraction(numerator / MCD, denominator / MCD);
    }

    private int calcMCDWithEuclide(int m, int n) {
        int i = Math.min(m, n);
        int j = Math.max(m, n);

        int tmpInt;
        while ((tmpInt = i % j) != 0) {
            i = j;
            j = tmpInt;
        }
        return j;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
