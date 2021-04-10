package graphics;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.TextArea;

public class ConsolePanel extends JPanel {

	private TextArea textArea;

	/**
	 * This constructor creates the layout of the console panel that contains a
	 * TextArea to show what is doing the user
	 * 
	 */
	public ConsolePanel() {
		setBackground(Color.BLACK);
		setLayout(null);

		textArea = new TextArea();
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.BLACK);
		textArea.setBounds(0, 0, 314, 680);
		textArea.setEditable(false);
		add(textArea);
		this.onCreate();
	}

	private void onCreate() {
		setBounds(0, 0, 314, 680);
	}

	/**
	 * getter to get the text area
	 * 
	 * @return TextArea
	 */
	public TextArea getTextArea() {
		return this.textArea;
	}
}
