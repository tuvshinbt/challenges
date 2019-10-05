package bt.pre.algo.date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static java.time.temporal.TemporalAdjusters.*;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

import org.junit.jupiter.api.Test;

/**
 * LocalDate, LocalTime, Instant, Duration, and Period
 * 
 * @author batu
 *
 */
public class NewDateApiTests {

    /**
     * Creations
     */
    @Test
    public void createLocalDateTest() {
//        LocalDate actualDate = LocalDate.now();
//        LocalDate actualDate = LocalDate.of(2019, 10, 2);
        LocalDate actualDate = LocalDate.parse("2019-10-02");
        assertNotNull(actualDate);
        assertEquals(2019, actualDate.getYear());
        assertEquals(10, actualDate.getMonthValue());
        assertEquals(2, actualDate.getDayOfMonth());
    }

    @Test
    public void usingTemporalFieldTest() {
        LocalDate actual = LocalDate.of(2019, 10, 2);
        assertNotNull(actual);
        assertEquals(2019, actual.get(ChronoField.YEAR));
        assertEquals(10, actual.get(ChronoField.MONTH_OF_YEAR));
        assertEquals(2, actual.get(ChronoField.DAY_OF_MONTH));
    }

    @Test
    public void createLocalTimeTest() {
//        LocalTime actual = LocalTime.now();
//        LocalTime actual = LocalTime.of(17, 5, 10);
        LocalTime actual = LocalTime.parse("17:05:10");
        assertNotNull(actual);
        assertEquals(17, actual.getHour());
        assertEquals(5, actual.getMinute());
        assertEquals(10, actual.getSecond());
    }

    @Test
    public void createLocalDateTime() {
//        LocalDateTime actual = LocalDateTime.now();
//        LocalDateTime actual = LocalDateTime.of(2019, 10, 2, 17, 11);
        LocalDateTime actual = LocalDateTime.parse("2019-10-02T17:11:05");
        assertNotNull(actual);
        assertNotNull(actual.toLocalDate());
        assertNotNull(actual.toLocalTime());
        assertEquals(2019, actual.getYear());
        assertEquals(10, actual.getMonthValue());
        assertEquals(2, actual.getDayOfMonth());
        assertEquals(17, actual.getHour());
        assertEquals(11, actual.getMinute());
    }

    @Test
    public void createInstantTest() {
//        Instant actual = Instant.now();
        Instant actual = Instant.ofEpochSecond(1570054758);
        assertNotNull(actual);
        assertEquals(1570054758, actual.getEpochSecond());
    }

    @Test
    public void createDurationTest() {
        LocalTime time1 = LocalTime.of(17, 25, 00, 10);
        LocalTime time2 = LocalTime.of(17, 26, 00, 15);
        Duration actual = Duration.between(time1, time2);
        assertNotNull(actual);
        assertEquals(60, actual.getSeconds());
        assertEquals(5, actual.getNano());
    }

    @Test
    public void createPeriodTest() {
        LocalDate date1 = LocalDate.of(2019, 10, 02);
        LocalDate date2 = LocalDate.of(2019, 11, 04);
        Period actual = Period.between(date1, date2);
        assertNotNull(actual);
        assertEquals(1, actual.getMonths());
        assertEquals(2, actual.getDays());
    }

    // Modification
    @Test
    public void modifyLocalDateTest() {
        LocalDate date1 = LocalDate.of(2019, 10, 3);

        // with***()
        LocalDate date2 = date1.withYear(2018);
        assertEquals(2018, date2.getYear());
        assertEquals(2019, date1.getYear());

        LocalDate date3 = date2.withMonth(11);
        assertEquals(11, date3.getMonthValue());
        assertEquals(10, date2.getMonthValue());

        // plus&minus***()
        LocalDate date4 = date3.plusMonths(1);
        assertEquals(12, date4.getMonthValue());
        assertEquals(11, date3.getMonthValue());

        LocalDate date5 = date4.minusDays(3);
        assertEquals(11, date5.getMonthValue());
        assertEquals(30, date5.getDayOfMonth());
    }

    @Test
    public void usingTemporalAdjustersTest() {
        LocalDate date1 = LocalDate.of(2019, 10, 3);
        LocalDate date2 = date1.with(nextOrSame(DayOfWeek.SUNDAY));
        assertEquals(6, date2.getDayOfMonth());

        LocalDate date3 = date2.with(lastDayOfMonth());
        assertEquals(31, date3.getDayOfMonth());
    }

    // Parsing
    @Test
    public void parseLocalDateTest() {
        LocalDate actual = LocalDate.of(2019, 10, 3);
        assertEquals("20191003", actual.format(DateTimeFormatter.BASIC_ISO_DATE));
        assertEquals("2019-10-03", actual.format(DateTimeFormatter.ISO_LOCAL_DATE));

        LocalDate date1 = LocalDate.parse("20191004", DateTimeFormatter.BASIC_ISO_DATE);
        assertEquals(2019, date1.getYear());
        assertEquals(10, date1.getMonthValue());
        assertEquals(04, date1.getDayOfMonth());

        LocalDate date2 = LocalDate.parse("2019-10-04", DateTimeFormatter.ISO_LOCAL_DATE);
        assertEquals(2019, date2.getYear());
        assertEquals(10, date2.getMonthValue());
        assertEquals(04, date2.getDayOfMonth());
    }

    @Test
    public void formatterLocalDateTest() {
        DateTimeFormatter ddMMyyyFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date1 = LocalDate.of(2019, 10, 03);
        assertEquals("2019-10-03", date1.toString());
        assertEquals("03/10/2019", date1.format(ddMMyyyFormatter));

        DateTimeFormatter frenchFormatter = DateTimeFormatter.ofPattern("d.MMMM.yyyy", Locale.FRENCH);
        assertEquals("3.octobre.2019", date1.format(frenchFormatter));

    }

}
