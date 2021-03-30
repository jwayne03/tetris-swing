package graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import model.Score;

import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

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

		Object[][] data = new Object[][] { { "Wayne", "John", 40.0 }, { "Ivan", "Rambo", 70.0 },
				{ "Elio", "Zorro", 60.0 }, };

		this.table = new JTable(data, columns);
		this.add(new JScrollPane(table));
	}
	
	private void createButtonNewGame () {
		btnNewGameButton = new JButton("New Game");
		btnNewGameButton.setVerticalAlignment(SwingConstants.BOTTOM);
		add(btnNewGameButton);
	}
	
	private void createButtonEndGame() {
		this.buttonOnClickEndGame = new JButton("End game");
		this.add(buttonOnClickEndGame);
	}
	
	private void createButtonOnPauseGame() {
		this.buttonOnClickPause = new JButton("Pause");
		this.add(buttonOnClickPause);
	}
	
	private void createButtonOnClickLogOut() {
		this.buttonLogOutButton = new JButton("Log out");
		this.add(buttonLogOutButton);
	}
	
	private void createScoreTable() {
		this.table = new JTable();
		this.table.setBackground(Color.BLACK);
		this.add(table);
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
