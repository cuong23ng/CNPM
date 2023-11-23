package frame;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import controller.MenuExampleController;

public class MenuFrame extends JFrame {
	private JFrame frame;
	private JLabel jLabel;
	
	public MenuFrame() {
		MenuExampleController menuExampleController = new MenuExampleController(this);
		
		frame = new JFrame();
		
		frame.setLayout(new GridLayout(0, 2));

	    JButton button1 = new JButton("Giấy tạm vắng");
	    frame.add(button1);
	    button1.addActionListener(menuExampleController);
	    
	    JButton button2 = new JButton("Giấy tạm trú");
	    frame.add(button2);
	    button1.addActionListener(menuExampleController);
	    
	    frame.setLayout(new GridLayout(1, 1));
	    
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setTitle("Ví dụ GridLayout trong Java Swing");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
	public void setTextJLabel(String s) {
		this.jLabel.setText(s);
	}
}
