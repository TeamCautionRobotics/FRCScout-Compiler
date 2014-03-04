import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridBagLayoutInfo;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 2269971701250845501L;


	public static void main(String[] args){
		new MainFrame(args);
	}


	private String[] resultDataList = new String[]{"1", "2", "3", "4", "5", "6"};
	private JList resultList;
	private QueryPanel queryPanel;
	public static DetailPanel detailPanel;

	
	public MainFrame(String[] args) {
		
		setVisible(true);
	    setTitle("FRC Scout Compiler");
		setSize(0, 0);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.weightx = .5;
		c.weighty = .5;
		
		resultList = new ResultList(this);
		c.gridx = 0;
		c.gridy = 0;
		JScrollPane listScrollPane = new JScrollPane(resultList);
		mainPanel.add(listScrollPane, c);

		queryPanel = new QueryPanel(this);
		c.gridx = 0;
		c.gridy = 1;
		c.weighty = 1;
		mainPanel.add(queryPanel, c);

		detailPanel = new DetailPanel(this);
		c.gridx = 1;
		c.gridy = 0;
		c.weighty = 1;
		c.gridheight = 2;
		mainPanel.add(detailPanel, c);
		
		
		this.add(mainPanel);

		setSize(400, 200);
	}
}