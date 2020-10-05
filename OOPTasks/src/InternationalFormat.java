import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.GregorianCalendar;

public class InternationalFormat extends Date {
    public InternationalFormat(int year, short month, short day){
        super(year, month, day);
    }

    @Override
    public String getFormattedDate() {
        return  Short.toString(getDay()) + '/' +
                Short.toString(getMonth()) + '/' +
                Integer.toString(getYear()) + '/';
    }
}
