import javax.swing.JLabel;
import javax.swing.JPanel;

public class DetailPanel extends JPanel {

	private static final long serialVersionUID = 1542798734160584916L;

	private JLabel titleLabel;

	public JLabel queryLabel;

	public DetailPanel(MainFrame mainFrame) {
		super();
		titleLabel = new JLabel("Team Number:");
		add(titleLabel);
		queryLabel = new JLabel();
		add(queryLabel);
	}

}
