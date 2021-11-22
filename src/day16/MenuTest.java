package day16;

import java.awt.*;

public class MenuTest {
    public static void main(String[] args) {
        Frame f = new Frame("menu");
        f.setSize(300,200);

        MenuBar mb = new MenuBar();
        Menu mFile = new Menu("File");

        MenuItem miNew = new MenuItem("New");
        MenuItem miOpen = new MenuItem("Open");
        Menu mOthers = new Menu("Others");
        MenuItem miExit = new MenuItem("Exit");

        mFile.add(miNew);
        mFile.add(miOpen);
        mFile.add(mOthers);
        mFile.addSeparator();       //메뉴 분리선
        mFile.add(miExit);

        MenuItem miPrint = new MenuItem("Print..");
        MenuItem miPreview = new MenuItem("Print Preview..");
        MenuItem miSetup = new MenuItem("Print Setup..");
        mOthers.add(miPrint);
        mOthers.add(miPreview);
        mOthers.add(miSetup);

        Menu mEdit = new Menu("Edit");
        Menu mView = new Menu("View");
        Menu mHelp = new Menu("Help");
        CheckboxMenuItem miStatusbar = new CheckboxMenuItem("Statusbar");
        mView.add(miStatusbar);

        mb.add(mFile);              //MenuBar에 menu를 추가한다.
        mb.add(mEdit);
        mb.add(mView);
        mb.setHelpMenu(mHelp);      //mHelp를 Helpmenu로 지정한다

        f.setMenuBar(mb);           //frame에 menubar를 포함시킨다
        f.setVisible(true);

    }
}
