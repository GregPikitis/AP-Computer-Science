package Graphics2;

import javax.swing.*;
import java.awt.*;

public class proj3_6 {
	public static void main(String[] args){
		JFrame GUI = new JFrame();
		GUI.setTitle("GUI Program");
		GUI.setSize(300,200);
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ColorPanel5 panel = new ColorPanel5(Color.white);
		Container pane = GUI.getContentPane();
		pane.add(panel);
		GUI.setVisible(true);
	}
}
