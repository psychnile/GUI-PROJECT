package Entity;
import Frame.*;
import java.io.*;
import javax.swing.*;

public class CustomerOrder {
    private String customerName;
    private String coffee1, coffee2, coffee3, coffee4, coffee5, coffee6;
    private int qty1, qty2, qty3, qty4, qty5, qty6;
    private int total1, total2, total3, total4, total5, total6;
    private int grandTotal;

    private File file;
    private FileWriter fwriter;

    public CustomerOrder(String customerName) {
        this.customerName = customerName;
        coffee1 = coffee2 = coffee3 = coffee4 = coffee5 = coffee6 = "";
        grandTotal = 0;
    }

    public void setCoffee(int slot, String coffeeName, int quantity, int total) {
        if (slot == 1) {
            coffee1 = coffeeName;
            qty1 = quantity;
            total1 = total;
        } else if (slot == 2) {
            coffee2 = coffeeName;
            qty2 = quantity;
            total2 = total;
        } else if (slot == 3) {
            coffee3 = coffeeName;
            qty3 = quantity;
            total3 = total;
        } else if (slot == 4) {
            coffee4 = coffeeName;
            qty4 = quantity;
            total4 = total;
        } else if (slot == 5) {
            coffee5 = coffeeName;
            qty5 = quantity;
            total5 = total;
        } else if (slot == 6) {
            coffee6 = coffeeName;
            qty6 = quantity;
            total6 = total;
        }
        grandTotal += total;
    }

    public void saveOrder() {
        try {
            file = new File("Customers/orders.txt");
            if (!file.exists()) file.createNewFile();

            fwriter = new FileWriter(file, true); // append mode
            fwriter.write("===========================================\n");
            fwriter.write("Customer: " + customerName + "\n");
            fwriter.write("-------------------------------------------\n");

            if (!coffee1.isEmpty()) fwriter.write(coffee1 + " x " + qty1 + " = " + total1 + "\n");
            if (!coffee2.isEmpty()) fwriter.write(coffee2 + " x " + qty2 + " = " + total2 + "\n");
            if (!coffee3.isEmpty()) fwriter.write(coffee3 + " x " + qty3 + " = " + total3 + "\n");
            if (!coffee4.isEmpty()) fwriter.write(coffee4 + " x " + qty4 + " = " + total4 + "\n");
            if (!coffee5.isEmpty()) fwriter.write(coffee5 + " x " + qty5 + " = " + total5 + "\n");
            if (!coffee6.isEmpty()) fwriter.write(coffee6 + " x " + qty6 + " = " + total6 + "\n");

            fwriter.write("-------------------------------------------\n");
            fwriter.write("Total Bill: " + grandTotal + "\n");
            fwriter.write("===========================================\n\n");

            fwriter.flush();
            fwriter.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error saving order!");
        }
    }
}

