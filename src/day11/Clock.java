package day11;


import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Clock {
    public static void main(String[] args) {
        getTime();
    }

    public static Map getTime(){
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        int minute = time.getMinute();
        LocalTime tim = LocalTime.of(hour,minute);
        System.out.println("현재시간 " + tim);

        Map hm = new HashMap();
        hm.put("hour", hour);
        hm.put("minute", minute);
        change(hm);
        return hm;
    }

    public static void change(Map map){
        int hour = (int) map.get("hour");
        int minute = (int) map.get("minute");
        String[] hours = {"한", "두", "세", "네", "다섯", "여섯", "일곱", "여덟", "아홉",
                "열", "열한", "열두"};
        String[] min1 = {"","","이","삼","사","오"};
        String[] min2 = {"일","이","삼","사","오","육","칠","팔","구","십"};
        String h = hours[hour-1] + "시";
        System.out.println(h);

        int m1 = minute / 10;
        int m2 = minute % 10;

        String min_first = min1[m1];
        String min_second = min2[m2 - 1];
        System.out.println(min_first + min_second + "분");


    }
}
