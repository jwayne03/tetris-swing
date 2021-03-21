package manager;

import graphics.LoginPanel;
import graphics.MainFrame;

public class Manager {
	
	private LoginPanel loginFrame;
	private MainFrame mainPanel;
	
	public Manager() {
		this.loginFrame = new LoginPanel();
	}
	
	public void start() {
		this.loginFrame.setVisible(true);
		this.mainPanel = new MainFrame();
	}
}
