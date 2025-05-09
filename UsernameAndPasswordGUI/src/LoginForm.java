// IMPORTS
// To customize GUI as for toolkit
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// MySQL connection with VS Code
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


// To GUI formatting and visual changes
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;



public class LoginForm extends JFrame {

    // Set Global for credential check
    private final JTextField usernameInput;
    private final JPasswordField passwordInput;

    public LoginForm() {
        // Initialize the username and password fields
        this.usernameInput = new JTextField();
        this.passwordInput = new JPasswordField();
    }

    // method to start LoginForm
    public void initialize() {
        /************************** Form Panel ***********************************/


        /************** Labels and Inputs **************************/
        // displays for the user if they are in the login form
        JLabel loginLabel = new JLabel("Login to Clock In", SwingConstants.CENTER);
        JLabel usernameLabel = new JLabel("Username");
        JLabel passwordLabel = new JLabel("Password");

        JTextField usernameInput = new JTextField();
        JPasswordField passwordInput = new JPasswordField();

        /******************** Form Panel (Labels and Input) ****************************/
        // Creates the panel, sets the grid layout, and then adds all the fields into the panel
        JPanel formPanel = new JPanel(new GridLayout(0, 1, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));

        formPanel.add(loginLabel);
        formPanel.add(usernameLabel);
        formPanel.add(usernameInput);
        formPanel.add(passwordLabel);
        formPanel.add(passwordInput);

        /**************************** Button Panel **************************/

        JButton loginButton = new JButton("Login");

        loginButton.addActionListener(new ActionListener() {

            // Action when the user click the "login button"
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameInput.getText();
                String password = String.valueOf(passwordInput.getPassword());

                User user = getAuthenticatedUser(username, password);
                
                // Of credential is NOT null
                if (user != null) {
                    // Action performed
                    MainFrame mainFrame = new MainFrame();
                    mainFrame.initialize(user);
                    // Deletes/stops the program
                    dispose();
                } else {
                    // other Error results
                    JOptionPane.showMessageDialog(LoginForm.this, "Email or password Invalid", "Try Again", JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        JButton cancelButton = new JButton("Cancel");

        cancelButton.addActionListener( new ActionListener() {
           
            // Action when the user click the "cancel button"
            @Override
            public void actionPerformed(ActionEvent e) {
                // Uses dispose to close/ release all data
                dispose();
            }

        });

        /************************** Button Panel Settings *****************************/
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 10, 0));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
        buttonPanel.add(loginButton);
        buttonPanel.add(cancelButton);



        /***************** Initialize the Frame + final frame settings ****************/
        // Sets the layout of the frame
        setLayout(new BorderLayout());
        add(loginLabel, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        
        setTitle("Login Form");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(800, 600);
        setMinimumSize(new Dimension(350, 450));
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    // User authenticator method - connects using JDBC which implements prepared SQL statements to access MySQL
    private User getAuthenticatedUser(String usernameInput, String passwordInput) {
        
        // Sets the User empty or null to be ready for a user
        User user = null;

        final String DB_URL = "jdbc:mysql://localhost:3306/mystore";            // Databse Address
        final String USERNAME = "root";
        final String PASSWORD = "#MCMXCii1301!";

        try {

            // Loads MySQL using Java database connection driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connection to the database
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            // SQL statement to pull out the credentils off a list of files
            String sql = "SELECT * FROM users WHERE username=? AND password=?";

            // PreparedStatement to prevent random SQL Injection attacks
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, usernameInput);
            preparedStatement.setString(2, passwordInput);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

					user = new User();
					user.userId = resultSet.getInt("userId");
					user.username = resultSet.getString("username");
					user.email = resultSet.getString("email");
					user.phone = resultSet.getString("phone");
					user.address = resultSet.getString("address");
					user.password = resultSet.getString("password");
            }

            preparedStatement.close();
            conn.close();
            
        } catch (Exception e) {
            System.err.println("Database connection failed!" + e.getLocalizedMessage());
        }

        return user;
    }

}
