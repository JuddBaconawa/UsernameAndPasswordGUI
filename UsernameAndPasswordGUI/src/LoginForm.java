//packages


//imports
//to customize GUI as for toolkit
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;			//for username field to be used
import javax.swing.JLabel;	//for//for password field to be used
import javax.swing.JPanel;
import javax.swing.JPasswordField;	//Swing form requirement
import javax.swing.JTextField;
import javax.swing.WindowConstants;



//LoginForm main class
public class LoginForm extends JFrame{
	//global variables are declared here
	final private Font mainFont = new Font("Segeo print", Font.BOLD, 18);

	//required to be declared here to check for credentials
	JTextField usernameInput;
	JPasswordField userPasswordInpute;

	public void initialize() {
			/*********************** Form Panel *************************************/

			//displays to the user if they are logging in or creating an account
			JLabel loginLabel = new JLabel("Login Form");
			loginLabel.setFont(mainFont);
			loginLabel.setBounds(25, 25, 75, 25);

			JLabel usernameLabel = new JLabel("Username");
			usernameLabel.setFont(mainFont);
			usernameLabel.setBounds(25, 150, 75 ,25);
			usernameLabel.setVisible(true);

			JTextField usernameInput = new JTextField("Enter Username");
			usernameLabel.setFont(mainFont);
			usernameLabel.setBounds(200, 150, 75 ,25);
			usernameLabel.setVisible(true);

			JLabel passwordLabel = new JLabel("Password");
			passwordLabel.setFont(mainFont);
			usernameLabel.setBounds(25, 200, 75 ,25);
			usernameLabel.setVisible(true);

			JPasswordField passwordInput = new JPasswordField("Enter password");
			passwordInput.setFont(mainFont);
			passwordInput.setBounds(200, 200, 75, 25);
			passwordInput.setVisible(true);

			JPanel formPanel = new JPanel();
			formPanel.setLayout(new GridLayout(0, 1, 10, 10));
			formPanel.add(loginLabel);
			formPanel.add(usernameLabel);
			formPanel.add(usernameInput);
			formPanel.add(passwordLabel);
			formPanel.add(passwordInput);

			/************************** Button Panel ********************************/

			

			




			/************************** Initialize the Frame ********************************/

			setTitle("Login Form");
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			setSize(400, 500);
			setMinimumSize(new Dimension(350, 450));
			//setResizable(false);
			setLocationRelativeTo(null);
			setVisible(true);
	}

}
