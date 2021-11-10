package K;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class AboutFile {
    public static void main(String[] args){
        System.out.println(filetest());
        writeCSV();
        ArrayList<LinkedHashMap> dataList = new ArrayList<LinkedHashMap>();
        //dataList = [{날짜="0811", "적요"="ooo", "수입"="0", "지출"="300"}];

    }

    public static boolean filetest(){
        File f = new File(".\\src\\K\\ff.csv");
        return f.exists();
    }

    public static void writeCSV(){
        File csv = new File(".\\src\\K\\ff.csv");
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(csv, true));

            ArrayList<LinkedHashMap> dataList = new ArrayList<LinkedHashMap>();


            for (int i = 0; i < dataList.size(); i++){
                LinkedHashMap data = dataList.get(i);

                Iterator aa = data.keySet().iterator();
                while (aa.hasNext()){
                    String key = (String) aa.next();
                    String aData = (String) data.get(key);
                    bw.write(aData);
                    bw.newLine();
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
