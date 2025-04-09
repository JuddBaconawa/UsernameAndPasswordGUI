//packages


//imports
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;	//Swing form requirement
import javax.swing.JLabel;
import javax.swing.WindowConstants;



//LoginForm main class
public class LoginForm extends JFrame{
	final private Font mainFont = new Font("Segeo print", Font.BOLD, 18);


	public void initialize() {
			/*********************** Form Panel *************************************/
			JLabel lbLoginForm = new JLabel("Login Form");





			setTitle("Login Form");
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			setSize(400, 290);
			setMinimumSize(new Dimension(350, 450));
			//setResizable(false);
			setLocationRelativeTo(null);
			setVisible(true);
	}

}
