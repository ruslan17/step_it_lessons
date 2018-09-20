package dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Dates {

    public static void main(String args[]) {

        Date date1 = new GregorianCalendar(2018, 7,17).getTime();
        Date date2;
        // Инициализация объекта date
        Date date = new Date();

        // Вывод текущей даты и времени с использованием toString()
        System.out.println(date.toString());

        test();
    }

    /**
     * Существуют три способа в Java сравнить даты:

     Можно использовать функцию getTime(), чтобы получить количество миллисекунд, прошедших с момента полуночи 1 января 1970,
     для обоих объектов, а затем сравнить эти два значения.
     Вы можете использовать методы before(), after() и equals(). Поскольку 12 число месяца раньше 18 числа, например,
     new Date(99, 2, 12).before(new Date (99, 2, 18)) возвращает значение true.
     Можно использовать метод compareTo(), который определяется сопоставимым интерфейсом и реализуется по дате.
     */

    /**
     * SimpleDateFormat — это конкретный класс для парсинга и форматирования даты в Java.
     * SimpleDateFormat позволяет начать с выбора любых пользовательских шаблонов для форматирования даты и времени. Например:
     */

    public static void test() {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");

        System.out.println("Текущая дата " + formatForDateNow.format(dateNow));
    }


    /**
     * Символ	Описание	                                        Пример
     G	Обозначение эры	                                            н.э.
     y	Год из четырех цифр	                                        2016
     M	Номер месяца года	                                        11
     d	Число месяца	                                            13
     h	Формат часа в A.M./P.M.(1~12)	                             7
     H	Формат часа(0~23)	                                        19
     m	Минуты	                                                     30
     s	Секунды	                                                     45
     S	Миллисекунды	                                             511
     E	День недели                                             	Вс
     D	Номер дня в году	                                        318
     F	Номер дня недели в месяце	2                               (второе воскресение в этом месяце)
     w	Номер неделя в году	                                        46
     W	Номер недели в месяце	                                        2
     a	Маркер A.M./P.M.	                                        AM
     k	Формат часа(1~24)	                                        24
     K	Формат часа в A.M./P.M.(0~11)	                             0
     z	Часовой пояс	                                             FET (Дальневосточноевропейское время)
     '	Выделение для текста	                                    Текст
     ''	Одинарная кавычка	                                        '
     */


    public static void parse(String args[]) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String str = args.length == 0 ? "2011-11-11" : args[0];

        System.out.print("Строка " + str + " распаршена как ");
        Date parsingDate;
        try {
            parsingDate = ft.parse(str);
            System.out.println(parsingDate);
        }catch (ParseException e) {
            System.out.println("Нераспаршена с помощью " + ft);
        }
    }

    public static void minus() {
        String date1 = "01.03.2016";
        String date2 = "01.02.2016";

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        Date dateOne = null;
        Date dateTwo = null;

        try {
            dateOne = format.parse(date1);
            dateTwo = format.parse(date2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Количество дней между датами в миллисекундах
        long difference = dateOne.getTime() - dateTwo.getTime();
        // Перевод количества дней между датами из миллисекунд в дни
        int days =  (int)(difference / (24 * 60 * 60 * 1000)); // миллисекунды / (24ч * 60мин * 60сек * 1000мс)
        // Вывод разницы между датами в днях на экран
        System.out.println(days + " дн.");
    }

}
