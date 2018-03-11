package swing.gwt.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NewButton implements ActionListener{

	JFrame frame = new JFrame();
	JButton button = new JButton("Test");
	JPanel panel = new JPanel();
	NewPanel nn = new NewPanel();
	
	
	public static void main(String[] args) {
		NewButton newButton = new NewButton();
		newButton.go();
	}
	
	public void go(){
		panel.setBackground(Color.black);
		panel.setPreferredSize(new Dimension(10, 10));
		button.addActionListener(this);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, nn);
		frame.add(nn);
		frame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
		
	}

}
