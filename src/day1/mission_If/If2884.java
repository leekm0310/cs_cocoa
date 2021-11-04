package day1.mission_If;

import java.util.Scanner;

public class If2884{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int H = scn.nextInt();
        int M = scn.nextInt();
        scn.close();

        int HH = (H*60+M-45)/60;
        int MM = (H*60+M-45)%60;
        if (HH==0&&MM<0){
            int MM2 = MM + 60;
            int HH2 = 24 - 1;

            System.out.println(HH2 +" "+MM2);
        } else {
            System.out.println(HH +" "+MM);
        }

    }
}
