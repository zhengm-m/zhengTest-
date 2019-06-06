import  java.util.*;
import java.text.*;

public class DateDemo2 {
    public static void main(String args[]) {

        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");//hh为12小时//

        System.out.println("当前时间为: " + ft.format(dNow));
    }
}