package manager;

import graphics.MainFrame;
import graphics.MainPanel;

public class Manager {
	
	private MainFrame mainFrame;
	private MainPanel mainPanel;
	
	public Manager() {
		this.mainFrame = new MainFrame();
	}
	
	public void start() {
		this.mainFrame.setVisible(true);
		this.mainPanel = new MainPanel();
	}
}
