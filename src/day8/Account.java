package day8;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.*;

public class Account {

    //private Scanner scn = new Scanner(System.in);
    /*public static Date date(){
        LocalDateTime localDateTime = LocalDateTime.now();
        Date date = java.sql.Timestamp.valueOf(localDateTime);
        return date;
    }*/
    public static void menu(ArrayList<ArrayList> dataList) {
        Scanner scn = new Scanner(System.in);
        System.out.println("1:데이터 입력, 2:데이터 수정, 3:데이터 삭제, 4:데이터 보기 5:검색 를 입력해주세요>");
        int answer2 = scn.nextInt();
        if (answer2 == 1) {
            input(dataList);
        } else if (answer2 == 2) {
            modify(dataList);
        } else if (answer2 == 3) {
            delete(dataList);
        } else if (answer2 == 4) {
            search(dataList);
        } else {
            print(dataList);
        }
    }

    public static ArrayList<ArrayList> input(ArrayList<ArrayList> dataList){
        Scanner scn = new Scanner(System.in);
        //Date date = date();

        ArrayList List = new ArrayList();
        System.out.print("날짜를 입력해주세요>");
        List.add(0,scn.next());

        System.out.print("적요를 입력해주세요>");
        List.add(1, scn.next());

        System.out.print("수입을 입력해주세요>");
        List.add(2, scn.nextInt());

        System.out.print("지출을 입력해주세요>");
        List.add(3, scn.nextInt());

        System.out.print("소비유형을 입력해주세요>");
        List.add(4, scn.next());

        dataList.add(List);
        System.out.println(dataList);

        menu(dataList);
        return dataList;
    }

    public static ArrayList<ArrayList> modify(ArrayList<ArrayList> dataList) {
        Scanner scn = new Scanner(System.in);
        System.out.print("몇번째 항목을 수정하시겠습니까?>");
        int num = scn.nextInt()-1;
        ArrayList hm = dataList.get(num);

        System.out.print("수정할 항목명을 선택하세요");
        System.out.print("1: 날짜 2:적요 3:수입 4:지출 5:소비유형");

        int item = scn.nextInt() - 1;

        if (item == 0 || item == 1){
            System.out.print("수정할 내용>");
            String newContent = scn.next();
            hm.set(item, newContent);
        } else if (item == 2 || item == 3){
            System.out.print("수정할 내용>");
            int newContent = scn.nextInt();
            hm.set(item, newContent);
        }

        menu(dataList);
        return dataList;
    }

    public static ArrayList<ArrayList> delete(ArrayList<ArrayList> dataList) {
        Scanner scn = new Scanner(System.in);
        System.out.print("몇번째 항목을 삭제할까요?>");
        dataList.remove(scn.nextInt() - 1);
        System.out.println("삭제를 완료했습니다");
        System.out.println(dataList);
        return dataList;

    }
    public static void print(ArrayList<ArrayList> dataList) {
        int total = 0;
        System.out.println("================================================");
        System.out.println("번호      날짜        적요     수입   지출  소비유형");
        System.out.println("================================================");
        for (int i = 0; i < dataList.size(); i++) {
            System.out.print((i + 1) + "번 ");
            ArrayList data = dataList.get(i);
            for (int j = 0; j < data.size(); j++) {
                System.out.print("  " + data.get(j) + "  ");
            }
            int sum = (int)data.get(2) - (int)data.get(3);
            total += sum;
        }
        System.out.println("현재잔액: " + total);
        menu(dataList);
    }

    //TODO: 검색을 만들잫ㅎㅎㅎ
    public static void search(ArrayList<ArrayList> dataList){
        Scanner scn = new Scanner(System.in);
        System.out.println("1: 적요");
        String word = scn.next();
        for (int i = 0; i < dataList.size(); i++){
            ArrayList data = dataList.get(i);
            Iterator<String> it = data.iterator();
            while (it.hasNext()){
                String str = it.next();
                if(word.equals(str)){
                    System.out.println("있음");
                }
            }

        }



    }

}