import java.awt.Container;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class QueryPanel extends JPanel {

	private static final long serialVersionUID = 4108470658573714347L;
	
	private JLabel titleLabel;

	public QueryPanel(MainFrame mainFrame) {
		super();
		titleLabel = new JLabel("Query Here");add(titleLabel);
		
	}

}
