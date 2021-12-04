package baseball;

import java.util.Arrays;
import java.util.Scanner;

public class BaseballGame {
    //숫자생성기
    public int[] initBall(){
        int[] newBall = new int[3];

        for (int i = 0; i < newBall.length; i++){
            newBall[i] = (int)(Math.random() *10);
        }
        System.out.println(newBall);
        return newBall;
    }

    //내숫자
    public int[] myBall(){
        Scanner scn = new Scanner(System.in);
        int[] myBall = new int[3];
        String myB = scn.next();

        for (int i = 0; i < myBall.length; i++){
            myBall[i] = Character.getNumericValue(myB.charAt(i));
        }
        System.out.println(myBall);
        return myBall;
    }

    //비교하기
    public int[] compare(){
        int[] newBall = initBall();
        int[] myBall = myBall();
//        int strike = 0;
//        int ball = 0;
//        int nothing = 0;
        int[] compare = new int[3];
        boolean result;

        for (int i = 0; i < newBall.length; i++){

        }
        return compare;
    }

    //판정
    public void judge(){
        int[] compare = compare();
        
    }

    public void runGame(){
        initBall();
        myBall();
        compare();
    }


    public static void main(String[] args) {

    }
}
