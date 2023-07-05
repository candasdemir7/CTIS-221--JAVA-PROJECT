package GUI;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	CarsFrame mf = new CarsFrame(this);
	
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntranceFrame frame = new EntranceFrame();
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
	public MainFrame() {
		setTitle("Welcome to Can's Project");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 500);
		contentPane = new JPanel();
		contentPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) 
				{
					mf.setVisible(true);
					dispose();
				}
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setLabelFor(lblNewLabel);
		lblNewLabel.setBounds(71, 51, 462, 231);
		contentPane.add(lblNewLabel);
		
		//inserting an image 
		ImageIcon icon = new ImageIcon("logo.png"); 
		Image img = icon.getImage();
		Image modifiedimage = img.getScaledInstance(500, 400, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(modifiedimage);
		lblNewLabel.setIcon(icon);
		
		JButton btnNewButton = new JButton("Let's Get Choose The Best Car For You!!!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				mf.setVisible(true);
				dispose();
			}
		});
		btnNewButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) 
				{
					mf.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setBounds(151, 294, 321, 29);
		contentPane.add(btnNewButton);
		
		
		
	}
}