//packages


//imports
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;     //login button implemented - m
import javax.swing.JLabel;      //imported to enable formating of the GUI
import javax.swing.JPanel;      //imported for placement of contents within a GUI window
import javax.swing.JPasswordField;      //uimported for the placement of label that can have text on the GUI
import javax.swing.JTextField;

//main class - APP
public class App implements ActionListener{

    //made private (encapsulation) to limit access within the main + made static so that it
    // can be access within the main method.
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton login;
    private static JLabel success;


    //main method - everything is excecuted 
    public static void main(String[] args) throws Exception {

        //JPanel is used to change the layout of the GUI
        JPanel panel = new JPanel();
        //JFrame is used to create the GUI window
        JFrame frame = new JFrame();
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        //username label
        userLabel = new JLabel("Username");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        //username input box
        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        //password label
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        //pasword input box
        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165,25);
        panel.add(passwordText);

        //button created for "login"
        login = new JButton("Login");
        login.setBounds(75, 90, 150, 25);
        login.addActionListener(new App());
        panel.add(login);

        //for successfull log in - message displays on the GUI
        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);
         

        frame.setVisible(true); //setVisible is set true to allow the GUI to be seen when ran
        
    }

    //activates when the "login" button is clicked by the user
    @Override
    public void actionPerformed(ActionEvent e) {
        // Activates the code bellow when the button is clicked - shows on command line
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + ", " + password);

        //checks on both the username and password
        if(user.equals("admin") && password.equals("password01")) {
            success.setText("Login Successful!");   //displays succesful loggedin message
        }
    }
}
