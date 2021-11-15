package day11;


import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Clock {
    public static void main(String[] args) {
        getTime();
    }

    public static void getTime() {

        Map hm = new HashMap();

        while(true) {
            LocalTime time = LocalTime.now();
            int hour = time.get(ChronoField.CLOCK_HOUR_OF_AMPM);
            int minute = time.getMinute();
            hm.put("hour", hour);
            hm.put("minute", minute);
            change(hm);
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void change(Map map){

        int hour = (int) map.get("hour");
        int minute = (int) map.get("minute");
        String[] hours1 = {"","열"};
        String[] hours2 = {"한", "두", "세", "네", "다섯", "여섯", "일곱", "여덟", "아홉"};
        String[] min1 = {"","","이","삼","사","오"};
        String[] min2 = {"","일","이","삼","사","오","육","칠","팔","구","십"};

        int h1 = hour / 10;
        int h2 = hour % 10;

        if ( h1 == 1 && h2 == 0){
            String hour_first = hours1[h1];
            System.out.println(hour_first + "시");
        } else {
            String hour_first = hours1[h1];
            String hour_second = hours2[h2-1];
            System.out.println(hour_first + hour_second + "시");
        }


        int m1 = minute / 10;
        int m2 = minute % 10;

        if (m1 != 0 && m2 != 0){
            String min_first = min1[m1] + "십";
            String min_second = min2[m2];
            System.out.println(min_first + min_second +"분");
        } else if ( m1 == 1 && m2 == 0){
            String min_first = "십";
            System.out.println(min_first + "분");
        } else {
            String min_first = min1[m1];
            String min_second = min2[m2];
            System.out.println(min_first + min_second + "분");
        }
    }
}