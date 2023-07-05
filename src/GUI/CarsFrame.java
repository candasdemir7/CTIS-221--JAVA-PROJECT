package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.CarsSys;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class CarsFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	CarsFrame mf = null;
	SearchCarsFrame s = new SearchCarsFrame(this);
	RemoveCarsFrame r=new RemoveCarsFrame(this);
	AddCarsFrame add=new AddCarsFrame(this);
	DisplayCarsbyPriceFrame price = new DisplayCarsbyPriceFrame(this);
	DisplayCarsbyBrandFrame name = new DisplayCarsbyBrandFrame(this);
	
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameFrame frame = new GameFrame();
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
	public CarsFrame(MainFrame mf) {
		setTitle("Cars Frame\r\n");
		MainFrame mf1;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(17, 62, 410, 277);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//if(CarsSys.getReadcount() == 0)
				//	textArea.setText("Please read the database first");
				//else
					textArea.setText(CarsSys.displayAllCars());
			}
		});
		
		JButton readfromfile_btn = new JButton("Read All Cars from Database");
		readfromfile_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(CarsSys.readFromFile())
					textArea.setText("The database has read!");
				else
					textArea.setText("There is an error occured. File cannot be read!");
			}
		});
		readfromfile_btn.setBounds(17, 19, 243, 29);
		contentPane.add(readfromfile_btn);
		
		JButton displayAll = new JButton("Display All Cars");
		displayAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{

					textArea.setText(CarsSys.displayAllCars());
			}
		});
		displayAll.setBounds(270, 19, 158, 29);
		contentPane.add(displayAll);
		
		JButton searchCarButton = new JButton("Search Cars");
		searchCarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					s.setVisible(true);
					setVisible(false);
			
				
			}
		});
		searchCarButton.setBounds(439, 136, 191, 29);
		contentPane.add(searchCarButton);
		
		JButton addCarButton = new JButton("Add Car");
		addCarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				{
					add.setVisible(true);
					setVisible(false);
				}
			}
		});
		addCarButton.setBounds(439, 177, 191, 29);
		contentPane.add(addCarButton);
		
		JButton calcNewPriceButton = new JButton("Calculate New Price");
		calcNewPriceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					CarsSys.calcAllNewPrice();
					textArea.setText("New prices are calculated for all games!!");
				
			}
		});
		calcNewPriceButton.setBounds(439, 216, 191, 29);
		contentPane.add(calcNewPriceButton);
		
		JButton removeCarButton = new JButton("Remove Car");
		removeCarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					r.setVisible(true);
					setVisible(false); 
				//}
			}
		});
		removeCarButton.setBounds(439, 255, 191, 29);
		contentPane.add(removeCarButton);
		
		JButton displayCarsbyPriceButton = new JButton("Display Car by Price");
		displayCarsbyPriceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				
					price.setVisible(true);
					dispose(); 
				
			}
		});
		displayCarsbyPriceButton.setBounds(440, 19, 191, 29);
		contentPane.add(displayCarsbyPriceButton);
		
		JButton btnNewButton_1 = new JButton("Display Car by Brand");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
					name.setVisible(true);
					dispose();
				
			}
		});
		btnNewButton_1.setBounds(439, 59, 191, 29);
		contentPane.add(btnNewButton_1);
	}
}
