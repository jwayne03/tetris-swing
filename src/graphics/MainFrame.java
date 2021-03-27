package graphics;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Component;

public class MainFrame extends JFrame {
	
	private JPanel contentPane;
	private JSplitPane splitPane;
	private ConsolePanel consolePanel;

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
		splitPane.setEnabled(false);
		
		splitPane.setBounds(10, 11, 924, 629);
		contentPane.add(splitPane);
		
		LoginPanel loginPanel = new LoginPanel();
		loginPanel.getBtnNewButton().setLocation(382, 175);
		loginPanel.getUserPasswordField().setLocation(382, 131);
		loginPanel.getUserTextField().setLocation(382, 88);
		splitPane.setLeftComponent(null);
		splitPane.setDividerLocation(1.0);
		splitPane.setDividerSize(1);
		
		JPanel panel = new JPanel();
		panel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		splitPane.setRightComponent(panel);
		panel.setLayout(null);
		
		MainMenuPanel mainMenuPanel = new MainMenuPanel();
		mainMenuPanel.setBounds(0, 0, 635, 616);
		mainMenuPanel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel.add(mainMenuPanel);
		
		this.consolePanel = new ConsolePanel();
		consolePanel.setBounds(640, 0, 292, 640);
		panel.add(consolePanel);
		consolePanel.setLayout(null);
	}
	
	public JSplitPane getJSplitPane() {
		return splitPane;
	}

	public ConsolePanel getConsolePanel() {
		return consolePanel;
	}
}
