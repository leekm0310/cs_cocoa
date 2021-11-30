package Project2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Tycoon {
    private int round = 1;
    private HashMap<String, String[]> liqMenus = new HashMap<>();
    private String mix;
    private String base;
    private Scanner sc = new Scanner(System.in);
    private ArrayList<String> result = new ArrayList<>();
    private String pick;
    private List choice = new ArrayList<>();
    private int myMoney = 1000;


//    public HashMap makeMenu() {
//        List c1 = new ArrayList<String>();
//        c1.add("소주");
//        c1.add("콜라");
//        liqMenus.put("칵테일1",c1);
//        List c2 = new ArrayList<String>();
//        c2.add("진");
//        c2.add("탄산수");
//        liqMenus.put("칵테일2",c2);
//        List c3 = new ArrayList<String>();
//        c3.add("보드카");
//        c3.add("탄산수");
//        liqMenus.put("칵테일3",c3);
//        List c4 = new ArrayList<String>();
//        c4.add("위스키");
//        c4.add("탄산수");
//        liqMenus.put("칵테일4",c4);
//        return liqMenus;
//
//    }

    public HashMap makeMenu() throws IOException {
        String filePath = "test.txt";

        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while ((line = reader.readLine()) != null)
        {
            String[] parts = line.split(":", 2);
            if (parts.length >= 2)
            {
                String key = parts[0];
                String[] value = parts[1].split(",");

                liqMenus.put(key, value);
            } else {
                System.out.println("ignoring line: " + line);
            }
        }
        reader.close();
        return liqMenus;
    }

    public List<String> liqMenu() {
        List liqList = new ArrayList<String>();
        Iterator<String> keys = liqMenus.keySet().iterator();
        while (keys.hasNext()){
            String key = keys.next();
            liqList.add(key);
        }
        return liqList;
    }


    public String shuffle(List<String> s){
        Collections.shuffle(s);
        pick = (String) s.get(0);
        return pick;
    }

    public void starts() throws IOException {
        makeMenu();
        List<String> liqList = liqMenu();
        List choice = new ArrayList();
        String pick = shuffle(liqList);
        System.out.println("============= "+ round+ " 라운드 ==============");
        System.out.println("손님이 " + pick + "을/를 주문했습니다.");
        System.out.println("재료선택은 y/ 패스는 n");
        addSteps();
    }

    public void addSteps() throws IOException {
        String yn = sc.next();
        if (yn.equals("y")) {
            mixing();
        } else if (yn.equals("n")){
            endMixing();
        } else {
            System.out.println("잘못 누르셨습니다");
            addSteps();
        }
    }

    public void mixing() throws IOException {
        chooseBase();
        addSteps();
    }

    public boolean endMixing() throws IOException {

//        choice = (List) liqMenus.get(pick);
        choice =  Arrays.asList(liqMenus.get(pick));
        System.out.println("손님의 주문 " + pick + ":" + choice);
        System.out.println("내가 만든 칵테일" + result);
        boolean r = Arrays.equals(choice.toArray(), result.toArray());
        result.clear();
        judge(r);
        return r;
    }

    public void judge(boolean r) throws IOException {
        if (r == true){
            myMoney = myMoney + 500;
            System.out.println("성공! 500원을 획득했습니다");
            System.out.println("현재 소지금: " + myMoney);
        } else {
            myMoney = myMoney - 1000;
            System.out.println("실패! 1000원을 잃었습니다");
        }
        j2();
    }

    public void j2() throws IOException {
        if (myMoney <= 0){
            System.out.println("게임오버");
        } else {
            round ++;
            starts();
        }

    }

    public List chooseBase(){
        System.out.println("재료를 골라주세요");
        System.out.println("1.소주 2.진 3.보드카 4.위스키 5.콜라 6.탄산수 7.라임 8.레몬");
        int num1 = sc.nextInt();
        if (num1 == 1){
            base = "소주";
        } else if (num1 == 2){
            base = "진";
        } else if (num1 == 3){
            base = "보드카";
        } else if (num1 == 4){
            base = "위스키";
        } else if (num1 == 5){
            base = "콜라";
        } else if (num1 == 6){
            base = "탄산수";
        } else if (num1 == 7){
            base = "라임";
        } else if (num1 == 8){
            base = "레몬";
        }
        result.add(base);
        System.out.println(base +"를/을 추가했습니다");
        System.out.println("재료를 더 추가할까요? y/n");
        return result;
    }

}