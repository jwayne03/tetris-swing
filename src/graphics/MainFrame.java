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

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JSplitPane splitPane;
	private ConsolePanel consolePanel;
	private JPanel panel;

	public MainFrame() {
		this.onCreate();
	}

	private void onCreate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Tetris");
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
		this.createLoginPanel();

		this.panel = new JPanel();
		panel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		splitPane.setRightComponent(panel);
		panel.setLayout(null);

		this.createMainPanel();
		this.createTetrisPanel();
		this.createConsolePanel();

	}

	private void createMainPanel() {
		MainMenuPanel mainMenuPanel = new MainMenuPanel();
		mainMenuPanel.getButtonLogOut().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mainMenuPanel.getButtonOnPauseGame().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mainMenuPanel.getButtonEndGame().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mainMenuPanel.getButtonNewGame().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mainMenuPanel.getButtonNewGame().setHorizontalTextPosition(SwingConstants.LEFT);
		mainMenuPanel.getButtonNewGame().setHorizontalAlignment(SwingConstants.LEFT);
		mainMenuPanel.setBounds(0, 0, 459, 616);
		mainMenuPanel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel.add(mainMenuPanel);
	}

	private void createTetrisPanel() {
	}

	private void createConsolePanel() {

		Tetris tetris = new Tetris();
		tetris.setBounds(524, 0, 408, 625);
		panel.add(tetris);
		tetris.setLayout(null);
		this.consolePanel = new ConsolePanel();
		consolePanel.setBounds(524, 0, 389, 619);
		panel.add(consolePanel);
		consolePanel.setLayout(null);
	}

	private void createLoginPanel() {
		LoginPanel loginPanel = new LoginPanel();
		loginPanel.getBtnNewButton().setLocation(382, 175);
		loginPanel.getUserPasswordField().setLocation(382, 131);
		loginPanel.getUserTextField().setLocation(382, 88);
		splitPane.setLeftComponent(null);
		splitPane.setDividerLocation(1.0);
		splitPane.setDividerSize(1);
	}

	public JSplitPane getJSplitPane() {
		return this.splitPane;
	}

	public ConsolePanel getConsolePanel() {
		return this.consolePanel;
	}
}
