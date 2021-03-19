package manager;

import graphics.LoginFrame;
import graphics.MainPanel;

public class Manager {
	
	private LoginFrame loginFrame;
	private MainPanel mainPanel;
	
	public Manager() {
		this.loginFrame = new LoginFrame();
	}
	
	public void start() {
		this.loginFrame.setVisible(true);
		this.mainPanel = new MainPanel();
	}
}
