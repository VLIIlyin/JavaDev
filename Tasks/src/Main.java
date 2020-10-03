import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        String  strValue = "String value";
        int     intValue = 10;

        System.out.println(main.convertInt2Char(123324));
        System.out.println(main.convertLong2Int(123324L));
        System.out.println(main.sumStringAndInt(strValue, intValue));

        main.getMonthsDays();
    }

    //Привести Литерал типа int к типу char
    public char convertInt2Char(int _value){
        char value = (char) _value;

        return value;
    }

    //Привести Литерал типа long к типу int
    public int convertLong2Int(long _value){
        int value = (int) _value;

        return value;
    }

    //Создать переменную типа String  str и проинициализировать ее.
    //Создать переменную типа int i и проинициализировать ее
    //Вывести сумму этих переменных str + i
    public String sumStringAndInt(String _strValue, int _intValue) {
        return _strValue + String.valueOf(_intValue);
    }

    //В консоль вводится название месяца.
    //Вывести количество дней в этом месяце.(не заморачиваться над високосным годом)
    //Если такого месяца не существует вывести ошибку.
    //Сделать так, чтобы программа работала постоянно, до получения сообщения end.
    public void getMonthsDays(){

        boolean notEnd = true;

        while (notEnd)
        {
            Scanner inputMonth = new Scanner(System.in);

            System.out.println("Input month on English");

            String      month       = inputMonth.next();
            int         days        = 0;
            boolean     printDays   = true;

            switch (month) {
                case "January":
                    days = 31;
                    break;
                case "February":
                    days = 28;
                    break;
                case "March":
                    days = 31;
                    break;
                case "April":
                    days = 30;
                    break;
                case "May":
                    days = 31;
                    break;
                case "June":
                    days = 30   ;
                    break;
                case "July":
                    days = 31;
                    break;
                case "August":
                    days = 31;
                    break;
                case "September":
                    days = 30;
                    break;
                case "October":
                    days = 31;
                    break;
                case "November":
                    days = 30;
                    break;
                case "December":
                    days = 31;
                    break;
                case "End":
                case "end":
                    notEnd = false;
                    break;
                default:
                    printDays = false;
                    System.out.printf("Month %s does not exists \n", month);
            }

            if (notEnd
                && printDays) {
                System.out.printf("%d days \n", days);
            }
        }
    }
}

