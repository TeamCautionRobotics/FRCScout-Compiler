import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class DetailPanel extends JPanel {
	
	private static final long serialVersionUID = 1542798734160584916L;
	
	private JLabel titleLabel;

	public DetailPanel(MainFrame mainFrame) {
		super();
		titleLabel = new JLabel("Title Here");add(titleLabel);
	}

}
