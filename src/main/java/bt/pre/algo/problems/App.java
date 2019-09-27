package bt.pre.algo.problems;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(System.currentTimeMillis());
        Calendar calendar = Calendar.getInstance();
        
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        
        System.out.println(date);
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.MILLISECOND));
        System.out.println(calendar.getTimeInMillis());
        
        App app = new App();
        

        Calendar c = Calendar.getInstance();
        c.set(Calendar.MINUTE, 23);
        c.set(Calendar.SECOND, 19);
        System.out.println(new Date(c.getTimeInMillis()));
        System.out.println(new Date(app.roundOffTimeStamp(c.getTimeInMillis(), 10)));
        System.out.println(new Date(app.roundOffTimeStamp(c.getTimeInMillis(), 3)));
        System.out.println(new Date(app.roundOffTimeStamp(c.getTimeInMillis(), 120)));
        System.out.println(new Date(app.roundOffTimeStamp(c.getTimeInMillis(), 300)));
        System.out.println(new Date(app.roundOffTimeStamp(c.getTimeInMillis(), 3600)));
        System.out.println(new Date(app.roundOffTimeStamp(c.getTimeInMillis(), 7200)));
        
        System.out.println(System.currentTimeMillis());
        System.out.println(Instant.now().toEpochMilli());
    }
    
    private long roundOffTimeStamp(long timestamp, int interval) {
        if (interval > 3600) {
            return this.roundOffTimestampByHour(timestamp, interval / 3600);
        } else if (interval > 60) {
            return this.roundOffTimestampByMinute(timestamp, interval / 60);
        } else {
            return this.roundOffTimestampBySecond(timestamp, interval);
        }
    }

    private long roundOffTimestampByHour(long timestamp, int hour) {
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(timestamp);
        // Rounding hour
        int ch = c.get(Calendar.HOUR_OF_DAY);
        ch = ch - (ch % hour);
        // Resetting minute, second & millSecond
        c.set(Calendar.HOUR_OF_DAY, ch);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTimeInMillis();
    }

    private long roundOffTimestampByMinute(long timestamp, int minute) {
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(timestamp);
        // Rounding minute
        int cm = c.get(Calendar.MINUTE);
        cm = cm - (cm % minute);
        // Resetting second & millSecond
        c.set(Calendar.MINUTE, cm);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTimeInMillis();
    }

    private long roundOffTimestampBySecond(long timestamp, int second) {
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(timestamp);
        // Rounding second
        int cs = c.get(Calendar.SECOND);
        cs = cs - (cs % second);
        // Resetting millSecond
        c.set(Calendar.SECOND, cs);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTimeInMillis();
    }
}
