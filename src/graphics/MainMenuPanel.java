package graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
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

		String[] columns = new String[] { "Name", "SCORE", "DATE" };

		Object[][] data = new Object[][] { { "Wayne", "John", 40.0 }, { "Ivan", "Rambo", 70.0 },
				{ "Elio", "Zorro", 60.0 }, };

		JTable table = new JTable(data, columns);
		this.add(new JScrollPane(table));
		this.createButtonNewGame();
		this.createButtonEndGame();
		this.createButtonOnPauseGame();
		this.createButtonOnClickLogOut();
		this.createScoreTable();
	}
	
	private void createButtonNewGame () {
		btnNewGameButton = new JButton("New Game");
		btnNewGameButton.setVerticalAlignment(SwingConstants.BOTTOM);
		add(btnNewGameButton);
	}
	
	private void createButtonEndGame() {
		buttonOnClickEndGame = new JButton("End game");
		add(buttonOnClickEndGame);
	}
	
	private void createButtonOnPauseGame() {
		JButton buttonOnClickPause = new JButton("Pause");
		add(buttonOnClickPause);
	}
	
	private void createButtonOnClickLogOut() {
		buttonLogOutButton = new JButton("Log out");
		add(buttonLogOutButton);
	}
	
	private void createScoreTable() {
		table = new JTable();
		table.setBackground(Color.BLACK);
		add(table);
	}

	public JButton getButtonNewGame() {
		return btnNewGameButton;
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
