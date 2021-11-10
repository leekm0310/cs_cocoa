package day8;

import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args){
        System.out.println("가계부를 시작합니다.");
        ArrayList<ArrayList> dataList = new ArrayList<ArrayList>();
        Account.input(dataList);
    }
}
