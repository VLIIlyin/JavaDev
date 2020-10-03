import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        String  strValue = "String value";
        int     intValue = 10;

        System.out.println(main.convertInt2Char(123324));
        System.out.println(main.convertLong2Int(123324L));
        System.out.println(main.sumStringAndInt(strValue, intValue));
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
}

