package day8;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

//todo: 끝난것이 아니다... 정렬, 검색 기능 넣고 수정해보자..
public class Filetest {
    public static void writeCSV(ArrayList<LinkedHashMap> dataList){
        File csv = new File(".\\src\\K\\ff.csv");
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(csv, true));


            for (int i = 0; i < dataList.size(); i++){
                LinkedHashMap data = dataList.get(i);
                for (int y = 0; y <= 1; y++) {
                    String aData = (String) data.get("날짜");
                    bw.write(aData);
                }
                for (int z = 2; z <= 3; z++){
                    int aData = (int) data.get("수입");
                    bw.write(aData);


                /*Iterator aa = data.keySet().iterator();
                while (aa.hasNext()){
                    String key = (String) aa.next();
                    String aData = (String) data.get(key);
                    //String aData = Integer.toString((int)data.get(key));
                    bw.write(aData);*/
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null){
                    bw.flush();
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
