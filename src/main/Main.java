package main;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        String[][] data = {{"1","Math","85"},{"2","Geo","90"}};
        String[] heading={"ID","Lesson","Result"};
        JTable jt=new JTable(data,heading);
        jt.setBounds(30,40,200,300);
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.add(jt);
    }
}
