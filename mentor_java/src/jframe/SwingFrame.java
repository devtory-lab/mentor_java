package jframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Listener1 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		button.setText("버튼을 클릭했습니다.");
	}
	
}


class AddFrame extends JFrame{
	
	public AddFrame() {
		setTitle("Jframe");
		setLocation(100, 100);
		setSize(300, 300);
		
		JButton button = new JButton("Button");
		button.addActionListener(new Listener1());
		
		this.setLayout(new FlowLayout());
		

		this.add(button);
		setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}

public class SwingFrame {

	public static void main(String[] args) {
		
		AddFrame a = new AddFrame();

	}

}
