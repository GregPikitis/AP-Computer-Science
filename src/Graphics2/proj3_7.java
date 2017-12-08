package Graphics2;

import javax.swing.*;
import java.awt.*;

public class proj3_7 {
	public static void main(String[] args){

		// Write a graphics program that displays the coordinates of the center point of a panel in the form (x,y). This
		// information should be displayed at the panels center point and be automatically updated when the panel is
		// resized.

		JFrame GUI = new JFrame();
		GUI.setTitle("GUI Program");
		GUI.setSize(300,200);
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ColorPanel6 panel = new ColorPanel6(Color.white);
		Container pane = GUI.getContentPane();
		pane.add(panel);
		GUI.setVisible(true);
	}
}
