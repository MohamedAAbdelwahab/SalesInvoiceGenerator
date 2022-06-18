package view;

import controller.tableHandler;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Arrays;

public class MainTest extends JFrame{
    public JPanel newd;
    private JTable table1;
    private JButton createInvoice;
    private JButton deleteInvoice;
    private JTable table2;
    private JButton cancel;
    private JButton save;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel invoiceNumber;
    private JLabel invoiceDate;
    private JLabel customerName;
    private JLabel invoiceTotal;
    private JLabel invoiceItems;
    private JLabel totalPrice;
    private JLabel count;
    tableHandler e=new tableHandler();
    public MainTest () throws FileNotFoundException, ParseException {
        invoiceNumber.setText("Invoice Number");
        invoiceDate.setText("Invoice Date");
        customerName.setText("Customer Name");
        invoiceTotal.setText("Invoice total");
        save.setText("save");
        cancel.setText("cancel");
        createInvoice.setText("Create Invoice");
        deleteInvoice.setText("Delete Invoice");
        table1.setAutoCreateRowSorter(true);
        table1.setFillsViewportHeight(true);
        table1.setPreferredScrollableViewportSize(new Dimension(550, 200));
        table1.setModel(e.getdata());


    }
}
