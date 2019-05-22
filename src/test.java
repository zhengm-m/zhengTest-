import java.util.Calendar;
import java.util.Date;

public class test {
    public static int date(){
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        int weekday= cal.get(Calendar.DAY_OF_WEEK);
        return weekday;
    }

}
