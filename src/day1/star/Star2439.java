package day1.star;

import java.util.Scanner;

public class Star2439{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int star = scn.nextInt();
        scn.close();

        for (int i=1; i<=star; i++){
            for(int k=star; k>i; k--){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
