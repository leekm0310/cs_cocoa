package day1.gugudan;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        scn.nextLine();
        int b = scn.nextInt();

        scn.close();
        test1(a,b);
        }

        public static void test1(int a, int b){
            for (int i=a; i<=b; i++){
                for(int j=1; j<10; j++) {
                    System.out.println(i + "*" + j + "=" + i * j);
                }
            }
        }
}