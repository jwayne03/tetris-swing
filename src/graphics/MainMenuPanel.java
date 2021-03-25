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
	
	public MainMenuPanel() {
		setBounds(0, 0, 500, 500); 
		
        String[] columns = new String[] {
            "Name", "SCORE", "DATE"
        };

        Object[][] data = new Object[][] {
            {"Wayne", "John", 40.0},
            {"Ivan", "Rambo", 70.0},
            {"Elio", "Zorro", 60.0 },
        };
        
        JButton btnNewButton = new JButton("New button");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
        add(btnNewButton);

        JTable table = new JTable(data, columns);
        this.add(new JScrollPane(table));
		table = new JTable();
		table.setBackground(Color.BLACK);
		add(table);
		this.onCreate();
	}
	
	private void onCreate() {
		
	}
}
  