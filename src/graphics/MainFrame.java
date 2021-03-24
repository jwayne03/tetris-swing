package graphics;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;

public class MainFrame extends JFrame {
	
	private JPanel contentPane;

	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("LOGIN");
		setBounds(100, 100, 700, 500);
		setVisible(true);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSplitPane splitPane = new JSplitPane();
		
		splitPane.setBounds(5, 5, 690, 461);
		contentPane.add(splitPane);
		
		LoginPanel loginPanel = new LoginPanel();
		splitPane.setLeftComponent(loginPanel);
	}	
}
