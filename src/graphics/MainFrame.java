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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import utils.Tetris;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.TextArea;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JSplitPane splitPane;

	public MainFrame() {
		this.onCreate();
	}

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

		splitPane.setBounds(6, 11, 1000, 720);
		contentPane.add(splitPane);
		
		splitPane.setRightComponent(new JPanel());
		splitPane.setLeftComponent(new JPanel());
	}

	public JSplitPane getJSplitPane() {
		return splitPane;
	}
	
	
	
	
}
