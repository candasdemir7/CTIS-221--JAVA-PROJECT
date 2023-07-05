package GUI;

import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.CarsSys;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class SearchCarsFrame extends JFrame {

	private JPanel contentPane;
	private JTextField idInput;

	/**
	 * Launch the application.
	 */
	CarsFrame cars=null;
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchGameFrame frame = new SearchGameFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public SearchCarsFrame(CarsFrame c) {
		cars=c;
		
		setTitle("Search Cars\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 94, 367, 246);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		idInput = new JTextField();
		idInput.setBounds(244, 63, 76, 19);
		contentPane.add(idInput);
		idInput.setColumns(10);
		
		JLabel carsIdLabel = new JLabel("Enter Cars ID:");
		carsIdLabel.setBounds(142, 69, 102, 13);
		contentPane.add(carsIdLabel);
		
		JButton searchButton = new JButton("Search");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(idInput.getText().equalsIgnoreCase(""))
				{
					textArea.setText("Please, enter an ID");
				}else 
				{	
					if(CarsSys.searchCars(Integer.parseInt(idInput.getText()))==null)
						textArea.setText("Cars CAN NOT found");
					else
					{
						textArea.setText(CarsSys.searchCars(Integer.parseInt(idInput.getText())).toString());
					}
				}
				
			}
		});
		searchButton.setBounds(417, 226, 96, 21);
		contentPane.add(searchButton);
		
		JButton doneBtn = new JButton("Done");
		doneBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cars.setVisible(true);
				dispose();
			}
		});
		doneBtn.setBounds(417, 263, 96, 21);
		contentPane.add(doneBtn);
		
		JButton calculateTaxButton = new JButton("Calculate Tax");
		calculateTaxButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(idInput.getText().equalsIgnoreCase(""))
					textArea.setText("Please enter an ID!!");
				else {
					//bu kısım önemli
					String output=String.valueOf(CarsSys.displayTax(Integer.parseInt(idInput.getText())));
					textArea.setText("Tax of the car is calculated!!\nCar's tax is: "+output);
				}
		
			}
		});
		calculateTaxButton.setBounds(417, 296, 96, 21);
		contentPane.add(calculateTaxButton);
		
		
		

	}
}
