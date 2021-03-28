package graphics;

import java.awt.Color;

import javax.swing.JPanel;

public class TetrisPanel extends JPanel {

	public TetrisPanel() {
		this.onCreate();
	}
	
	private void onCreate() {
		setBackground(Color.DARK_GRAY);
		setBounds(0, 0, 314, 680);
	}
}
