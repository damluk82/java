package swing.gwt.test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Listen implements ActionListener {

	JFrame frame = new JFrame();
	JButton button = new JButton("hal");
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Listen listen = new Listen();
		listen.go();
	}
	
	public void go(){	
		
		button.setPreferredSize(new Dimension(100, 100));
		frame.setSize(600, 600);
		button.setBackground(Color.CYAN);
		frame.setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(button);
		
		button.addActionListener(this);
		
		frame.setVisible(true);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if (button.getText() == "hal")
			button.setText("miez");
		else {
			button.setText("hal");
		}
	}
}
