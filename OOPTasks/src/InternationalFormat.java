import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.GregorianCalendar;

public class InternationalFormat extends Date {
    public InternationalFormat(int _year, short _month, short _day){
        super(_year, _month, _day);
    }

    @Override
    public String getFormattedDate() {
        return  Short.toString(getDay()) + '/' +
                Short.toString(getMonth()) + '/' +
                Integer.toString(getYear()) + '/';
    }
}
