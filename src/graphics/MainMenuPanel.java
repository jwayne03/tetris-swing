package graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class MainMenuPanel extends JPanel {
	
	private JPanel contentPanel;
	private JTable table;
	
	public MainMenuPanel() {
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.CENTER);
		add(btnNewButton);
		table = new JTable();
		table.setBackground(Color.BLACK);
		add(table);
		this.onCreate();
	}
	
	private void onCreate() {
		
	}
}
