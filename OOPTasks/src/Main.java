//Создать классы (Triangle, Rectangle, Square)
//Объявить и реализовать методы countSquare() и countPerimeter()
//Создать объекты этих классов
//Вывести результаты подсчета площадей и периметров

//Расширение задачи 1
//Создать абстрактный класс Shape
//Объявить методы подсчета периметра и площади
//Наследовать данный абстрактный класс классами из задания 1.
//Реализовать методы абстрактного класса.
//Создать ссылки с типом Shape и проинициализировать их объектами классов (Triangle, Rectangle, Square)
//Проверить правильность вызова методов countSquare() и countPerimeter() и их результаты

//Создать интерфейс Converter
//Объявить метод convert(double amount)
//Создать классы UsdConverter, EurConverter, RubConverter имплементируя интерфейс Converter, которые будут переводить Byn в (Usd, Eur, Rub)
//Реализовать метод convert()
//Проверить работоспособность всех методов
//*Реализовать паттерн singleton для классов Converter

//Создать абстрактный класс Date со следующим полями
//int year;
//short month;
//short day;
//И абстрактным методом getFormattedDate()
//Создать классы:
// UsaDate( формат даты MM-DD-YYYY)
//InternationalDate( формат даты DD-MM-YYYY)
//Следующими классами наследовать класс Date и реализовать метод getFormattedDate() возвращающий формат даты для каждого класса.
//* Перегрузить метод getFormattedDate() еще 1-м методом, getFormattedDate(String format) который возвращает дату в указанном формате
// примеры (dd/mm/yyyy или yyyy/mm/dd и) в указанном формате всегда будут присутствовать обозначения dd,mm,yyyy и разделитель.
// Вам нужно будет только расположить ваши данные в верном формате и разделить требуемым разделителем.
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2.34, 4.23);
        System.out.printf("Square of rectangle = %s \n", Double.toString(rectangle.countSquare()));
        System.out.printf("Perimeter of rectangle = %s \n", Double.toString(rectangle.countPerimeter()));

        Shape triangle = new Triangle(13.433, 11.34, 4.223);
        System.out.printf("Square of triangle = %s \n", Double.toString(triangle.countSquare()));
        System.out.printf("Perimeter of triangle = %s \n", Double.toString(triangle.countPerimeter()));

        final double bynValue = 55;
        USDConverter usdConverter = new USDConverter(bynValue);
        EURConverter eurConverter = new EURConverter(bynValue);
        RUBConverter rubConverter = new RUBConverter(bynValue);

        System.out.printf("Converted value in usd = %s \n", Double.toString(usdConverter.convert()));
        System.out.printf("Converted value in eur = %s \n", Double.toString(eurConverter.convert()));
        System.out.printf("Converted value in rub = %s \n", Double.toString(rubConverter.convert()));

        Date usaDate = new USADate(1992, (short)3, (short)4);
        System.out.printf("date in USA format %s \n", usaDate.getFormattedDate());

        Date internationalFormat = new InternationalFormat(1992, (short)10, (short)4);
        System.out.printf("date in international format %s \n", internationalFormat.getFormattedDate("dd-MM-YYYY"));
    }
}
