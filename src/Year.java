public class Year {
    private int year;

    public Year(int year) {
        this.year = year;
    }

    public boolean isLeap() {
        final int number = 4;
        return divisibleBy(number) && !(divisibleBy(100) && !(divisibleBy(400)));
    }

    private boolean divisibleBy(int number) {
        return year % number == 0;
    }
}
