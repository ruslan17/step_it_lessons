package dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

/*
Date.valueOf("2015-09-13"); // From String (sql date)
Date.valueOf(localDate);    // From java.time.LocalDate

date.toString();    // To String
date.toLocalDate(); // To java.time.LocalDate
 */
public class LocalDateSnippet {

    public static void toLocalDate() {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static void minusPeriod() {
        LocalDate a = LocalDate.of(2014, 6, 30);
        LocalDate b = a.minus(Period.ofDays(100));
        System.out.println(b);
    }

    public static void format() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(formatter.format(date));
    }

    public static void parse() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

        String date = "16/08/2016";

        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);
    }

    public static void dateTimeFormat() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm:ss a");

        String date = "Tuesday, Aug 16, 2016 12:10:56 PM";

        LocalDateTime localDateTime = LocalDateTime.parse(date, formatter);

        System.out.println(localDateTime);

        System.out.println(formatter.format(localDateTime));

    }

    public static void defaultParse() {
        String date = "2016-08-16";

        //default, ISO_LOCAL_DATE
        LocalDate localDate = LocalDate.parse(date);

        System.out.println(localDate);
    }

    public static void snippets() {
        //1A. Last day of current month
        LocalDate lastDayOfCurrentMonth = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("1A. Last day of the current month: "+
                lastDayOfCurrentMonth.getDayOfWeek() + "," + lastDayOfCurrentMonth);

        //1B. Last working day(LWD) of current month reusing lastDayOfCurrentMonth
        LocalDate lastWorkDayCurrentMonth=getLastWorkingDayOfMonth(lastDayOfCurrentMonth);
        System.out.println("1B. Last working day of current month: "+
                lastWorkDayCurrentMonth.getDayOfWeek() + "," + lastWorkDayCurrentMonth);

        //2A. Last day of month for given date-"2017-01-13"
        LocalDate lastDayofMonthGivenDate = LocalDate.of(2017,01,13).with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("2A. Last day of month for '2017-01-13': "+
                lastDayofMonthGivenDate.getDayOfWeek() + "," + lastDayofMonthGivenDate);

        //2B. LWD of month for date-"2017-01-13" reusing lastDayofMonthGivenDate
        LocalDate lastWorkDayGivenDate=getLastWorkingDayOfMonth(lastDayofMonthGivenDate);
        System.out.println("2B. Last working day of month for '2017-01-13': "+
                lastWorkDayGivenDate.getDayOfWeek() + "," + lastWorkDayGivenDate);

        //3A. Last day of month for year-month combination-"Apr, 2017"
        LocalDate lastDayofMonthYear = YearMonth.of(2017,04).atEndOfMonth();
        System.out.println("3A. Last day of month for 'Apr, 2017': "+
                lastDayofMonthYear.getDayOfWeek() + "," + lastDayofMonthYear);

        //3B. LWD of month for year-month combination-"Apr, 2017" reusing lastDayofMonthYear
        LocalDate lastWorkDayMonthYear=getLastWorkingDayOfMonth(lastDayofMonthYear);
        System.out.println("3B. Last working day of month for 'Apr, 2017': "+
                lastWorkDayMonthYear.getDayOfWeek() + "," + lastWorkDayMonthYear);
    }

    public static void main(String args[]) {

        format();
        parse();
        defaultParse();

    }

    /**
     * Method calculates last working day for last day of month as input
     * @param lastDayOfMonth
     * @return LocalDate instance containing last working day
     */
    public static LocalDate getLastWorkingDayOfMonth(LocalDate lastDayOfMonth) {
        LocalDate lastWorkingDayOfMonth;
        switch (DayOfWeek.of(lastDayOfMonth.get(ChronoField.DAY_OF_WEEK))) {
            case SATURDAY:
                lastWorkingDayOfMonth = lastDayOfMonth.minusDays(1);
                break;
            case SUNDAY:
                lastWorkingDayOfMonth = lastDayOfMonth.minusDays(2);
                break;
            default:
                lastWorkingDayOfMonth = lastDayOfMonth;
        }
        return lastWorkingDayOfMonth;
    }

    public static void minusMonth() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date date1 = format.parse("27-12-2018");
        Date date2 = format.parse("28-03-2018");
        LocalDate now = LocalDate.now();
        LocalDate minDate = now.minusMonths(3);
        LocalDate formattedDate1 = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate formattedDate2 = date2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        if ((formattedDate2.isBefore(now) || formattedDate2.isEqual(now)) &&
                (formattedDate1.isBefore(formattedDate2) || formattedDate1.isEqual(formattedDate2)) &&
                (formattedDate1.isAfter(minDate) || formattedDate1.isEqual(minDate))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
