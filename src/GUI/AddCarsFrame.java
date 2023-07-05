package GUI;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;

import Classes.CarsSys;
import Classes.Origin;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ItemEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;

public class AddCarsFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	CarsFrame cars=null;
	private JTextField idText;
	private JTextField brandText;
	private JTextField modelText;
	private JTextField priceText;
	private JTextField dateText;
	private JTextField wheelsText;
	private JTextField colorText; 
	private JTextField batteryText;
	private JTextField Km;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JTextField battery2Text;
	private JTextField Vehicle2Text;
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private JTextField vehicle3Text;
	private JTextField gearText;
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	private JTextField motorPowerText;
	//
	private JTextField km2Text;

	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddGameFrame frame = new AddGameFrame();
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
	public AddCarsFrame(CarsFrame c) {
		setTitle("Add Car\r\n");
		cars=c;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1164, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Electric Cars", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(379, 19, 336, 285);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel DiscountedServiceLabel = new JLabel("Discounted Service Support:");
		DiscountedServiceLabel.setBounds(21, 25, 177, 13);
		panel_1.add(DiscountedServiceLabel);
		
		JLabel AutoPilot = new JLabel("Auto Pilot:");
		AutoPilot.setBounds(20, 125, 81, 13);
		panel_1.add(AutoPilot);
		
		JLabel battery = new JLabel("Battery Warranty Period:");
		battery.setBounds(21, 50, 177, 13);
		panel_1.add(battery);
		
		JLabel kmLabel = new JLabel("Km:");
		kmLabel.setBounds(21, 100, 45, 13);
		panel_1.add(kmLabel);
		
		JRadioButton serviceYes = new JRadioButton("Yes");
		serviceYes.setToolTipText("true");
		serviceYes.setSelected(true);
		buttonGroup.add(serviceYes);
		serviceYes.setBounds(201, 20, 71, 21);
		panel_1.add(serviceYes);
		
		JRadioButton serviceNo = new JRadioButton("No");
		serviceNo.setToolTipText("false");
		serviceNo.setSelected(true);
		buttonGroup.add(serviceNo);
		serviceNo.setBounds(259, 20, 71, 21);
		panel_1.add(serviceNo);
		
		JRadioButton apNo = new JRadioButton("No");
		apNo.setSelected(true);
		buttonGroup_1.add(apNo);
		apNo.setBounds(259, 120, 72, 21);
		panel_1.add(apNo);
		
		JRadioButton apYes = new JRadioButton("Yes");
		apYes.setSelected(true);
		buttonGroup_1.add(apYes);
		apYes.setBounds(201, 120, 71, 21);
		panel_1.add(apYes);
		
		batteryText = new JTextField();
		batteryText.setEnabled(false);
		batteryText.setBounds(201, 46, 96, 19);
		panel_1.add(batteryText);
		batteryText.setColumns(10);
		
		Km = new JTextField();
		Km.setEnabled(false);
		Km.setBounds(201, 96, 96, 19);
		panel_1.add(Km);
		Km.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Origin:");
		lblNewLabel.setBounds(21, 149, 61, 16);
		panel_1.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(46, 177, 251, 102);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Currency:");
		lblNewLabel_1.setBounds(18, 37, 60, 16);
		panel_4.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tax:");
		lblNewLabel_2.setBounds(18, 65, 81, 16);
		panel_4.add(lblNewLabel_2);
		
		JComboBox comboBoxTax = new JComboBox();
		comboBoxTax.setModel(new DefaultComboBoxModel(new String[] {"TURKEY- %80", "USA - %10", "GERMANY - %15"}));
		comboBoxTax.setBounds(125, 61, 120, 27);
		panel_4.add(comboBoxTax);
		comboBoxTax.setEnabled(false);
		
		
		
		JComboBox comboBoxCurrency = new JComboBox();
		comboBoxCurrency.setModel(new DefaultComboBoxModel(new String[] {"TL", "EURO", "DOLLAR"}));
		comboBoxCurrency.setBounds(125, 33, 120, 27);
		panel_4.add(comboBoxCurrency);
		comboBoxCurrency.setEnabled(false);
		
		JLabel lblNewLabel_3 = new JLabel("Manufacturer");
		lblNewLabel_3.setBounds(17, 9, 104, 16);
		panel_4.add(lblNewLabel_3);
		
		JComboBox comboBoxManuFacturer = new JComboBox();
		comboBoxManuFacturer.setModel(new DefaultComboBoxModel(new String[] {"TOGG", "TESLA", "PORSCHE"}));
		
		
		comboBoxManuFacturer.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
			
				if(comboBoxManuFacturer.getSelectedItem().toString().equalsIgnoreCase("TOGG")) {
					
					comboBoxTax.removeAllItems();
					comboBoxCurrency.removeAllItems();
					
					comboBoxTax.addItem("%80");
					comboBoxCurrency.addItem("TL");
					
					
					
					
					
				}
				
				else if(comboBoxManuFacturer.getSelectedItem().toString().equalsIgnoreCase("TESLA")) {
					
					comboBoxTax.removeAllItems();
					comboBoxCurrency.removeAllItems();
					
					comboBoxTax.addItem("%10");
					comboBoxCurrency.addItem("Dollar");
					
					
					
					}
					else if(comboBoxManuFacturer.getSelectedItem().toString().equalsIgnoreCase("PORSCHE")) {
					
					comboBoxTax.removeAllItems();
					comboBoxCurrency.removeAllItems();
					
					comboBoxTax.addItem("%15");
					comboBoxCurrency.addItem("EURO");
					}
				
					else {
						comboBoxTax.removeAllItems();
						comboBoxCurrency.removeAllItems();
						
					}
					
					
					
					
				
				
			}
		});
		comboBoxManuFacturer.setEnabled(false);
		comboBoxManuFacturer.setBounds(125, 5, 120, 27);
		panel_4.add(comboBoxManuFacturer);
		
		
		JComboBox comboBoxOrigin = new JComboBox();
		comboBoxOrigin.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				comboBoxManuFacturer.enable();
				comboBoxCurrency.enable();
				comboBoxTax.enable();
				
				int size = comboBoxManuFacturer.getItemCount();
				System.out.println(size);
				if(comboBoxOrigin.getSelectedIndex() == 0) {
					
					for(int i = size-1; i>0;i--)
						comboBoxManuFacturer.removeItemAt(i);
					
					
					comboBoxManuFacturer.addItem("TOGG");
					
					
					
				}
				else if(comboBoxOrigin.getSelectedIndex() == 1) {
					for(int i = size-1; i>0;i--)
						comboBoxManuFacturer.removeItemAt(i);
					
					comboBoxManuFacturer.addItem("TESLA");
					
					
						
				}
				else if(comboBoxOrigin.getSelectedIndex() == 2){
					for(int i = size-1; i>0;i--)
						comboBoxManuFacturer.removeItemAt(i);
					
					comboBoxManuFacturer.addItem("PORSCHE");
					
					

					
					
				}
			}
		});
		comboBoxOrigin.setEnabled(false);
		comboBoxOrigin.setModel(new DefaultComboBoxModel(new String[] {"-", "TOGG", "TESLA", "PORSCHE"}));
		comboBoxOrigin.setBounds(201, 145, 96, 27);
		panel_1.add(comboBoxOrigin);
		
		JTextArea vehicleText = new JTextArea();
		vehicleText.setBounds(201, 68, 96, 16);
		panel_1.add(vehicleText);
		
		JLabel vejicleStatus1 = new JLabel("Vehicle Status:");
		vejicleStatus1.setBounds(21, 68, 147, 16);
		panel_1.add(vejicleStatus1);
		

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "HybridCars", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(373, 316, 342, 149);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel regenaraitve = new JLabel("Regenerative Braking");
		regenaraitve.setBounds(10, 29, 136, 13);
		panel_2.add(regenaraitve);
		
		JLabel battery2 = new JLabel("Battery Warranty Period:");
		battery2.setBounds(10, 55, 162, 13);
		panel_2.add(battery2);
		
		JLabel vehiclestatus2 = new JLabel("Vehicle Status:");
		vehiclestatus2.setBounds(10, 80, 148, 13);
		panel_2.add(vehiclestatus2);
		
		JLabel hybridtype = new JLabel("Hybrid Type:");
		hybridtype.setBounds(10, 106, 136, 13);
		panel_2.add(hybridtype);
		
		JLabel multimedia = new JLabel("Multimedia Screen");
		multimedia.setBounds(10, 127, 148, 13);
		panel_2.add(multimedia);
		
		JRadioButton reNo = new JRadioButton("No");
		reNo.setSelected(true);
		buttonGroup_3.add(reNo);
		reNo.setBounds(237, 24, 62, 21);
		panel_2.add(reNo);
		
		JRadioButton reYes = new JRadioButton("Yes");
		reYes.setSelected(true);
		buttonGroup_3.add(reYes);
		reYes.setBounds(190, 24, 54, 21);
		panel_2.add(reYes);
		
		JRadioButton isMNo = new JRadioButton("No");
		isMNo.setSelected(true);
		buttonGroup_4.add(isMNo);
		isMNo.setBounds(237, 127, 62, 21);
		panel_2.add(isMNo);
		
		JRadioButton isMYes = new JRadioButton("Yes");
		isMYes.setSelected(true);
		buttonGroup_4.add(isMYes);
		isMYes.setBounds(190, 127, 62, 21);
		panel_2.add(isMYes);
		
		battery2Text = new JTextField();
		battery2Text.setEnabled(false);
		battery2Text.setColumns(10);
		battery2Text.setBounds(184, 49, 96, 19);
		panel_2.add(battery2Text);
		
		Vehicle2Text = new JTextField();
		Vehicle2Text.setEnabled(false);
		Vehicle2Text.setColumns(10);
		Vehicle2Text.setBounds(184, 75, 96, 19);
		panel_2.add(Vehicle2Text);
		
		
		
		JComboBox comboBoxHtype = new JComboBox();
		comboBoxHtype.setModel(new DefaultComboBoxModel(new String[] {"Series Hybrid", "Parallel Hybrid", "Series-Paralellel Hybrid"}));
		comboBoxHtype.setEnabled(false);
		comboBoxHtype.setBounds(173, 100, 126, 27);
		panel_2.add(comboBoxHtype);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "GasolineDieselGasCars", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(373, 489, 342, 149);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel vehiclestatus3 = new JLabel("Vehicle Status:");
		vehiclestatus3.setBounds(10, 31, 97, 13);
		panel_3.add(vehiclestatus3);
		
		JLabel gear3 = new JLabel("Gear:");
		gear3.setBounds(10, 60, 123, 13);
		panel_3.add(gear3);
		
		JLabel motorpower = new JLabel("Motor Power:");
		motorpower.setBounds(10, 91, 125, 13);
		panel_3.add(motorpower);
		
		vehicle3Text = new JTextField();
		vehicle3Text.setEnabled(false);
		vehicle3Text.setColumns(10);
		vehicle3Text.setBounds(148, 28, 96, 19);
		panel_3.add(vehicle3Text);
		
		gearText = new JTextField();
		gearText.setEnabled(false);
		gearText.setColumns(10);
		gearText.setBounds(148, 57, 96, 19);
		panel_3.add(gearText);
		
		motorPowerText = new JTextField();
		motorPowerText.setBounds(147, 84, 97, 26);
		panel_3.add(motorPowerText);
		motorPowerText.setColumns(10);
		
		JLabel gasolinekmLabel = new JLabel("KM:");
		gasolinekmLabel.setBounds(6, 113, 61, 16);
		panel_3.add(gasolinekmLabel);
		
		km2Text = new JTextField();
		km2Text.setBounds(148, 108, 96, 26);
		panel_3.add(km2Text);
		km2Text.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Cars", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(6, 173, 342, 273);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel idLabel = new JLabel("  ID:");
		idLabel.setBounds(10, 50, 45, 13);
		panel.add(idLabel);
		
		JLabel brandLabel = new JLabel("Brand:");
		brandLabel.setBounds(20, 71, 85, 13);
		panel.add(brandLabel);
		
		JLabel modelLabel = new JLabel("Model:");
		modelLabel.setBounds(18, 96, 74, 13);
		panel.add(modelLabel);
		
		JLabel priceLabel = new JLabel("  Price:");
		priceLabel.setBounds(10, 145, 45, 13);
		panel.add(priceLabel);
		
		JLabel releaseDateLabel = new JLabel("Car Release Date:");
		releaseDateLabel.setBounds(23, 195, 147, 13);
		panel.add(releaseDateLabel);
		
		JLabel supportedLanguagesLabel = new JLabel("Wheels:");
		supportedLanguagesLabel.setBounds(20, 120, 162, 13);
		panel.add(supportedLanguagesLabel);
		
		JLabel colorLable = new JLabel("Color:");
		colorLable.setBounds(20, 170, 113, 13);
		panel.add(colorLable);
		
		idText = new JTextField();
		idText.setBounds(183, 50, 96, 19);
		panel.add(idText);
		idText.setColumns(10);
		
		brandText = new JTextField();
		brandText.setBounds(183, 71, 96, 19);
		panel.add(brandText);
		brandText.setColumns(10);
		
		modelText = new JTextField();
		modelText.setColumns(10);
		modelText.setBounds(183, 92, 96, 19);
		panel.add(modelText);
		
		priceText = new JTextField();
		priceText.setColumns(10);
		priceText.setBounds(183, 141, 96, 19);
		panel.add(priceText);
		
		dateText = new JTextField();
		dateText.setColumns(10);
		dateText.setBounds(182, 197, 96, 19);
		panel.add(dateText);
		
	
		
		colorText = new JTextField();
		colorText.setColumns(10);
		colorText.setBounds(183, 166, 96, 19);
		panel.add(colorText);
		
		//for the first add button execution -bug solver-
		serviceYes.setEnabled(false);
		serviceNo.setEnabled(false);
		apYes.setEnabled(false);
		apNo.setEnabled(false);
		
		//
		
		reYes.setEnabled(false);
		reNo.setEnabled(false);
		isMYes.setEnabled(false);
		isMNo.setEnabled(false);
		
		
		JComboBox comboBoxType = new JComboBox();
		comboBoxType.setBounds(167, 17, 137, 21);
		panel.add(comboBoxType);
		comboBoxType.addItemListener(new ItemListener() {
			@SuppressWarnings("deprecation")
			public void itemStateChanged(ItemEvent e) 
			{	
				
				if(comboBoxType.getSelectedIndex() == 0) //for electric cars
				{
				
				serviceYes.setEnabled(true);
				serviceNo.setEnabled(true);
				apYes.setEnabled(true);
				apNo.setEnabled(true);
					
				batteryText.enable();
				Km.enable();
				comboBoxOrigin.enable();
				
				
				//hybrid
				reYes.setEnabled(false);
				reNo.setEnabled(false);
				isMYes.setEnabled(false);
				isMNo.setEnabled(false);
				
				reYes.disable();
				reNo.disable();
				battery2Text.disable();
				Vehicle2Text.disable();
				comboBoxHtype.disable();
				battery2Text.setText("");
				Vehicle2Text.setText("");
				buttonGroup_3.clearSelection();
				buttonGroup_4.clearSelection();
				
				
				
				//gasoline
				
				vehicle3Text.disable();
				gearText.disable();
				vehicle3Text.setText("");
				gearText.setText("");
				buttonGroup_5.clearSelection();
				
				}
				else if(comboBoxType.getSelectedIndex() == 1) 
				{
					
					
				
					reYes.setEnabled(true);
					reNo.setEnabled(true);
					isMYes.setEnabled(true);
					isMNo.setEnabled(true);
					
					reYes.enable();
					reNo.enable();
					battery2Text.enable();
					Vehicle2Text.enable();
					comboBoxHtype.enable();
					
					
					//electiric
					serviceYes.setEnabled(false);
					serviceNo.setEnabled(false);
					apYes.setEnabled(false);
					apNo.setEnabled(false);
					
					buttonGroup.clearSelection();
					buttonGroup_2.clearSelection();
					buttonGroup_1.clearSelection();
					batteryText.disable();
					Km.disable();
					comboBoxOrigin.disable();
					comboBoxCurrency.disable();
					comboBoxTax.disable();
					comboBoxManuFacturer.disable();
					batteryText.setText("");
					Km.setText("");
					comboBoxManuFacturer.setSelectedIndex(0);
					
					
					
					//gasoline
					vehicle3Text.disable();
					gearText.disable();
					vehicle3Text.setText("");
					gearText.setText("");
					buttonGroup_5.clearSelection();
					
				}
				else 
				{
					//gasoline
					vehicle3Text.enable();
					gearText.enable();
			
					
					//electric
					serviceYes.setEnabled(false);
					serviceNo.setEnabled(false);
					apYes.setEnabled(false);
					apNo.setEnabled(false);
					isMYes.setEnabled(false);
					isMNo.setEnabled(false);
					
					buttonGroup.clearSelection();
					buttonGroup_2.clearSelection();
					buttonGroup_1.clearSelection();
					batteryText.disable();
					Km.disable();
					comboBoxOrigin.disable();
					comboBoxCurrency.disable();
					comboBoxTax.disable();
					comboBoxManuFacturer.disable();
					batteryText.setText("");
					Km.setText("");
					comboBoxManuFacturer.setSelectedIndex(0);
					
					//hybrid
					reYes.setEnabled(false);
					reNo.setEnabled(false);
					isMYes.setEnabled(false);
					isMNo.setEnabled(false);
					
					reYes.disable();
					reNo.disable();
					battery2Text.disable();
					Vehicle2Text.disable();
					comboBoxHtype.disable();
					battery2Text.setText("");
					Vehicle2Text.setText("");
					buttonGroup_3.clearSelection();
					buttonGroup_4.clearSelection();
				}
			}
		});
		comboBoxType.setModel(new DefaultComboBoxModel(new String[] {"ElectricCars", "HybridCars", "GasolineDieselGasCars"}));
		
		

		JLabel typeLabel = new JLabel("Type:");
		typeLabel.setBounds(10, 20, 45, 13);
		panel.add(typeLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(778, 180, 342, 372);
		contentPane.add(textArea);
		
		JButton addGameButton = new JButton("Add Car");
		addGameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(idText.getText().isEmpty() || brandText.getText().isEmpty() ||  modelText.getText().isEmpty()||   priceText.getText().isEmpty()
						||  dateText.getText().isEmpty()|| wheelsText.getText().isEmpty() || colorText.getText().isEmpty())
					{
					System.out.println("bos");
					textArea.setText("Please fill Car panel!");
				}
				else {
					
					int id = Integer.parseInt(idText.getText().toString());
					String type = comboBoxType.getSelectedItem().toString();
					String brand = brandText.getText().toString();
					String model = modelText.getText().toString();
					double price = Double.parseDouble(priceText.getText().toString());
					String carsReleaseDate = dateText.getText().toString();
					String color = colorText.getText().toString();
					String[] wheels = wheelsText.getText().toString().split(" ");
					
					
					if(comboBoxType.getSelectedIndex() == 0) {
						
						if(buttonGroup.isSelected(null) || buttonGroup_1.isSelected(null) || buttonGroup_2.isSelected(null) || batteryText.getText().isEmpty() ||  vehicleText.getText().isEmpty() || Km.getText().isEmpty() ) {
							textArea.setText("Please fill the selected Car Type panel!");
						}
						else {
							if(comboBoxManuFacturer.getSelectedItem().toString().equals("-")) {
								textArea.setText("Please select a ManuFacturer!");
							}
							else {
								
								Origin o = new Origin(comboBoxManuFacturer.getSelectedItem().toString(),comboBoxCurrency.getSelectedItem().toString(),comboBoxTax.getSelectedItem().toString());
								
								ArrayList<Origin> ar = new ArrayList<Origin>();

								ar.add(o);
								boolean maintenanceAndServiceEase = serviceYes.isSelected();
								int batteryWarrantyPeriod = Integer.parseInt(batteryText.getText().toString());
								String vehicleStatus = vehicleText.getText().toString();
								int range = Integer.parseInt(Km.getText().toString());
								boolean enhancedAutoPilot = apYes.isSelected();
						
								
								//if(!CarsSys.addCar(id, type, brand, model, price, wheels, color, carsReleaseDate,
									//	maintenanceAndServiceEase, batteryWarrantyPeriod, carsReleaseDate, range, enhancedAutoPilot, ar));
									//textArea.setText("There is a car with that id! Change the id.");
									//else
										textArea.setText("Game with "+id+" id added.");

								
								
								
								
							}
						}
					}
					
					
						else if(comboBoxType.getSelectedIndex() == 1) {
						
						if(buttonGroup_3.isSelected(null) || Vehicle2Text.getText().isEmpty() || battery2Text.getText().isEmpty() || buttonGroup_4.isSelected(null)){
							textArea.setText("Please fill the selected Car Type panel!");
						}
						else {
						
	
							boolean regenerativeBraking = serviceYes.isSelected();
							int batteryWarrantyPeriod = Integer.parseInt(battery2Text.getText().toString());
							String vehicleStatus = Vehicle2Text.getText().toString();
							String hybridType = comboBoxHtype.getSelectedItem().toString();
							boolean multimediaFullScreen = isMYes.isSelected();
						
						//if(!CarsSys.addCar(id, type, brand, model, price, wheels, color, carsReleaseDate, id, brand, model, id, id, null, rootPaneCheckingEnabled, id, carsReleaseDate, id, rootPaneCheckingEnabled, id, type, rootPaneCheckingEnabled, color, rootPaneCheckingEnabled))

						//	textArea.setText("There is a car with that id! Change the id.");
						//else
							textArea.setText("Car with "+id+" id added.");
						}
					}
					else if(comboBoxType.getSelectedIndex() == 2) {
						if(vehicle3Text.getText().isEmpty() || gearText.getText().isEmpty() || motorPowerText.getText().isEmpty() ||km2Text.getText().isEmpty() ||buttonGroup_5.isSelected(null)) {
							textArea.setText("Please fill the selected Car Type panel!");
						}
						else {
						String vehicleStatus = vehicle3Text.getText().toString();
						String gear = gearText.getText().toString();
						String motorPower = motorPowerText.getText().toString();
						String km = km2Text.getText().toString();
						
					//	if(!CarsSys.addCar(id, type, brand, model, price, wheels, color, carsReleaseDate, id, brand, model, id, id, null, rootPaneCheckingEnabled, id, carsReleaseDate, id, rootPaneCheckingEnabled, id, type, rootPaneCheckingEnabled, color, rootPaneCheckingEnabled))

							
					//	textArea.setText("There is a car with that id! Change the id.");
					//	else
							textArea.setText("Car with "+id+" id added.");
						}
					}
					
				}
					
			}
		});
					
						
					
					
					
				
					
			
	
		JButton doneButton = new JButton("Done");
		doneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cars.setVisible(true);
				dispose();
			}
		});
		doneButton.setBounds(973, 116, 128, 39);
		contentPane.add(doneButton);
		
		JButton btnAddButton = new JButton("Add");
		btnAddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnAddButton.setBounds(796, 116, 148, 39);
		contentPane.add(btnAddButton);
	}
			}
		
				