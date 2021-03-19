package graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MainFrame extends JFrame {
	
	private JPanel contentPanel;
	private JTextField textFieldUsernameField;
	private JPasswordField passwordField;
	
	public MainFrame() {
		this.onCreate();
	}
	
	private void onCreate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 350);
		setResizable(false);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanel);
		contentPanel.setLayout(null);
		this.createTextField();
	}
	
	private void createTextField() {
		textFieldUsernameField = new JTextField();
		textFieldUsernameField.setBounds(231, 122, 108, 20);
		contentPanel.add(textFieldUsernameField);
		textFieldUsernameField.setColumns(10);
		this.createLoginButton();
	}
	
	private void createLoginButton() {
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNewButton.setBounds(231, 203, 108, 20);
		contentPanel.add(btnNewButton);
		this.createPasswordField();
	}
	
	private void createPasswordField() {
		passwordField = new JPasswordField();
		passwordField.setBounds(231, 153, 108, 20);
		contentPanel.add(passwordField);
		this.createLabel();
	}
	
	private void createLabel() {
		JLabel loginLabel = new JLabel("LOGIN");
		loginLabel.setBounds(269, 94, 36, 17);
		contentPanel.add(loginLabel);
		
		JLabel usernameLabel = new JLabel("Username: ");
		usernameLabel.setBounds(159, 124, 62, 17);
		contentPanel.add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(162, 151, 69, 25);
		contentPanel.add(passwordLabel);
	}
	
	
}
