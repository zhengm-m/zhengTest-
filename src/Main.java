import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void bubbleSort(int[] arr) {
        int a;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
    }
    public static void main(String[] args){
        int arr[]=new int[]{2,3,7,9,4,1,2};
        Main.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("@@@@@@@@@@@@@");
        System.out.println(date());
        System.out.println("Hello Word");
    }

    public static int date(){
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        int weekday= cal.get(Calendar.DAY_OF_WEEK);
        return weekday;
    }




}
