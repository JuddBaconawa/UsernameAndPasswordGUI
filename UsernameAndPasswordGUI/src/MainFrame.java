// PACKAGES

// IMPORTS
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	public void initialize(User user) {
		/********************** Info Panel ************************/
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(new GridLayout(0, 2, 5, 5));


		setTitle("Dashboard");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1100, 650);
		setLocationRelativeTo(null);
		setVisible(true);


	}


}
