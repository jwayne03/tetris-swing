package graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import model.Score;

import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

public class MainMenuPanel extends JPanel {

	private JPanel contentPanel;
	private JTable table;
	private JButton btnNewGameButton;
	private JButton buttonLogOutButton;
	private JButton buttonOnClickEndGame;
	private JButton buttonOnClickPause;

	public MainMenuPanel() {
		this.onCreate();
	}

	private void onCreate() {
		setBounds(0, 0, 497, 541);

		this.setDataIntoScoreBoard();
		this.createButtonNewGame();
		this.createButtonEndGame();
		this.createButtonOnPauseGame();
		this.createButtonOnClickLogOut();
		this.createScoreTable();
	}

	public void setDataIntoScoreBoard() {
		String[] columns = new String[] { "Name", "SCORE", "DATE" };

		setLayout(null);

		this.table = new JTable();
		this.table.setModel(new DefaultTableModel(new String[][] {}, columns));
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(21, 5, 454, 420);
		this.add(scrollPane);
	}

	private void createButtonNewGame() {
		btnNewGameButton = new JButton("New Game");
		btnNewGameButton.setBounds(46, 457, 110, 29);
		btnNewGameButton.setFocusable(false);
		add(btnNewGameButton);
	}

	private void createButtonEndGame() {
		this.buttonOnClickEndGame = new JButton("End game");
		buttonOnClickEndGame.setBounds(165, 457, 105, 29);
		buttonOnClickEndGame.setFocusable(false);
		this.add(buttonOnClickEndGame);
	}

	private void createButtonOnPauseGame() {
		this.buttonOnClickPause = new JButton("Pause");
		buttonOnClickPause.setBounds(279, 457, 80, 29);
		buttonOnClickPause.setFocusable(false);
		this.add(buttonOnClickPause);
	}

	private void createButtonOnClickLogOut() {
		this.buttonLogOutButton = new JButton("Log out");
		buttonLogOutButton.setBounds(370, 457, 92, 29);
		buttonLogOutButton.setFocusable(false);
		this.add(buttonLogOutButton);
	}

	private void createScoreTable() {
	}

	public JTable getTable() {
		return table;
	}

	public JButton getButtonNewGame() {
		return this.btnNewGameButton;
	}

	public JButton getButtonLogOut() {
		return this.buttonLogOutButton;
	}

	public JButton getButtonEndGame() {
		return this.buttonOnClickEndGame;
	}

	public JButton getButtonOnPauseGame() {
		return this.buttonOnClickPause;
	}
}
