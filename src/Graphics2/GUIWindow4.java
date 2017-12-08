package Graphics2;

import javax.swing.*;
import java.awt.*;

public class GUIWindow4 {
	public static void main(String[] args){
		JFrame GUI = new JFrame();
		GUI.setTitle("GUI Program");
		GUI.setSize(300,200);
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ColorPanel4 panel = new ColorPanel4(Color.white);
		Container pane = GUI.getContentPane();
		pane.add(panel);
		GUI.setVisible(true);
	}
}
