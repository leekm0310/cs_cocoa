package day3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class IndianName {
    public static void main(String[] args){
        System.out.print("생년월일을 입력해 주세요>");
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        int month = scn.nextInt();
        int day = scn.nextInt();
        scn.close();
        name(year, month, day);

    }

    public static void name(int a, int b, int c){
        int year = a % 10 - 1;
        int month = b - 1;
        int day = c - 1;
        //1.List와 Arrays.asList???. 더 공부해야함.
        //List<String> name1 = ["말 많은", "푸른", "어두운", "조용한", "웅크린",
        //        "백색", "지혜로운", "용감한", "날카로운", "욕심많은"];
        //List<String> name2 = Arrays.asList("늑대", "태양", "양", "매", "황소", "불꽃", "나무",
        //        "달빛", "말", "돼지", "하늘", "바람");
        //List<String> name3 = Arrays.asList("와(과) 함께 춤을", "의 기상", "은(는) 그림자 속에",
        //       " "," "," ","의 환생", "의 죽음", "아래에서", "을(를) 보라", "이(가) 노래하다",
        //        "의 그림자", "의 일격", "에게 쫓기는 남자", "의 행진", "의 왕", "의 유령", "을 죽인자",
        //        "은(는) 맨날 잠잔다", "처럼", "의 고향", "의 전사", "은(는) 나의 친구", "의 노래",
        //        "의 정령", "의 파수꾼", "의 악마", "와(과) 같은 사나이", "을(를) 쓰러트린자", "의 혼",
        //        "은(는) 말이 없다");
        //System.out.print("당신의 이름은 '" + name1.get(year)+" "+name2.get(month)+name3.get(day)+"' 입니다.");
        //2.그냥 배열 쓰는 방법
        String[] name1 = {"말 많은", "푸른", "어두운", "조용한", "웅크린", "백색", "지혜로운", "용감한", "날카로운", "욕심많은"};
        String[] name2 = {"늑대", "태양", "양", "매", "황소", "불꽃", "나무", "달빛", "말", "돼지", "하늘", "바람"};
        String[] name3 = {"와(과) 함께 춤을", "의 기상", "은(는) 그림자 속에", " "," "," ","의 환생", "의 죽음", "아래에서",
                "을(를) 보라", "이(가) 노래하다", "의 그림자", "의 일격", "에게 쫓기는 남자", "의 행진", "의 왕", "의 유령",
                "을 죽인자", "은(는) 맨날 잠잔다", "처럼", "의 고향", "의 전사", "은(는) 나의 친구", "의 노래", "의 정령",
                "의 파수꾼", "의 악마", "와(과) 같은 사나이", "을(를) 쓰러트린자", "의 혼", "은(는) 말이 없다"};

        System.out.println("당신의 이름은 '" + name1[year]+" "+name2[month]+name3[day]+"' 입니다.");
    }

    //유효성 검사 해야 되는데.................
    public boolean numCheck(String str){
        return Pattern.matches("^[0-9]*$", str);
    }

}
