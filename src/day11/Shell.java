package day11;

import java.io.File;

public class Shell {
    public static void main(String[] args) {
        String pathName = "C:\\Users\\user\\Downloads\\practice";
        File file = new File(pathName);
        System.out.println(pathName + " is exist?? " + file.exists());

        String[] fileNames = file.list();
        for (int i = 0; i < fileNames.length; i++){
            System.out.println(fileNames[i]);
            }
        }

}

