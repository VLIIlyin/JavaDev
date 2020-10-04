public class USADate extends Date{
    public USADate(int _year, short _month, short _day){
        super(_year, _month, _day);
    }

    @Override
    public String getFormattedDate() {
        return Short.toString(getMonth()) + '/' +
                Short.toString(getDay()) + '/' +
                Integer.toString(getYear()) + '/';
    }
}
