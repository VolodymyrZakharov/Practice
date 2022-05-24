import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.List;
import java.util.stream.Collectors;


public class Homework {
    public static void main(String[] args) {

        // Узнать день недели, в котором вы родились.
        DayOfWeek myBirthdayWeekDay = LocalDate.parse("1992-12-15").getDayOfWeek();
        System.out.println(myBirthdayWeekDay);

        // Узнать количество дней до нового года, при условии, что нельзя явно указывать год.
        LocalDate today = LocalDate.now();
        System.out.println(ChronoUnit.DAYS.between(today, today.with(TemporalAdjusters.lastDayOfYear())));

        // Узнать количество дней до дня рождения, при уловии, что дан только день рождения без года.
        String myBirthday = "15 Dec";
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendPattern("dd MMM")
                .parseDefaulting(ChronoField.YEAR, year)
                .toFormatter();

        LocalDate birthdayDate = LocalDate.parse(myBirthday, formatter);
        if (birthdayDate.isAfter(localDate)) {
            System.out.println(ChronoUnit.DAYS.between(localDate, birthdayDate));
        } else System.out.println(ChronoUnit.DAYS.between(localDate, birthdayDate.plusYears(1)));

        // get today's date
        LocalDate todayDate = LocalDate.now();
        System.out.println(todayDate);

        // get current year, month, day information
        System.out.println(todayDate.getYear());
        System.out.println(todayDate.getMonth());
        System.out.println(todayDate.getDayOfMonth());
        System.out.println(todayDate.getDayOfWeek());

        //create custom date - your birthday
        LocalDate myBirthdayDate = LocalDate.of(1992, 12, 15);
        LocalDate myBirthdayDate2 = LocalDate.parse("1992-12-15");

        //create two dates and compare if they are equal
        LocalDate dateOne = LocalDate.parse("2022-04-10");
        LocalDate dateTwo = LocalDate.parse("2022-04-10");
        System.out.println(dateOne.isEqual(dateTwo));

        //get current time
        System.out.println(LocalTime.now());

        //calculate new time = 3 hours plus current
        System.out.println(LocalTime.now().plus(3, ChronoUnit.HOURS));
        System.out.println(LocalTime.now().plusHours(3));

        //calculate a date which is one week from now
        System.out.println(LocalDate.now().plusWeeks(1));
        System.out.println(LocalDate.now().plus(1, ChronoUnit.WEEKS));

        //calculate the date a year ago using the minus() method
        System.out.println(LocalDate.now().minus(1, ChronoUnit.YEARS));

        //calculate the date a year after using the plus() method
        System.out.println(LocalDate.now().plus(1, ChronoUnit.YEARS));

        //create dates tomorrow and yesterday and check if they are before or after the current date
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        LocalDate yesterday = LocalDate.now().minusDays(1);
        System.out.println(tomorrow.isAfter(yesterday));
        System.out.println(yesterday.isAfter(tomorrow));

        //find local time in NewYork, Berlin, Moscow
        System.out.println(ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Europe/Berlin")));
        System.out.println(ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Europe/Moscow")));
        System.out.println(ZonedDateTime.now().withZoneSameInstant(ZoneId.of("US/Eastern")));

        //check if today is a leap year
        System.out.println(LocalDate.now().isLeapYear());

        //calculate the number of months between current date the date you joined Telran
        System.out.println(ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.parse("2021-09-20")));

        //calculate the number of months between current date the date you joined Telran
        System.out.println(ChronoUnit.MONTHS.between(LocalDate.now(), LocalDate.parse("2021-09-20")));

        //given is the day after tomorrow date as "20220409" string.Convert it into basic iso date format 2022 - 04 - 09
        System.out.println(LocalDate.parse("20220409", DateTimeFormatter.ofPattern("yyyyMMdd")));

        //given is local DateTime now.Convert it in string in the following format "2022/04/09 11:00:22"
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dateTimeFormatter1.format(LocalDateTime.now()));

        //given is string "2022/04/09 11:00:22" convert it to the LocalDateTime
        System.out.println(LocalDateTime.parse("2022/04/09 11:00:22", DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));

    }

    //используя стримы написать метод принимающий лист из нескольких дат типа localDate и возвращающий кол-во дней между самой ранней и поздней датой
    public static long daysInBetween(List<LocalDate> list) {
        list.stream().sorted();
        return ChronoUnit.DAYS.between(list.get(0), list.get(list.size() - 1));
    }

    //используя стримы написать метод который превращает лист стрингов одной даты в лист стрингов другой даты
    public static List<String> task2(List<String> list) {
        return list.stream()
                .map(x -> LocalDate.parse(x, DateTimeFormatter.ofPattern("dd MMM yyyy")))
                .sorted()
                .map(y -> DateTimeFormatter.ofPattern("EEE, d MMM yyyy").format(y))
                .collect(Collectors.toList());
    }
}
