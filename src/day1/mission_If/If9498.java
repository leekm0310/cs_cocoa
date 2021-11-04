package day1.mission_If;

import java.util.Scanner;
public class If9498{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();

        scn.close();

        if(A > 89){
            System.out.println("A");
        } else if(A > 79){
            System.out.println("B");
        } else if(A > 69) {
            System.out.println("C");
        } else if(A > 59) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}