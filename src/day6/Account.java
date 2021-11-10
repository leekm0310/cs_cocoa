package day6;

import java.util.*;

public class Account {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Map member = new LinkedHashMap();
        login(member);
        System.out.println("가계부를 시작합니다.");
        ArrayList<LinkedHashMap> dataList = new ArrayList<LinkedHashMap>();
        menu(dataList);
    }

    public static void menu(ArrayList<LinkedHashMap> dataList){
        Scanner scn = new Scanner(System.in);
        System.out.println("데이터 입력은 1, 데이터 수정은 2, 데이터 삭제는 3, 데이터 보기는 4를 입력해주세요>");
        int answer2 = scn.nextInt();
        if (answer2 == 1){
            input(dataList);
        } else if (answer2 == 2){
            modify(dataList);
        } else if (answer2 == 3) {
            delete(dataList);
        } else {
            print(dataList);
        }
    }
    public static Map login(Map member){
        Scanner scn = new Scanner(System.in);
        System.out.print("아이디를 입력해 주세요>");
        member.put("ID", scn.next());
        System.out.print("비밀번호를 입력해 주세요>");
        member.put("PW", scn.next());
        System.out.println("안녕하세요. " + member.get("ID") + "님.");
        return member;
    }

    public static ArrayList<LinkedHashMap> input(ArrayList<LinkedHashMap> dataList){
        Scanner scn = new Scanner(System.in);

        LinkedHashMap data = new LinkedHashMap();

        System.out.print("날짜를 입력해주세요>");
        data.put("날짜", scn.next());
        System.out.print("적요를 입력해주세요>");
        data.put("적요", scn.next());
        System.out.print("수입을 입력해주세요>");
        data.put("수입", scn.nextInt());
        System.out.print("지출을 입력해주세요>");
        data.put("지출", scn.nextInt());

        dataList.add(data);

        menu(dataList);
        return dataList;
    }

    public static ArrayList<LinkedHashMap> modify(ArrayList<LinkedHashMap> dataList) {
        Scanner scn = new Scanner(System.in);
        System.out.print("몇번째 항목을 수정하시겠습니까?>");
        int num = scn.nextInt()-1;
        LinkedHashMap hm = (LinkedHashMap) dataList.get(num);

        System.out.print("수정할 항목명 ex)날짜>");
        String item = scn.next();

        if (item.equals("날짜") || item.equals("적요")){
            System.out.print("수정할 내용>");
            String newContent = scn.next();
            hm.put(item, newContent);
        } else if (item.equals("수입") || item.equals("지출")){
            System.out.print("수정할 내용>");
            int newContent = scn.nextInt();
            hm.put(item, newContent);
        }

        menu(dataList);
        return dataList;
    }

    public static ArrayList<LinkedHashMap> delete(ArrayList<LinkedHashMap> dataList) {
        Scanner scn = new Scanner(System.in);
        System.out.print("몇번째 항목을 삭제할까요?>");
        dataList.remove(scn.nextInt() - 1);
        System.out.println("삭제를 완료했습니다");
        print(dataList);
        return dataList;
    }

    public static void print(ArrayList<LinkedHashMap> dataList) {
        int total = 0;
        for (int i = 0; i < dataList.size(); i++) {
            System.out.println((i + 1) + "번 항목");
            LinkedHashMap data = dataList.get(i);

            Iterator aa = data.keySet().iterator();
            while (aa.hasNext()){
                String key = (String) aa.next();
                System.out.println(key +": "+ data.get(key) +" ");
            }
            int a = (int) data.get("수입") - (int) data.get("지출");
            total += a;
        }
        System.out.println("현재잔액: " + total);
        menu(dataList);
    }
}