package day1.mission_If;

import java.util.Scanner;

public class If14681{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        long A = scn.nextLong();
        scn.nextLine();
        long B = scn.nextLong();

        scn.close();

        if(A>0&&B>0){
            System.out.println("1");
        } else if(A<0&&B>0) {
            System.out.println("2");
        } else if(A<0&&B<0) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }
}
