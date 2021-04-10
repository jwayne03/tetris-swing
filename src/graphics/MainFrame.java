package graphics;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;

/**
 * @author alu2017243
 *
 */
public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JSplitPane splitPane;

	/**
	 * Constructor that calls a method to create the interface of the mainframe
	 * 
	 */
	public MainFrame() {
		this.onCreate();
	}

	/**
	 * Method to create the interface
	 */
	private void onCreate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Tetris");
		setBounds(100, 100, 1000, 720);
		setVisible(true);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		splitPane = new JSplitPane();

		splitPane.setBounds(6, 11, 1000, 675);
		contentPane.add(splitPane);

		splitPane.setRightComponent(new JPanel());
		splitPane.setLeftComponent(new JPanel());
	}

	/**
	 * This JSplitPane it uses to split a panel into two panels. Uses specially to
	 * the consolePanel or Tetris
	 * 
	 * @return JSplitPane
	 */
	public JSplitPane getJSplitPane() {
		return splitPane;
	}
}
