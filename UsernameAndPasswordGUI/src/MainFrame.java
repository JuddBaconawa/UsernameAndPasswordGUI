// PACKAGES

// IMPORTS
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	public void initialize(User user) {
		/********************** Info Panel ************************/
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(new GridLayout(0, 2, 5, 5));
		infoPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
		infoPanel.add(new JLabel("Name"));
		infoPanel.add(new JLabel(user.username));
		infoPanel.add(new JLabel("Email"));
		infoPanel.add(new JLabel(user.email));
		infoPanel.add(new JLabel("Phone"));
		infoPanel.add(new JLabel(user.phone));
		infoPanel.add(new JLabel("Address"));
		infoPanel.add(new JLabel(user.address));

		add(infoPanel, BorderLayout.NORTH);

		
		setTitle("Dashboard");										// Set tile of the mainframe
		setDefaultCloseOperation(EXIT_ON_CLOSE);				// set default close operation
		setSize(1100, 650);								// set size
		setLocationRelativeTo(null);									// set relative size
		setVisible(true);															// set visible to display the GUI window


	}


}
