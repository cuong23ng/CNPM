package view;

import controller.MenuExampleController;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuExampleView extends JFrame {
	private JLabel jLabel;
	
	public MenuExampleView() {
		this.setTitle("Draw Example");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		//Tao controller
		MenuExampleController menuExampleController = new MenuExampleController(this);
		
		//Tao thanh menu
		JMenuBar jMenuBar = new JMenuBar();
		
		//Tao 1 menu
		JMenu jMenu_information = new JMenu("Xem thông tin");
		//Tao cac menu con
		JMenuItem jMenuItem_hokhau = new JMenuItem("Hộ khẩu");
		jMenuItem_hokhau.addActionListener(menuExampleController);
		
		JMenuItem jMenuItem_nhankhau = new JMenuItem("Nhân khẩu");
		jMenuItem_nhankhau.addActionListener(menuExampleController);
		
		jMenu_information.add(jMenuItem_hokhau);
		jMenu_information.addSeparator();
		jMenu_information.add(jMenuItem_nhankhau);
		
		JMenu jMenu_xingiay = new JMenu("Xin giấy");
		JMenuItem jMenuItem_tamtru = new JMenuItem("Tạm trú");
		jMenuItem_tamtru.addActionListener(menuExampleController);
		
		JMenuItem jMenuItem_tamvang = new JMenuItem("Tạm vắng");
		jMenuItem_tamvang.addActionListener(menuExampleController);
		
		jMenu_xingiay.add(jMenuItem_tamtru);
		jMenu_xingiay.addSeparator();
		jMenu_xingiay.add(jMenuItem_tamvang);
		
		JMenu jMenu_minhchung = new JMenu("Minh chứng");
		
		jMenuBar.add(jMenu_information);
		jMenuBar.add(jMenu_xingiay);
		jMenuBar.add(jMenu_minhchung);
		
		//Them thanh menu vao chuong trinh
		this.setJMenuBar(jMenuBar);
		
		//Tao label hien thi
		Font font = new Font("Arial", Font.BOLD, 50);
		jLabel = new JLabel();
		
		this.setLayout(new BorderLayout());
		
		this.add(jLabel, BorderLayout.CENTER);
		
		this.setVisible(true);
	}

	public void setTextJLabel(String s) {
		this.jLabel.setText(s);
	}
}


