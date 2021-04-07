package graphics;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.TextArea;

public class ConsolePanel extends JPanel {

	private TextArea textArea;

	public ConsolePanel() {
		setBackground(Color.BLACK);
		setLayout(null);

		textArea = new TextArea();
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.BLACK);
		textArea.setBounds(0, 0, 314, 680);
		add(textArea);
		this.onCreate();
	}

	private void onCreate() {
		setBounds(0, 0, 314, 680);
	}

	public TextArea getTextArea() {
		return this.textArea;
	}
}
