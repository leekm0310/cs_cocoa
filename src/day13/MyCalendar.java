package day13;

import java.util.Calendar;

public class MyCalendar {
    public int year;
    public int month;
    public int lastDay;
    public int startWeek;

    MyCalendar(int year, int month){
        this.year = year;
        this.month = month;
    }

    public void find(){
        Calendar day = Calendar.getInstance();
        day.set(year, month-1, 1);
        this.lastDay = day.getActualMaximum(day.DAY_OF_MONTH);
        this.startWeek = day.get(day.DAY_OF_WEEK);
    }

    public void present(){
        Calendar day = Calendar.getInstance();
        day.set(year, month, 1);
        this.lastDay = day.getActualMaximum(day.DAY_OF_MONTH);
        this.startWeek = day.get(day.DAY_OF_WEEK);
    }

    public void show(){
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        int day = 1;
        switch (startWeek){
            case 7: System.out.print(" \t");
            case 6: System.out.print(" \t");
            case 5: System.out.print(" \t");
            case 4: System.out.print(" \t");
            case 3: System.out.print(" \t");
            case 2: System.out.print(" \t");
        }

        int countDay = startWeek;
        for (int i = 1; i <= lastDay; i++){
            System.out.print(i + "\t");
            if (countDay % 7 == 0){
                System.out.println();
            }
            countDay++;
        }

    }
}