package day3;

import java.util.*;

public class RandomPicks {
    public static void main(String[] args){
        System.out.print("몇 명 인가요?(8명 이내로 숫자만 적어주세요)");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        scn.close();
        test1(a);
    }

    public static void test1(int a){
        List<String> name = Arrays.asList("짱구", "코코아", "정우성", "K", "유리", "지수", "아이유", "수현");
        // List<String> name = ["짱구", "코코아", "정우성", "K", "유리", "지수", "아이유", "수현"];
        Collections.shuffle(name);

        for (int i = 0; i < a; i++){
            System.out.print(name.get(i) + ", ");
        }
    }
}
