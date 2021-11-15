package day11;


import java.time.LocalTime;

public class Clock {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        int minute = time.getMinute();
        System.out.println(time);
        LocalTime tim = LocalTime.of(hour,minute);
        System.out.println(tim);
        String[] hours = {"한", "두", "세", "네", "다섯", "여섯", "일곱", "여덟", "아홉",
                "열", "열한", "열두"};
        String[] min1 = {"이","삼","사","오"};
        String[] min2 = {"일","이","삼","사","오","육","칠","팔","구","십"};
        String h = hours[hour-1];
        System.out.println(h);
        if (10 < minute && minute < 20){
            String m1 = "십";
            String m2 = min2[minute-11];
            System.out.println(m1 + m2);
        } else if (20 < minute && minute < 30){
            String m1 = min1[0] + "십";
            String m2 = min2[minute-21];
            System.out.println(m1 + m2);
        } else if (30 < minute && minute < 40){
            String m1 = min1[1] + "십";
            String m2 = min2[minute-31];
            System.out.println(m1 + m2);
        } else if (40 < minute && minute < 50){
            String m1 = min1[2] + "십";
            String m2 = min2[minute-41];
            System.out.println(m1 + m2);
        } else {
            String m1 = min1[3] + "십";
            String m2 = min2[minute-51];
            System.out.println(m1 + m2);
        }


    }
}
