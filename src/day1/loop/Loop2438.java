package day1.loop;

import java.util.Scanner;

public class Loop2438{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int star = scn.nextInt();
        scn.close();

        for (int i=1; i<=star; i++){
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
