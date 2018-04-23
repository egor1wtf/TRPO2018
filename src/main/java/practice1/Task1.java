package practice1;

import java.text.ParseException;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task1 {
    public static void main(String[] args) throws ParseException {
        String dateStr = "2018-02-12T01:02:03Z";
        Date date = Date.from(Instant.parse(dateStr));
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.clear();
        calendar.setTime(date);
        System.out.println("Задание 1\nТекущая дата: "+date);

        calendar.add(Calendar.DAY_OF_YEAR, 1);
        calendar.set(Calendar.HOUR,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);
        Date tomorrow = calendar.getTime();
        System.out.println("Завтращняя дата: " + tomorrow);

        calendar.set(Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek());
        Date begin = calendar.getTime();
        calendar.add(Calendar.DAY_OF_YEAR, 6);
        calendar.set(Calendar.HOUR,23);
        calendar.set(Calendar.MINUTE,59);
        calendar.set(Calendar.SECOND,59);
        calendar.set(Calendar.MILLISECOND,59);
        Date end = calendar.getTime();
        System.out.println("Начало недели: " + begin + " \nКонец недели: " + end);

        calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE));
        Date lastDayOfMonth = calendar.getTime();
        System.out.println("Последний день в месяце: " +lastDayOfMonth);
    }
}
