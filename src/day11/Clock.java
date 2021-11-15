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

    public static Map getTime(){
        LocalTime time = LocalTime.now();
        int hour = time.get(ChronoField.CLOCK_HOUR_OF_AMPM);
        int minute = time.getMinute();

        Map hm = new HashMap();
        hm.put("hour", hour);
        hm.put("minute", minute);
        change(hm);
        return hm;
    }

    public static void change(Map map){

        int hour = (int) map.get("hour");
        int minute = (int) map.get("minute");
        String[] hours1 = {"","열"};
        String[] hours2 = {"한", "두", "세", "네", "다섯", "여섯", "일곱", "여덟", "아홉"};
        String[] min1 = {"","","이","삼","사","오"};
        String[] min2 = {"일","이","삼","사","오","육","칠","팔","구","십"};


        int h1 = hour / 10;
        int h2 = hour % 10;

        int m1 = minute / 10;
        int m2 = minute % 10;
        String hour_first = hours1[h1];
        String hour_second = hours2[h2-1];
        System.out.println(hour_first + hour_second + "시");

        if (m1 != 0){
            String min_first = min1[m1] + "십";
            String min_second = min2[m2 - 1];
            System.out.println(min_first + min_second + "분");
        } else {
            String min_first = min1[m1];
            String min_second = min2[m2 - 1];
            System.out.println(min_first + min_second + "분");
        }
    }
}