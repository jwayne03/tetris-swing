package graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Label;

public class LoginPanel extends JPanel {

	private JTextField textField;
	private JLabel textLoggin;
	private JPasswordField passwordField;
	private MainMenuPanel mainMenuPanel;

	public LoginPanel() {
		this.onCreateLoginFrame();
		this.mainMenuPanel = new MainMenuPanel();
	}
	
	private void onCreateLoginFrame() {
		setLayout(null);
		setBounds(0, 0, 700, 700);

		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNewButton.setBounds(249, 181, 173, 39);
		add(btnNewButton);

		textField = new JTextField();
		textField.setBounds(249, 94, 173, 33);
		add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(249, 137, 173, 33);
		add(passwordField);

		textLoggin = new JLabel();
		textLoggin.setBounds(249, 230, 173, 33);
		add(textLoggin);
		
		Label usernameLabel = new Label("Username: ");
		usernameLabel.setBounds(142, 105, 101, 22);
		add(usernameLabel);
		
		Label passwordLabel = new Label("Password: ");
		passwordLabel.setBounds(142, 148, 101, 22);
		add(passwordLabel);
	}
}