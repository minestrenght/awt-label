package org.lotus;

import java.awt.Frame;
import java.awt.EventQueue;
import java.awt.Label;

public class Launch {

    public static void main(String[] args) {

		Runnable work = new Runnable() {
			@Override
			public void run() {
				Frame f = new Frame("My AWT Frame"); //set title
				f.setSize(300, 200); //width, height
				f.setLocationRelativeTo(null); //put in center of screen
				Label l = new Label("Press ctrl + c on terminal to exit"); //new label
				f.add(l); //add label to frame
				f.setVisible(true); //show to the user
			}
		};

		// create thread for this work(optional but recommended)
		EventQueue.invokeLater(work);
    }
}
