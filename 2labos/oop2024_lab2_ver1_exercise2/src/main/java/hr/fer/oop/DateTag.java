package hr.fer.oop;

public class DateTag extends TaskTag {
    private int year;
    private int month;
    private int day;

    public DateTag(String name, int year, int month, int day) {
        super(name);

        month = Math.max(Math.min(month,12), 1);

        day = Math.max(day, 1);
        int maxDay = 30;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            maxDay = 31;
        } else if (month == 2) {
            maxDay = 28;
        }

        day = Math.min(day, maxDay);

        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {

        return super.toString()+String.format("(%04d-%02d-%02d)", year, month, day);
    }
}