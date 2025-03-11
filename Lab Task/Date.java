public class Date {
    private int day, month, year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(Date other) {
        this(other.day, other.month, other.year);
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
