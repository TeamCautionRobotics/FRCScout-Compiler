import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ResultList extends JList implements ListSelectionListener {

	private static final long serialVersionUID = 2793884482054862476L;

	private String[] resultDataList = new String[] {"1492", "842", "3617"};

	public ResultList(MainFrame mainFrame) {
		super();
		setListData(resultDataList);
		addListSelectionListener(this);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		System.out.println(this.getSelectedIndex());
		MainFrame.detailPanel.queryLabel.setText(resultDataList[this
				.getSelectedIndex()]);
	}

}
