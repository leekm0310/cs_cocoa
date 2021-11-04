package day1.loop;

import java.util.Scanner;

public class Loop11720 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        String num2 = scn.next();

        scn.close();
        int sum = 0;

        for(int i=0; i<num; i++){
            sum += num2.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
