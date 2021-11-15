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
        String[] min1 = {"이","삼","사","오"};
        String[] min2 = {"일","이","삼","사","오","육","칠","팔","구","십"};
        String h = hours[hour-1] + "시";
        System.out.println(h);
        if (minute <= 10) {
            String m = min2[minute-1];
            System.out.println(m + "분");
        } else if (10 < minute && minute < 20){
            String m1 = "십";
            String m2 = min2[minute-11];
            System.out.println(m1 + m2 + "분");
        } else if (20 < minute && minute < 30){
            String m1 = min1[0] + "십";
            String m2 = min2[minute-21];
            System.out.println(m1 + m2 + "분");
        } else if (30 < minute && minute < 40){
            String m1 = min1[1] + "십";
            String m2 = min2[minute-31];
            System.out.println(m1 + m2 + "분");
        } else if (40 < minute && minute < 50){
            String m1 = min1[2] + "십";
            String m2 = min2[minute-41];
            System.out.println(m1 + m2 + "분");
        } else {
            String m1 = min1[3] + "십";
            String m2 = min2[minute-51];
            System.out.println(m1 + m2 + "분");
        }
    }
}
