package Project2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.List;


public class Filetest {

    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public void save(int round, int myMoney) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("save.txt", true), "UTF-8"));

        String time = sdf1.format(System.currentTimeMillis());


        bw.write(time);
        bw.append(" ");
        bw.write(String.valueOf(round));
        bw.append(" ");
        bw.write(String.valueOf(myMoney));
        bw.write("\n");
        bw.close();

    }

    public void loadshow() throws IOException {
        File file = new File("save.txt");
        FileReader fileReader = new FileReader(file);
        int cur = 0;
        while ((cur = fileReader.read()) != -1){
            System.out.print((char)cur);
        }
        fileReader.close();
    }

    public int[] load(int l) throws IOException {
        Path path = Paths.get("save.txt");
        List<String> allLines = Files.readAllLines(path);
        String line = allLines.get(l);
        String[] parts = new String[4];
        parts = line.split(" ");
        int[] cho = new int[2];
        cho[0] = Integer.parseInt(parts[2]);
        cho[1] = Integer.parseInt(parts[3]);
        return cho;
    }

}