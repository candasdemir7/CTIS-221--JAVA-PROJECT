package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.CarsSys;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class RemoveCarsFrame extends JFrame {

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
					RemoveGameFrame frame = new RemoveGameFrame();
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
	public RemoveCarsFrame(CarsFrame c) {
		cars=c;
		setTitle("Remove Cars\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(32, 36, 307, 222);
		contentPane.add(textArea);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel gameIdLabel = new JLabel("Cars ID:");
		gameIdLabel.setBounds(42, 278, 58, 13);
		contentPane.add(gameIdLabel);
		
		idInput = new JTextField();
		idInput.setBounds(104, 274, 124, 19);
		contentPane.add(idInput);
		idInput.setColumns(10);
		
		JButton removeButton = new JButton("Remove");
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(idInput.getText().equalsIgnoreCase(""))
				{
					textArea.setText("Please enter a valid ID to remove!!");
				}
				else{
					if(!CarsSys.removeCars(Integer.parseInt(idInput.getText())))
					{
						textArea.setText("There is no car related to this ID to be removed");
					}
					else
					{
						textArea.setText("Successfully Removed");
					}
							
				}
			}
		});
		removeButton.setBounds(408, 127, 85, 21);
		contentPane.add(removeButton);
		
		JButton btnNewButton_1 = new JButton("Done");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cars.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(408, 173, 85, 21);
		contentPane.add(btnNewButton_1);
		
	}

}
