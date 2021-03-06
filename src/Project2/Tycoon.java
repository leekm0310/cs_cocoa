package Project2;

import java.io.IOException;
import java.util.*;

class Tycoon {
    private int round = 1;
    private HashMap<String, String[]> liqMenus;
    private String mix;
    private String base;
    private Scanner sc = new Scanner(System.in);
    private ArrayList<String> result = new ArrayList<>();
    private String pick;
    private List choice;
    private int myMoney = 1500;
    private BarMenu barMenu = new BarMenu();
    private Filetest filetest = new Filetest();



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
        liqMenus = barMenu.init();
        List<String> liqList = liqMenu();
        String pick = shuffle(liqList);
        System.out.println("=========== "+ round+ " 라운드 ============");
        System.out.println("손님이 " + pick + "을/를 주문했습니다.");
        System.out.println("재료선택은 y/ 패스는 n");
        addSteps();
    }

    public void addSteps() throws IOException {
        String yn = sc.next();
        if (yn.equals("y")) {
            mixing();
        } else if(yn.equals("r")) {
            result.clear();
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

        choice =  Arrays.asList(liqMenus.get(pick));
        System.out.println("손님의 주문 " + pick + ":" + choice);
        System.out.println("내가 만든 칵테일: " + result);
        boolean r = Arrays.equals(choice.toArray(), result.toArray());
        result.clear();
        judge(r);
        return r;
    }

    public void judge(boolean r) throws IOException {
        if (r == true){
            myMoney = myMoney + 500;
            System.out.println("성공! 500원을 획득했습니다. 현재 소지금: " + myMoney);
        } else {
            myMoney = myMoney - 1000;
            System.out.println("실패! 1000원을 잃었습니다. 현재 소지금: " + myMoney);
        }
        System.out.println("저장하고 나가기 q/ 계속 진행 g");
        String ask = sc.next();
        if (ask.equals("q")){
            filetest.save(round, myMoney);
            System.out.println("===========저장 완료===========");
        } else {
            j2();
        }
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
        System.out.println("1.소주 2.진 3.보드카 4.위스키 5.콜라 6.토닉워터 7.라임 8.레몬");
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
            base = "토닉워터";
        } else if (num1 == 7){
            base = "라임";
        } else if (num1 == 8){
            base = "레몬";
        }
        result.add(base);
        System.out.println(base +"을/를 추가했습니다. 지금까지 선택한 재료: " + result );
        System.out.println("재료 추가 y / 서빙 n / 다시 만들기는 r");

        return result;
    }


    public int[] loadone() throws IOException {
        System.out.println("==============저장 목록==============");
        filetest.loadshow();
        System.out.println("몇번째 파일을 불러올까요?");
        int l = sc.nextInt();
        int[] cho = filetest.load(l);
        return cho;
    }

    public void loadtest() throws IOException {
        int[] cho =  loadone();
        round = cho[0] + 1;
        myMoney = cho[1];
    }

    public void beforestart() throws IOException {
        System.out.println("…─━☆‥…─━☆‥…─━☆‥…──━☆──━☆──━☆");
        System.out.println("…─━☆‥…─━☆‥…─━☆‥…──━☆──━☆──━☆");
        System.out.println("========칵테일바 타이쿤=========");
        System.out.println("…─━☆‥…─━☆ ver 1.0 ‥…──━☆──━☆");
        System.out.println("…─━☆‥…─━☆‥…─━☆‥…──━☆──━☆──━☆");
        System.out.println();
        System.out.println("불러오기는 1, 새게임은 2");
        int choice = sc.nextInt();
        if (choice == 1){
            loadtest();
            starts();
        } else {
            starts();
        }
    }

}