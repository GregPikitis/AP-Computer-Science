package Graphics;
import javax.swing.*;

public class GUIWindow {
    public static void main(String[] args){
        JFrame GUI = new JFrame();
        GUI.setTitle("First GUI Program");
        GUI.setSize(300,200);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI.setVisible(true);
    }
}
