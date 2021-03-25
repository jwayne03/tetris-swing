package graphics;

import javax.swing.JPanel;
import java.awt.Color;

public class ConsolePanel extends JPanel {

	public ConsolePanel() {
		setBackground(Color.BLACK);
		this.onCreate();
	}
	
	private void onCreate() {
		setLayout(null);
		setBounds(0, 0, 314, 680); 
	}
}
