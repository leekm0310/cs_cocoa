package Project2;

import java.io.*;
import java.time.LocalDateTime;


public class Filetest {

    public void save(int round) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("save.txt"), "UTF-8"));

        LocalDateTime now = LocalDateTime.now();

        bw.write(round);
        bw.write(String.valueOf(now));
        bw.close();

//        BufferedWriter bw = new BufferedWriter(new FileWriter("save.txt", true));
//        PrintWriter pw = new PrintWriter(bw, true);
//
//        int r = round;
//
//        pw.write(r);
//        pw.close();
    }

    public static void load() throws IOException {
        File file = new File("save.txt");
        FileReader fileReader = new FileReader(file);
        int cur = 0;
        while ((cur = fileReader.read()) != -1){
            System.out.println((char)cur);
        }
        fileReader.close();
    }

    public static void main(String[] args) throws IOException {
        load();
    }
}
