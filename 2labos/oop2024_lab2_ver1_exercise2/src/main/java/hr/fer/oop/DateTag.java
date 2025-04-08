package hr.fer.oop;

import java.sql.Date;

public class DateTag extends TaskTag {
    private int year;
    private int month;
    private int day;

    public DateTag(String name, int year, int month, int day) {
        super(name);
        if (year<1000){
            year=1000;
        }
        if(year>9999){
            year=9999;
        }

        if (month < 1) {
            month = 1;
        }
        if (month > 12) {
            month = 12;
        }
        if (day < 1) {
            day = 1;
        }
        if (day > 30 && month%2==0 && month !=2) {
            day = 30;
        }
        if(day>31 && month==8){
            day = 31;
        }
        if(day>31 && (month&2)!=0 && month !=2) {
            day = 31;
        }
        if(day>28 && month==2){
            day = 28;
        }
        this.year = year;
        this.day = day;
        this.month = month;
    }
    @Override
    public String toString() {

        return super.toString()+ "("+Date.valueOf(year+"-"+month+"-"+day)+")";
    }
}
