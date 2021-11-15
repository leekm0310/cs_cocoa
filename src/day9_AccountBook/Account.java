package day9_AccountBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {
    ArrayList dataList = new ArrayList();
    Scanner scn = new Scanner(System.in);
    //Items items = new Items(date, detail, income, expense, sort);
    public ArrayList input (ArrayList dataList){

        System.out.print("날짜를 입력해주세요>");

        System.out.print("적요를 입력해주세요>");
        System.out.print("수입을 입력해주세요>");
        System.out.print("지출을 입력해주세요>");
        System.out.print("소비유형을 입력해주세요>");

        return dataList;
    }



}
