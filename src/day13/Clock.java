package day13;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Clock {

    public void getTime(){
        Scanner scn = new Scanner(System.in);

        Th1 t = new Th1();
        t.start();

        String input = scn.next();
        t.interrupt();
    }
}

class Th1 extends Thread{

    public void run() {

        Map hm = new HashMap();

        while(!isInterrupted()) {
            LocalTime time = LocalTime.now();
            int hour = time.get(ChronoField.CLOCK_HOUR_OF_AMPM);
            int minute = time.getMinute();
            hm.put("hour", hour);
            hm.put("minute", minute);
            change(hm);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                interrupt();
            }
        }
    }

    public void change(Map map){

        int hour = (int) map.get("hour");
        int minute = (int) map.get("minute");
        String[] hours1 = {"","열"};
        String[] hours2 = {"한", "두", "세", "네", "다섯", "여섯", "일곱", "여덟", "아홉"};
        String[] min1 = {"","","이","삼","사","오"};
        String[] min2 = {"","일","이","삼","사","오","육","칠","팔","구","십"};

        int h1 = hour / 10;
        int h2 = hour % 10;

        if ( h1 == 1 && h2 == 0){
            String hourFirst = hours1[h1];
            System.out.println(hourFirst + "시");
        } else {
            String hourFirst = hours1[h1];
            String hourSecond = hours2[h2-1];
            System.out.println(hourFirst + hourSecond + "시");
        }


        int m1 = minute / 10;
        int m2 = minute % 10;

        if (m1 != 0 && m2 != 0){
            String minFirst = min1[m1] + "십";
            String minSecond = min2[m2];
            System.out.println(minFirst + minSecond +"분");
        } else if ( m1 == 1 && m2 == 0){
            String minFirst = "십";
            System.out.println(minFirst + "분");
        } else {
            String minFirst = min1[m1];
            String minSecond = min2[m2];
            System.out.println(minFirst + minSecond + "분");
        }
    }
}