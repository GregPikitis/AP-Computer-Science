package Graphics;
import javax.swing.*;
import java.awt.*;

public class GUIWindow2 {
    public static void main(String[] args){
        JFrame GUI = new JFrame();
        GUI.setTitle("Second GUI Program");
        GUI.setSize(300,200);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setBackground(Color.pink);
        Container pane = GUI.getContentPane();
        pane.add(panel);
        GUI.setVisible(true);
    }
}
