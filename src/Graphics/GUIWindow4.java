package Graphics;
import javax.swing.*;
import java.awt.*;

public class GUIWindow4 {
    public static void main(String[] args){
        JFrame GUI = new JFrame();
        GUI.setTitle("Fourth GUI Program");
        GUI.setSize(300,200);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.white);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.black);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.gray);

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color. white);

        Container pane = GUI.getContentPane();
        pane.setLayout(new GridLayout(2,2));

        pane.add(panel1);
        pane.add(panel2);
        pane.add(panel3);
        pane.add(panel4);

        GUI.setVisible(true);
    }
}
