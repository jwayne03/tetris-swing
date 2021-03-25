package graphics;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;

public class MainFrame extends JFrame {
	
	private JPanel contentPane;
	private JSplitPane splitPane;

	public MainFrame() {
		this.onCreate();
	}	
	
	private void onCreate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("LOGIN");
		setBounds(100, 100, 950, 680);
		setVisible(true);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		splitPane = new JSplitPane();
		
		splitPane.setBounds(10, 11, 945, 577);
		contentPane.add(splitPane);
		
		LoginPanel loginPanel = new LoginPanel();
		loginPanel.getBtnNewButton().setLocation(382, 175);
		loginPanel.getUserPasswordField().setLocation(382, 131);
		loginPanel.getUserTextField().setLocation(382, 88);
		splitPane.setLeftComponent(loginPanel);
		
		MainMenuPanel mainMenuPanel = new MainMenuPanel();
		splitPane.setRightComponent(mainMenuPanel);
		
		ConsolePanel consolePanel = new ConsolePanel();
		mainMenuPanel.add(consolePanel);
		
		splitPane.setEnabled(false);
		splitPane.setDividerLocation(1.0);
		splitPane.setDividerSize(1);
	}
	
	public JSplitPane getJSplitPane() {
		return splitPane;
	}
}
