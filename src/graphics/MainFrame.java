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
	private ConsolePanel consolePanel;
	private JPanel panel;
	private Tetris tetris;

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
		splitPane.setEnabled(false);

		splitPane.setBounds(6, 11, 1204, 652);
		contentPane.add(splitPane);
		this.createLoginPanel();

		this.panel = new JPanel();
		panel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		splitPane.setRightComponent(panel);
		panel.setLayout(null);

		this.createMainPanel();
		this.createConsolePanel();

	}

	private void createMainPanel() {
		MainMenuPanel mainMenuPanel = new MainMenuPanel();
		mainMenuPanel.getButtonNewGame().setVerticalAlignment(SwingConstants.CENTER);
		mainMenuPanel.getButtonLogOut().setBounds(304, 471, 92, 29);
		mainMenuPanel.getButtonOnPauseGame().setBounds(304, 430, 80, 29);
		mainMenuPanel.getButtonEndGame().setBounds(194, 430, 105, 29);
		mainMenuPanel.getButtonNewGame().setBounds(189, 471, 110, 29);
		mainMenuPanel.getButtonLogOut().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mainMenuPanel.getButtonOnPauseGame().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mainMenuPanel.getButtonEndGame().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mainMenuPanel.getButtonNewGame().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mainMenuPanel.getButtonNewGame().setHorizontalTextPosition(SwingConstants.CENTER);
		mainMenuPanel.setBounds(0, 0, 586, 616);
		mainMenuPanel.setPreferredSize(new Dimension(565, 616));
		mainMenuPanel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel.add(mainMenuPanel);
		mainMenuPanel.add(mainMenuPanel.getButtonNewGame());
		mainMenuPanel.add(mainMenuPanel.getButtonEndGame());
		mainMenuPanel.add(mainMenuPanel.getButtonOnPauseGame());
		mainMenuPanel.add(mainMenuPanel.getButtonLogOut());
		mainMenuPanel.setLayout(null);
	}

	private void createConsolePanel() {
		tetris = new Tetris();
		tetris.setBounds(590, 0, 318, 616);
		panel.add(tetris);
		tetris.setLayout(null);
		this.consolePanel = new ConsolePanel();
		consolePanel.getTextArea().setBounds(0, 0, 307, 680);
		consolePanel.setBounds(598, 0, 392, 616);
		consolePanel.setPreferredSize(new Dimension(565, 616));
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

	public JPanel getPanel() {
		return this.panel;
	}

}
