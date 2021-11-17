package day11;

import java.io.*;

public class Shell {


    public static void main(String[] args) {

        copy();
    }

    public static void read() {
        String pathName = "C:\\Users\\user\\Downloads\\practice";
        File file = new File(pathName);
        System.out.println(pathName + " is exist?? " + file.exists());

        String[] fileNames = file.list();
        for (int i = 0; i < fileNames.length; i++){
            System.out.println(fileNames[i]);
        }
    }

    public static void copy() {
        String pathName = "C:\\Users\\user\\Downloads\\practice\\test.txt";
        String copyName = "C:\\Users\\user\\Downloads\\practice\\test2.txt";
        File file = new File(pathName);
        File copyFile = new File(copyName);

        try {
            FileInputStream fis = new FileInputStream(file);
            FileOutputStream fos = new FileOutputStream(copyFile);

            int fileByte = 0;
            while((fileByte = fis.read()) != -1){
                fos.write(fileByte);
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

