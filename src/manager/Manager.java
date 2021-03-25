package manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import graphics.LoginPanel;
import graphics.MainFrame;
import graphics.MainMenuPanel;

public class Manager {

	private LoginPanel loginPanel;
	private MainFrame mainPanel;
	private MainMenuPanel mainMenuPanel;

	public Manager() {
		this.loginPanel = new LoginPanel();
		this.mainMenuPanel = new MainMenuPanel();
	}

	public void start() {
		this.loginPanel.setVisible(true);
		this.mainPanel = new MainFrame();
	}

	private void onClickLoggin() {
		this.loginPanel.getBtnNewButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

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
