package Project2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BarMenu {
    public static void main(String[] args) {
        initMenu();
    }

    private static Map initMenu(){
        List<String> lines = inputData();

        HashMap menuMap = new HashMap();
        for (String line:lines){
            String[] lineSplit = line.split("\t");
//            BarMenu barMenu = getMenus(lineSplit);
//            menuMap.put(barMenu.getMenuName(), barMenu);
        }
        return menuMap;
    }

//    private static BarMenu getMenus(String[] lineSplit){
//        String menuName = lineSplit[0];
//        String mix1 = lineSplit[1];
//        String mix2 = lineSplit[2];
//
//        BarMenu barMenu = new BarMenu(menuName, mix1, mix2);
//        return  barMenu;
//    }


    private static List<String> inputData(){
        List<String> lines = new ArrayList<>();
        final Path DATA_SRC = Paths.get("liq.txt");
        try {
            Files.lines(DATA_SRC, Charset.defaultCharset()).forEach(lines::add);
        } catch (IOException ie){
            System.out.println("실패");
        }
        return lines;
    }


    private String menuName;
    private String mix1;
    private String mix2;

    public BarMenu(String menuName, String mix1, String mix2){
        this.menuName = menuName;
        this.mix1 = mix1;
        this.mix2 = mix2;
    }

    public String getMenuName() {
        return menuName;
    }

    public String getMix1() {
        return mix1;
    }

    public String getMix2() {
        return mix2;
    }
}
