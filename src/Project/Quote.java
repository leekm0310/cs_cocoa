package Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Quote {

    public List<String> quoteForToday() throws FileNotFoundException{
        List quoteList = new ArrayList<>();
        File f = new File ("quote.txt");
        Scanner scn = new Scanner(f);
        while (scn.hasNextLine()){
            String quote = scn.nextLine();
            quoteList.add(quote);
        }
        scn.close();
        return quoteList;
    }

    public static void shuffle(List<String> s){
        Collections.shuffle(s);
    }

    public static void printQ(List<String> s){
        System.out.println(s.get(1));
    }

    public void tQuote() throws FileNotFoundException{
        System.out.println("오늘 하루도 수고했어요.");
        List<String> quoteList = quoteForToday();
        shuffle(quoteList);
        printQ(quoteList);
    }

}
