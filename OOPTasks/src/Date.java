import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public abstract class Date {
    private int year;
    private short month;
    private short day;

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(short month) {
        this.month = month;
    }

    public void setDay(short day) {
        this.day = day;
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

    public Date(int year, short month, short day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public abstract String getFormattedDate();

    public String getFormattedDate(String dateFormat){
        String              dateString;
        SimpleDateFormat    simpleDateFormat    = new SimpleDateFormat(dateFormat);
        GregorianCalendar   calendar            = new GregorianCalendar(getYear(), getMonth() - 1, getDay());
        java.util.Date      date                = calendar.getTime();

        dateString = simpleDateFormat.format(date);

        return dateString;
    }
}