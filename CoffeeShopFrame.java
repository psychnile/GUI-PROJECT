package Frame;
import Entity.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class CoffeeShopFrame extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel titleLabel, nameLabel, totalLabel;
    private JTextField nameField;
    private JButton submitButton, exitButton;
    private JTextArea outputArea;
    private JLabel mochaImageLabel, cappucinoImageLabel, frappeImageLabel, bourbonImageLabel, americanoImageLabel, macchiatoImageLabel;
	private ImageIcon mochaImage, cappucinoImage, frappeImage, bourbonImage, americanoImage, macchiatoImage;
    private JLabel mochaLabel, cappucinoLabel, frappeLabel, bourbonLabel, americanoLabel, macchiatoLabel;
    private JButton mochaMinus, cappucinoMinus, frappeMinus, bourbonMinus, americanoMinus, macchiatoMinus;
    private JButton mochaPlus, cappucinoPlus, frappePlus, bourbonPlus, americanoPlus, macchiatoPlus;
    private JLabel mochaQuantity, cappucinoQuantity, frappeQuantity, bourbonQuantity, americanoQuantity, macchiatoQuantity;
    
    private int mochaCount = 0, cappucinoCount = 0, frappeCount = 0, bourbonCount = 0, americanoCount = 0, macchiatoCount = 0;
    
    public CoffeeShopFrame() {
        super("Coffee Shop Management System");
        super.setBounds(0, 0, 1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(153, 149, 140));
        
        Font titleFont = new Font("Calibri", Font.BOLD, 40);
        Font labelFont = new Font("Calibri", Font.PLAIN, 20);
        
        titleLabel = new JLabel("Welcome to our Coffee Shop");
        titleLabel.setBounds(450, 20, 600, 50);
        titleLabel.setFont(titleFont);
        titleLabel.setForeground(Color.DARK_GRAY);
        panel.add(titleLabel);
        
        nameLabel = new JLabel("Name : ");
        nameLabel.setBounds(100, 80, 300, 30);
        nameLabel.setFont(labelFont);
        panel.add(nameLabel);
        
        nameField = new JTextField();
        nameField.setBounds(400, 80, 300, 30);
        nameField.setFont(labelFont);
        panel.add(nameField);
        
        mochaImage = new ImageIcon("Picture/mocha.png");
        mochaImageLabel = new JLabel(mochaImage);
        mochaImageLabel.setBounds(100, 150, 250, 250);
        panel.add(mochaImageLabel);
		
		cappucinoImage = new ImageIcon("Picture/cappuccino.png");
        cappucinoImageLabel = new JLabel(cappucinoImage);
        cappucinoImageLabel.setBounds(450, 150, 250, 250);
        panel.add(cappucinoImageLabel);
		
		frappeImage = new ImageIcon("Picture/frappe.png");
        frappeImageLabel = new JLabel(frappeImage);
        frappeImageLabel.setBounds(800, 150, 250, 250);
        panel.add(frappeImageLabel);
		
		bourbonImage = new ImageIcon("Picture/bourbon.png");
        bourbonImageLabel = new JLabel(bourbonImage);
        bourbonImageLabel.setBounds(100, 470, 250, 250);
        panel.add(bourbonImageLabel);
		
		americanoImage = new ImageIcon("Picture/americano.png");
        americanoImageLabel = new JLabel(americanoImage);
        americanoImageLabel.setBounds(450, 470, 250, 250);
        panel.add(americanoImageLabel);
		
		macchiatoImage = new ImageIcon("Picture/macchiato.png");
        macchiatoImageLabel = new JLabel(macchiatoImage);
        macchiatoImageLabel.setBounds(800, 470, 250, 250);
        panel.add(macchiatoImageLabel);
        
        mochaLabel = new JLabel("MOCHA - 100BDT");
        mochaLabel.setBounds(147, 405, 250, 30);
        mochaLabel.setFont(labelFont);
        panel.add(mochaLabel);
		
		cappucinoLabel = new JLabel("CAPPUCINO - 200BDT");
        cappucinoLabel.setBounds(487, 405, 250, 30);
        cappucinoLabel.setFont(labelFont);
        panel.add(cappucinoLabel);
		
		frappeLabel = new JLabel("FRAPPE - 300BDT");
        frappeLabel.setBounds(849, 405, 250, 30);
        frappeLabel.setFont(labelFont);
        panel.add(frappeLabel);
		
		bourbonLabel = new JLabel("BOURBON - 400BDT");
        bourbonLabel.setBounds(143, 725, 250, 30);
        bourbonLabel.setFont(labelFont);
        panel.add(bourbonLabel);
		
		americanoLabel = new JLabel("AMERICANO - 500BDT");
        americanoLabel.setBounds(485, 725, 250, 30);
        americanoLabel.setFont(labelFont);
        panel.add(americanoLabel);
		
		macchiatoLabel = new JLabel("MACCHIATO - 600BDT");
        macchiatoLabel.setBounds(838, 725, 250, 30);
        macchiatoLabel.setFont(labelFont);
        panel.add(macchiatoLabel);
		
		mochaQuantity = new JLabel("0");
        mochaQuantity.setBounds(215, 430, 30, 30);
        mochaQuantity.setFont(labelFont);
        panel.add(mochaQuantity);
		
		cappucinoQuantity = new JLabel("0");
        cappucinoQuantity.setBounds(565, 430, 30, 30);
        cappucinoQuantity.setFont(labelFont);
        panel.add(cappucinoQuantity);
		
		frappeQuantity = new JLabel("0");
        frappeQuantity.setBounds(915, 430, 30, 30);
        frappeQuantity.setFont(labelFont);
        panel.add(frappeQuantity);
		
		bourbonQuantity = new JLabel("0");
        bourbonQuantity.setBounds(215, 750, 30, 30);
        bourbonQuantity.setFont(labelFont);
        panel.add(bourbonQuantity);
		
		americanoQuantity = new JLabel("0");
        americanoQuantity.setBounds(565, 750, 30, 30);
        americanoQuantity.setFont(labelFont);
        panel.add(americanoQuantity);
		
		macchiatoQuantity = new JLabel("0");
        macchiatoQuantity.setBounds(915, 750, 30, 30);
        macchiatoQuantity.setFont(labelFont);
        panel.add(macchiatoQuantity);
		
		mochaPlus = new JButton("+");
        mochaPlus.setBounds(245, 430, 50, 30);
        mochaPlus.addActionListener(this);
        panel.add(mochaPlus);
		
		cappucinoPlus = new JButton("+");
        cappucinoPlus.setBounds(595, 430, 50, 30);
        cappucinoPlus.addActionListener(this);
        panel.add(cappucinoPlus);
		
		frappePlus = new JButton("+");
        frappePlus.setBounds(945, 430, 50, 30);
        frappePlus.addActionListener(this);
        panel.add(frappePlus);
		
		bourbonPlus = new JButton("+");
        bourbonPlus.setBounds(245, 750, 50, 30);
        bourbonPlus.addActionListener(this);
        panel.add(bourbonPlus);
		
		americanoPlus = new JButton("+");
        americanoPlus.setBounds(595, 750, 50, 30);
        americanoPlus.addActionListener(this);
        panel.add(americanoPlus);
        
		macchiatoPlus = new JButton("+");
        macchiatoPlus.setBounds(945, 750, 50, 30);
        macchiatoPlus.addActionListener(this);
        panel.add(macchiatoPlus);
		
        mochaMinus = new JButton("-");
        mochaMinus.setBounds(145, 430, 50, 30);
        mochaMinus.addActionListener(this);
        panel.add(mochaMinus);
        
        cappucinoMinus = new JButton("-");
        cappucinoMinus.setBounds(495, 430, 50, 30);
        cappucinoMinus.addActionListener(this);
        panel.add(cappucinoMinus);
        
        frappeMinus = new JButton("-");
        frappeMinus.setBounds(845, 430, 50, 30);
        frappeMinus.addActionListener(this);
        panel.add(frappeMinus);
        
        bourbonMinus = new JButton("-");
        bourbonMinus.setBounds(145, 750, 50, 30);
        bourbonMinus.addActionListener(this);
        panel.add(bourbonMinus);
        
        americanoMinus = new JButton("-");
        americanoMinus.setBounds(495, 750, 50, 30);
        americanoMinus.addActionListener(this);
        panel.add(americanoMinus);
        
        macchiatoMinus = new JButton("-");
        macchiatoMinus.setBounds(845, 750, 50, 30);
        macchiatoMinus.addActionListener(this);
        panel.add(macchiatoMinus);
        
        outputArea = new JTextArea();
        JScrollPane scroll = new JScrollPane(outputArea);
        scroll.setBounds(1090, 150, 400, 400);
        outputArea.setFont(labelFont);
        panel.add(scroll);
        
        totalLabel = new JLabel("Total Bill: 0");
        totalLabel.setBounds(1090, 580, 400, 30);
        totalLabel.setFont(new Font("Calibri", Font.BOLD, 25));
        panel.add(totalLabel);
        
        submitButton = new JButton("Confirm order");
        submitButton.setBounds(1090, 640, 200, 40);
        submitButton.setFont(labelFont);
        submitButton.setBackground(Color.WHITE);
        submitButton.addActionListener(this);
        panel.add(submitButton);
        
        exitButton = new JButton("Exit");
        exitButton.setBounds(1310, 640, 180, 40);
        exitButton.setFont(labelFont);
        exitButton.setBackground(Color.WHITE);
        exitButton.addActionListener(this);
        panel.add(exitButton);
        
        super.add(panel);
    }
    
    public void actionPerformed(ActionEvent ae) {
        Object src = ae.getSource();
        if (src == mochaPlus) { mochaCount++; mochaQuantity.setText("" + mochaCount); }
        else if (src == mochaMinus && mochaCount > 0) { mochaCount--; mochaQuantity.setText("" + mochaCount); }

        else if (src == cappucinoPlus) { cappucinoCount++; cappucinoQuantity.setText("" + cappucinoCount); }
        else if (src == cappucinoMinus && cappucinoCount > 0) { cappucinoCount--; cappucinoQuantity.setText("" + cappucinoCount); }

        else if (src == frappePlus) { frappeCount++; frappeQuantity.setText("" + frappeCount); }
        else if (src == frappeMinus && frappeCount > 0) { frappeCount--; frappeQuantity.setText("" + frappeCount); }

        else if (src == bourbonPlus) { bourbonCount++; bourbonQuantity.setText("" + bourbonCount); }
        else if (src == bourbonMinus && bourbonCount > 0) { bourbonCount--; bourbonQuantity.setText("" + bourbonCount); }

        else if (src == americanoPlus) { americanoCount++; americanoQuantity.setText("" + americanoCount); }
        else if (src == americanoMinus && americanoCount > 0) { americanoCount--; americanoQuantity.setText("" + americanoCount); }

        else if (src == macchiatoPlus) { macchiatoCount++; macchiatoQuantity.setText("" + macchiatoCount); }
        else if (src == macchiatoMinus && macchiatoCount > 0) { macchiatoCount--; macchiatoQuantity.setText("" + macchiatoCount); }
    
        updateBill();
		
		if (src == submitButton) {
		String name = nameField.getText().trim();
		if (name.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Customer name is required!");
			return;
		}
		if (mochaCount + cappucinoCount + frappeCount + bourbonCount + americanoCount + macchiatoCount == 0) {
			JOptionPane.showMessageDialog(this, "Please select at least one coffee!");
			return;
		}

		outputArea.setText("");
		int grandTotal = 0;

		CustomerOrder order = new CustomerOrder(name);

		if (mochaCount > 0) {
			int total = mochaCount * 100;
			grandTotal += total;
			order.setCoffee(1, "MOCHA", mochaCount, total);
		}

		if (cappucinoCount > 0) {
			int total = cappucinoCount * 200;
			grandTotal += total;
			order.setCoffee(2, "CAPPUCINO", cappucinoCount, total);
		}

		if (frappeCount > 0) {
			int total = frappeCount * 300;
			grandTotal += total;
			order.setCoffee(3, "FRAPPE", frappeCount, total);
		}

		if (bourbonCount > 0) {
			int total = bourbonCount * 400;
			grandTotal += total;
			order.setCoffee(4, "BOURBON", bourbonCount, total);
		}

		if (americanoCount > 0) {
			int total = americanoCount * 500;
			grandTotal += total;
			order.setCoffee(5, "AMERICANO", americanoCount, total);
		}

		if (macchiatoCount > 0) {
			int total = macchiatoCount * 600;
			grandTotal += total;
			order.setCoffee(6, "MACCHIATO", macchiatoCount, total);
		}


		order.saveOrder();
		showing();
		

		JOptionPane.showMessageDialog(this, "Order saved successfully!");
		}

        
        if (src == exitButton) {
            System.exit(0);
            
        }
    }
    
    private void updateBill() {
        int sum = (mochaCount * 100) + (cappucinoCount * 200) + (frappeCount * 300) + (bourbonCount * 400) + (americanoCount * 500) + (macchiatoCount * 600);
        totalLabel.setText("Total Bill: " + sum);
    }
	
	private void showing()
	{
		try 
		{
			File file = new File("Customers/orders.txt");
			
			if(file.exists())
			{
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				
				String line;
				while((line = br.readLine()) != null)
				{
					outputArea.append(line +"\n");
				}
				br.close();
			}
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
			JOptionPane.showMessageDialog(this,"Error occurs");
		}
	}
}