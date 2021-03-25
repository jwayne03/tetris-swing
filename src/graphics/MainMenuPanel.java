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

	public MainMenuPanel() {
		this.onCreate();
	}

	private void onCreate() {
		setBounds(0, 0, 503, 544);

		String[] columns = new String[] { "Name", "SCORE", "DATE" };

		Object[][] data = new Object[][] { { "Wayne", "John", 40.0 }, { "Ivan", "Rambo", 70.0 },
				{ "Elio", "Zorro", 60.0 }, };

		JTable table = new JTable(data, columns);
		this.add(new JScrollPane(table));

		btnNewGameButton = new JButton("New button");
		btnNewGameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnNewGameButton.setVerticalAlignment(SwingConstants.BOTTOM);
		add(btnNewGameButton);
		table = new JTable();
		table.setBackground(Color.BLACK);
		add(table);
	}

	public JButton getButtonNewGame() {
		return btnNewGameButton;
	}
}
