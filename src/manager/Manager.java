package manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import filemanagement.FileManagement;
import graphics.ConsolePanel;
import graphics.LoginPanel;
import graphics.MainFrame;
import graphics.MainMenuPanel;
import model.Player;

public class Manager {

	private LoginPanel loginPanel;
	private MainFrame mainFrame;
	private MainMenuPanel mainMenuPanel;
	private FileManagement fileManagement;
	private ConsolePanel consolePanel;

	private List<Player> userAndPassword;
	private Player player;
	
	public Manager() {
		this.fileManagement = new FileManagement();
		this.loginPanel = new LoginPanel();
		this.mainMenuPanel = new MainMenuPanel();
		this.userAndPassword = this.fileManagement.getUserLogin();
		this.player = new Player();
		this.consolePanel = new ConsolePanel();
	}

	public void start() {
		this.loginPanel.setVisible(true);
		this.mainFrame = new MainFrame();
		this.setComponent();
	}
	
	private void setComponent() {
		this.mainFrame.getJSplitPane().setLeftComponent(loginPanel);
		this.onClickLoggin();
	}

	private void onClickLoggin() {
		this.loginPanel.getBtnNewButton().addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent arg0) {			
				for (Player player : userAndPassword) {
					if (player.getName().equals(loginPanel.getUserTextField().getText())) {
						if (player.getPassword().equals(loginPanel.getUserPasswordField().getText())) {
							System.out.println(player.getName() + " " + player.getPassword());
							System.out.println(loginPanel.getUserTextField().getText() + " " + loginPanel.getUserPasswordField().getText());
							mainFrame.getJSplitPane().setRightComponent(consolePanel);
							mainFrame.getJSplitPane().setLeftComponent(mainMenuPanel);
							return;
						} else {
							System.out.println("ERROR");
							return;
						}
					} else {
						System.out.println("ERROR");
						return;
					}
				}
				mainFrame.getJSplitPane().setLeftComponent(loginPanel);		
			}
		});
	}

	private void onClickNewGame() {
		this.mainMenuPanel.getButtonNewGame().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

			}
		});
	}
}
