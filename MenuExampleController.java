package controller;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import view.MenuExampleView;
import frame.MenuFrame;

public class MenuExampleController implements ActionListener {
	private MenuExampleView menuExampleView;
	private MenuFrame menuFrame;
	
	public MenuExampleController(MenuExampleView menuExampleView) {
		super();
		this.menuExampleView = menuExampleView;
	}

	public MenuExampleController(MenuFrame menuFrame) {
		super();
		this.menuFrame = menuFrame;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
				
		if (button.equals("Hộ khẩu")) {
			this.menuExampleView.setTextJLabel("Ban da click JmenuItem Hộ khẩu");
		} else if (button.equals("Exit")) {
			//this.menuExampleView.setTextJLabel("Ban da click JmenuItem EXIT");
			System.exit(0);
		} else if (button.equals("Nhân khẩu")) {
			this.menuExampleView.setTextJLabel("Ban da click JmenuItem Nhân khẩu");
		} else if (button.equals("Tạm trú")) {
			this.menuExampleView.setTextJLabel("Ban da click JmenuItem xin giấy Tạm trú");
		} else if (button.equals("Tạm vắng")) {
			this.menuExampleView.setTextJLabel("Ban da click JmenuItem xin giấy tạm vắng");
		} else if (button.equals("Minh chứng")) {
			this.menuExampleView.setTextJLabel("Ban da click JmenuItem xin giấy minh chứng");
		} 
		
		if (button.equals("Giấy tạm trú")) {
			this.menuFrame.setTextJLabel("Ban da click xin giay tam tru");
		} else if (button.equals("Giấy tạm vắng")) {
			this.menuFrame.setTextJLabel("Ban da click xin giay tam vang");
		}
	}
}
