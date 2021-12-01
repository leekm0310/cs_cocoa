package Project2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class BarMenu {

    private String filePath = "test.txt";
    private HashMap<String, String[]> liqMenus = new HashMap<>();
    private String line;


    public HashMap<String, String[]> init() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while((line = reader.readLine()) != null) {
            String[] parts = line.split(":", 2);
            if (parts.length >= 2) {
                String key = parts[0];
                String[] value = parts[1].split(",");

                liqMenus.put(key, value);
            } else {
                System.out.println("실패한 라인: " + line);
            }
        }
        reader.close();
        return liqMenus;
    }

}

