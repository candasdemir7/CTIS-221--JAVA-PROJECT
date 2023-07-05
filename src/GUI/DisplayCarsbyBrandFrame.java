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

public class DisplayCarsbyBrandFrame extends JFrame 
{

	private JPanel contentPane;
	private JTextField carsmodel;

	/**
	 * Launch the application.
	 */
	CarsFrame cars=null;

	/**
	 * Create the frame.
	 */
	public DisplayCarsbyBrandFrame(CarsFrame c) 
	{
		setTitle("Display Cars by Brand");
		cars=c;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter brand of the Car:");
		lblNewLabel.setBounds(35, 52, 207, 16);
		contentPane.add(lblNewLabel);
		
		carsmodel = new JTextField();
		carsmodel.setBounds(187, 47, 160, 26);
		contentPane.add(carsmodel);
		carsmodel.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 80, 408, 226);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton displayButton = new JButton("Display");
		displayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(carsmodel.getText().isEmpty())
				{
					textArea.setText("Please fill the blanks!");
				}
				else
				{
					String cars = carsmodel.getText().toString();
					if(CarsSys.displayTheCars(cars) == null)
					{
						textArea.setText("Car is not found");
					}
					else
					{
						textArea.setText(CarsSys.displayTheCars(cars));
					}
				}
				
				
			}
		});
		displayButton.setBounds(436, 158, 117, 29);
		contentPane.add(displayButton);
		
		JButton doneButton = new JButton("Done");
		doneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cars.setVisible(true);
				dispose();
			}
		});
		doneButton.setBounds(436, 199, 117, 29);
		contentPane.add(doneButton);
	}
}
