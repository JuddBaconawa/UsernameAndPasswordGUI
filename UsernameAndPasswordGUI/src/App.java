//packages


//imports
import javax.swing.JFrame;    //imported to enable formating of the GUI
import javax.swing.JLabel;    //imported for placement of contents within a GUI window
import javax.swing.JPanel;    //uimported for the placement of label that can have text on the GUI
import javax.swing.JTextField; 

//main class - APP
public class App {

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

        JLabel label = new JLabel("User");
        label.setBounds(10, 20, 80, 15);
        panel.add(label);


        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        frame.setVisible(true); //setVisible is set true to allow the GUI to be seen when ran
        
    }
}
