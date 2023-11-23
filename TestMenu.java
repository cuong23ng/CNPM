package view;

import frame.MenuFrame;
import javax.swing.UIManager;

public class TestMenu {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			//new MenuExampleView();
			new MenuFrame();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
