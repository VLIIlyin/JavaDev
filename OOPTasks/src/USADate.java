public class USADate extends Date{
    public USADate(int year, short month, short day){
        super(year, month, day);
    }

    @Override
    public String getFormattedDate() {
        return Short.toString(getMonth()) + '/' +
                Short.toString(getDay()) + '/' +
                Integer.toString(getYear()) + '/';
    }
}
