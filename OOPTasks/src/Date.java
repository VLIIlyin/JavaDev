import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public abstract class Date {
    private int year;
    private short month;
    private short day;

    public void setYear(int _year) {
        year = _year;
    }

    public void setMonth(short _month) {
        month = _month;
    }

    public void setDay(short _day) {
        day = _day;
    }

    public int getYear() {
        return year;
    }

    public short getMonth() {
        return month;
    }

    public short getDay() {
        return day;
    }

    public Date(int _year, short _month, short _day) {
        year = _year;
        month = _month;
        day = _day;
    }

    public abstract String getFormattedDate();

    public String getFormattedDate(String _dateFormat){
        String              dateString;
        SimpleDateFormat    dateFormat  = new SimpleDateFormat(_dateFormat);
        GregorianCalendar   calendar    = new GregorianCalendar(getYear(), getMonth() - 1, getDay());
        java.util.Date      date        = calendar.getTime();

        dateString = dateFormat.format(date);

        return dateString;
    }
}