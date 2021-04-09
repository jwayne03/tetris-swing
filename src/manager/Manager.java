package manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import filemanagement.FileManagement;
import graphics.ConsolePanel;
import graphics.LoginPanel;
import graphics.MainFrame;
import graphics.MainMenuPanel;
import model.Player;
import model.Score;
import utils.Tetris;

public class Manager {

	private LoginPanel loginPanel;
	private MainFrame mainFrame;
	private MainMenuPanel mainMenuPanel;
	private FileManagement fileManagement;
	private ConsolePanel consolePanel;
	private Tetris tetris;

	private List<Player> userAndPassword;
	private List<Score> scores;

	private String user;
	private String score;

	public Manager() {
		this.fileManagement = new FileManagement();
		this.loginPanel = new LoginPanel();
		this.mainMenuPanel = new MainMenuPanel();
		this.userAndPassword = this.fileManagement.getUserLogin();
		this.consolePanel = new ConsolePanel();
		this.scores = this.fileManagement.getGameScore();
	}

	public void start() {
		this.loginPanel.setVisible(true);
		System.out.println(scores.toString());
		this.mainFrame = new MainFrame();
		this.setComponent();
	}

	private void setComponent() {
		this.mainFrame.getJSplitPane().setLeftComponent(loginPanel);
		this.mainFrame.getJSplitPane().setDividerLocation(1.0);
		this.actionListeners();
	}

	private void actionListeners() {
		this.consolePanel.getTextArea().append("CONSOLE: \n ");
		this.onClickLoggin();
		this.checkButtons();
	}

	private void onClickLoggin() {
		this.loginPanel.getBtnNewButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (isUsernameAndPasswordCorrect()) {

					saveScore();
					consolePanel.getTextArea().append("Correct user authentication \n");
					consolePanel.getTextArea().append("PANEL: " + user + "\n");
					mainMenuPanel.getButtonEndGame().setVisible(false);
					mainMenuPanel.getButtonOnPauseGame().setVisible(false);
					consolePanel.setVisible(true);
					mainFrame.getJSplitPane().setRightComponent(consolePanel);
					mainFrame.getJSplitPane().setLeftComponent(mainMenuPanel);
					mainFrame.getJSplitPane().setDividerLocation(700);
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
					user = player.getName();
					return true;
				} else {
					this.loginPanel.getInvalidLogin().setVisible(true);
				}
			} else {
				this.loginPanel.getInvalidLogin().setVisible(true);
			}
		}
		return false;
	}

	private void checkButtons() {
		this.mainMenuPanel.getButtonNewGame().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				consolePanel.getTextArea().append("--> NEW GAME <-- \n");
				tetris = new Tetris();
				tetris.setVisible(true);
				mainFrame.getJSplitPane().setRightComponent(tetris);
				mainFrame.getJSplitPane().setDividerLocation(700);
				isButtonNewGameVisible();
				isButtonEndGameVisible();
				mainMenuPanel.getButtonOnPauseGame().setVisible(true);

				tetris.setFocus();
				if (tetris.isPausedTheGame()) {
					tetris.start();
				}
			}
		});

		this.mainMenuPanel.getButtonLogOut().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				mainFrame.getJSplitPane().setLeftComponent(loginPanel);
				mainFrame.getJSplitPane().setRightComponent(consolePanel);
				consolePanel.setVisible(false);
				mainMenuPanel.getButtonNewGame().setVisible(true);
				tetris.setVisible(false);
			}
		});

		this.mainMenuPanel.getButtonOnPauseGame().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				consolePanel.getTextArea().append("PAUSE \n");
				tetris.pause();
			}
		});

		this.mainMenuPanel.getButtonEndGame().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				consolePanel.getTextArea().append("--> END GAME <-- \n");
				consolePanel.getTextArea().append("PANEL: " + user + "\n");
				tetris.setVisible(false);
				isButtonNewGameVisible();
				isButtonEndGameVisible();
				mainFrame.getJSplitPane().setRightComponent(consolePanel);
				mainFrame.getJSplitPane().setLeftComponent(mainMenuPanel);
				mainFrame.getJSplitPane().setDividerLocation(700);
				tetris.pause();
				setPlayerScore();
				saveScore();
			}
		});
	}

	private void saveScore() {
		DefaultTableModel defaultTableModel = (DefaultTableModel) this.mainMenuPanel.getTable().getModel();
		defaultTableModel.getDataVector().clear();
		for (Score score : scores) {
			defaultTableModel.addRow(new Object[] { score.getPlayer(), score.getScore(), score.getDate() });
		}
	}

	private void setPlayerScore() {
		this.tetris.getStatusbar().getText();
		System.out.println(user + " " + this.tetris.getStatusbar().getText());
		this.score = String.valueOf(this.tetris.getPuntos());
		Score score = new Score(this.user, this.score, new Date());
		this.scores.add(score);
		this.fileManagement.saveScoreData(scores);
	}

	private boolean isButtonEndGameVisible() {
		if (this.mainMenuPanel.getButtonEndGame().isVisible()) {
			this.mainMenuPanel.getButtonEndGame().setVisible(false);
			return true;
		} else {
			this.mainMenuPanel.getButtonEndGame().setVisible(true);
			return false;
		}
	}

	private boolean isButtonNewGameVisible() {
		if (this.mainMenuPanel.getButtonNewGame().isVisible()) {
			this.mainMenuPanel.getButtonNewGame().setVisible(false);
			return true;
		} else {
			this.mainMenuPanel.getButtonNewGame().setVisible(true);
			return false;
		}
	}
}
