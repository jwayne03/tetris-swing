package manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import graphics.LoginPanel;
import graphics.MainFrame;

public class Manager {
	
	private LoginPanel loginPanel;
	private MainFrame mainPanel;
	
	public Manager() {
		this.loginPanel = new LoginPanel();
	}
	
	public void start() {
		this.loginPanel.setVisible(true);
		this.mainPanel = new MainFrame();
	}
	
	private void onClickLoggin() {
		this.loginPanel.getBtnNewButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
	}
}
