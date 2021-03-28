package manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import filemanagement.FileManagement;
import graphics.ConsolePanel;
import graphics.LoginPanel;
import graphics.MainFrame;
import graphics.MainMenuPanel;
import graphics.TetrisPanel;
import model.Player;

public class Manager {

	private LoginPanel loginPanel;
	private MainFrame mainFrame;
	private MainMenuPanel mainMenuPanel;
	private FileManagement fileManagement;
	private ConsolePanel consolePanel;
	private TetrisPanel tetrisPanel;

	private List<Player> userAndPassword;

	public Manager() {
		this.fileManagement = new FileManagement();
		this.loginPanel = new LoginPanel();
		this.mainMenuPanel = new MainMenuPanel();
		this.userAndPassword = this.fileManagement.getUserLogin();
		this.consolePanel = new ConsolePanel();
		this.tetrisPanel = new TetrisPanel();
	}

	public void start() {
		this.loginPanel.setVisible(true);
		this.mainFrame = new MainFrame();
		this.setComponent();
	}

	private void setComponent() {
		this.mainFrame.getJSplitPane().setLeftComponent(loginPanel);
		this.onClickLoggin();
		this.onClickLogOut();
		this.onClickNewGame();
	}

	private void onClickLoggin() {
		this.loginPanel.getBtnNewButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (isUsernameAndPasswordCorrect()) {
					mainFrame.getJSplitPane().setRightComponent(consolePanel);
					mainFrame.getJSplitPane().setLeftComponent(mainMenuPanel);
				}
			}
		});
	}

	@SuppressWarnings("deprecation")
	private boolean isUsernameAndPasswordCorrect() {
		for (Player player : userAndPassword) {
			if (player.getName().equals(loginPanel.getUserTextField().getText())) {
				if (player.getPassword().equals(loginPanel.getUserPasswordField().getText())) {
					System.out.println(player.getName() + " " + player.getPassword());
					System.out.println(loginPanel.getUserTextField().getText() + " "
							+ loginPanel.getUserPasswordField().getText());
					return true;
				} else {
					System.out.println("ERROR");
					this.loginPanel.getInvalidLogin().setVisible(true);
					return false;
				}
			} else {
				this.loginPanel.getInvalidLogin().setVisible(true);
				return false;
			}
		}
		return false;
	}

	private void onClickNewGame() {
		this.mainMenuPanel.getButtonNewGame().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				consolePanel.setFocusable(false);
				tetrisPanel.setFocusable(true);
			}
		});
	}

	private void onClickLogOut() {
		this.mainMenuPanel.getButtonLogOut().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				mainFrame.getJSplitPane().setLeftComponent(loginPanel);
			}
		});
	}
}
