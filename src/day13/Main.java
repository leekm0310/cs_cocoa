package day13;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("clock: 시계 출력, cal: 현재 달력 보기, cal2: 특정 년월 보기");
        String answer = sc.nextLine();
        if (answer.equals("cal2")){
            System.out.println("년도 입력: ");
            int year = sc.nextInt();
            System.out.println("월 입력: ");
            int month = sc.nextInt();
            System.out.println(year + "년 " + month + "월 ");
            MyCalendar m = new MyCalendar(year, month);
            m.find();
            m.show();
        } else if (answer.equals("cal")){
            Calendar today = Calendar.getInstance();
            int year = today.get(Calendar.YEAR);
            int month = today.get(Calendar.MONTH);
            System.out.println(month+1);
            MyCalendar m = new MyCalendar(year, month);
            m.present();
            m.show();
        } else if (answer.equals("clock")){
            Clock c = new Clock();
            c.getTime();
        }

    }
}
