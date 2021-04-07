package graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Label;
import java.awt.Color;

public class LoginPanel extends JPanel {

	private JTextField userTextField;
	private JLabel textLoggin;
	private JPasswordField userPasswordField;
	private MainMenuPanel mainMenuPanel;
	private JButton btnNewButton;
	private JDialog showErrorLogin;
	private JButton clickButton;

	public LoginPanel() {
		setBackground(Color.CYAN);
		this.onCreateLoginFrame();
		this.mainMenuPanel = new MainMenuPanel();
	}

	private void onCreateLoginFrame() {
		setLayout(null);
		setBounds(0, 0, 1058, 680);
		btnNewButton = new JButton("LOGIN");
		this.showErrorLogin = new JDialog();

		btnNewButton.setBounds(524, 178, 173, 33);
		add(btnNewButton);

		this.userAndPasswordTextField();

		textLoggin = new JLabel();
		textLoggin.setBounds(249, 230, 173, 33);
		add(textLoggin);

		this.userAndPasswordLabel();

	}

	private void userAndPasswordLabel() {
		Label usernameLabel = new Label("Username: ");
		usernameLabel.setBounds(373, 93, 109, 27);
		add(usernameLabel);

		Label passwordLabel = new Label("Password: ");
		passwordLabel.setBounds(373, 142, 101, 22);
		add(passwordLabel);
	}

	private void userAndPasswordTextField() {
		userTextField = new JTextField();
		userTextField.setBounds(524, 87, 173, 33);
		add(userTextField);
		userTextField.setColumns(10);

		userPasswordField = new JPasswordField();
		userPasswordField.setBounds(524, 131, 173, 33);
		add(userPasswordField);
	}

	public JButton getBtnNewButton() {
		return this.btnNewButton;
	}

	public JTextField getUserTextField() {
		return this.userTextField;
	}

	public JPasswordField getUserPasswordField() {
		return this.userPasswordField;
	}

	public JDialog getInvalidLogin() {
		JLabel showUsernameOrPasswordIncorrect = new JLabel("Username or password incorrect");
		JPanel showUserPassPanel = new JPanel();
		showUserPassPanel.add(showUsernameOrPasswordIncorrect);
		this.showErrorLogin.getContentPane().add(showUserPassPanel);
		this.showErrorLogin.setSize(240, 130);
		this.showErrorLogin.setVisible(true);
		this.showErrorLogin.setResizable(false);
		return this.showErrorLogin;
	}
}
