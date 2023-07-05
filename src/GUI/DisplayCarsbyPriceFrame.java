package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.CarsSys;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class DisplayCarsbyPriceFrame extends JFrame {

	private JPanel contentPane;
	private JTextField minprice;
	private JTextField maxprice;

	/**
	 * Launch the application.
	 */
	CarsFrame cars=null;

	/**
	 * Create the frame.
	 */
	public DisplayCarsbyPriceFrame(CarsFrame c) 
	{
		setTitle("Display Cars by Price");
		cars=c;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Min Price:");
		lblNewLabel.setBounds(24, 11, 113, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Max Price:");
		lblNewLabel_1.setBounds(24, 39, 113, 16);
		contentPane.add(lblNewLabel_1);
		
		minprice = new JTextField();
		minprice.setBounds(138, 6, 92, 26);
		contentPane.add(minprice);
		minprice.setColumns(10);
		
		maxprice = new JTextField();
		maxprice.setBounds(138, 34, 92, 26);
		contentPane.add(maxprice);
		maxprice.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 80, 408, 226);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton displayButton = new JButton("Display");
		displayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(minprice.getText().isEmpty() || maxprice.getText().isEmpty())
				{
					textArea.setText("Please fill the blanks!");
				}
				else
				{
					double min = Double.parseDouble(minprice.getText().toString());
					double max = Double.parseDouble(maxprice.getText().toString());
					if(CarsSys.displayTheCarsByPrice(max, min) == null)
					{
						textArea.setText("Car is not found, Please try again!");
					}
					else
						textArea.setText(CarsSys.displayTheCarsByPrice(max, min));
				}
				
				
			}
		});
		displayButton.setBounds(270, 16, 113, 29);
		contentPane.add(displayButton);
		
		JButton doneButton = new JButton("Done");
		doneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cars.setVisible(true);
				dispose();
			}
		});
		doneButton.setBounds(153, 301, 117, 29);
		contentPane.add(doneButton);
	}
}
