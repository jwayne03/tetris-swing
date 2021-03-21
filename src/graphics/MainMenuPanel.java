package graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Color;

public class MainMenuPanel extends JPanel {
	
	private JPanel contentPanel;
	private JTable table;
	
	public MainMenuPanel() {
		table = new JTable();
		table.setBackground(Color.BLACK);
		add(table);
		this.onCreate();
	}
	
	private void onCreate() {
		
	}
}
