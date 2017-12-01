package Graphics;
import java.awt.*;
import javax.swing.*;

public class GUIWindow3 {
    public static void main(String[] args){
        JFrame GUI = new JFrame();
        GUI.setTitle("Third GUIProgram");
        GUI.setSize(300,200);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.red);

        JPanel eastPanel = new JPanel();
        eastPanel.setBackground(Color.blue);

        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.red);

        JPanel westPanel = new JPanel();
        westPanel.setBackground(Color.blue);

        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.white);

        Container pane = GUI.getContentPane();
        pane.add(northPanel, BorderLayout.NORTH);
        pane.add(eastPanel, BorderLayout.EAST);
        pane.add(southPanel, BorderLayout.SOUTH);
        pane.add(westPanel, BorderLayout.WEST);
        pane.add(centerPanel, BorderLayout.CENTER);
        GUI.setVisible(true);

    }
}
