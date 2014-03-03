import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class ResultList extends JList implements ListSelectionListener {
	
	private static final long serialVersionUID = 2793884482054862476L;
	
	private String[] resultDataList = new String[]{"A", "B", "C"};

	public ResultList(MainFrame mainFrame) {
		super();
		setListData(resultDataList);
		addListSelectionListener(this);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		
	}

}
