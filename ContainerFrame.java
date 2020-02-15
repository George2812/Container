import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ContainerFrame extends JFrame {

	private JTextField codeField;
	private JTextField destinationField;
	private JTextField weightField;
	private JTextField powerField;
	private JButton createBulkButton;
	private JButton createRefridgeratorButton;
	private JList shipList;
	private JPanel containerPanel;
	private JPanel centralPanel;
	
	
	
	
	public ContainerFrame() {
		
		codeField=new JTextField("Code");
		destinationField=new JTextField("Destination");
		weightField=new JTextField("Weight");
		powerField=new JTextField("Power");
		createBulkButton=new JButton("Create Bulk");
		createRefridgeratorButton=new JButton("Create Refridgerator");
		shipList=new JList();
		containerPanel=new JPanel();
		centralPanel=new JPanel();
		
		GridLayout grid=new GridLayout(3,2);
		containerPanel.setLayout(grid);
		
		containerPanel.add(codeField);
		containerPanel.add(destinationField);
		containerPanel.add(weightField);
		containerPanel.add(powerField);
		containerPanel.add(createBulkButton);
		containerPanel.add(createRefridgeratorButton);
		
		BorderLayout border=new BorderLayout();
		centralPanel.setLayout(border);
		
		centralPanel.add(shipList,BorderLayout.NORTH);
		centralPanel.add(containerPanel,BorderLayout.CENTER);
		
		DefaultListModel model=new DefaultListModel();
		
		model.addElement("Alpha");
		model.addElement("Beta");
		model.addElement("Theta");
		
		shipList.setModel(model);
		
		
		
		this.setContentPane(centralPanel);
		
		
		this.setVisible(true);
		this.setTitle("Container Frame");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	
}
