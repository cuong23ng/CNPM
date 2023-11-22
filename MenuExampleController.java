package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MenuExampleView;

public class MenuExampleController implements ActionListener {
	private MenuExampleView menuExampleView;
	
	public MenuExampleController(MenuExampleView menuExampleView) {
		super();
		this.menuExampleView = menuExampleView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
				
		if (button.equals("Open")) {
			this.menuExampleView.setTextJLabel("Ban da click JmenuItem OPEN");
		} else if (button.equals("Exit")) {
			//this.menuExampleView.setTextJLabel("Ban da click JmenuItem EXIT");
			System.exit(0);
		} else if (button.equals("Welcome")) {
			this.menuExampleView.setTextJLabel("Ban da click JmenuItem WELCOME");
		} else if (button.equals("Search")) {
			this.menuExampleView.setTextJLabel("Ban da click JmenuItem SEARCH");
		} else if (button.equals("WINDOW")) {
			this.menuExampleView.setTextJLabel("Ban da click JmenuItem WINDOW");
		}
	}
}
