import model.FileOperations;
import model.InvoiceHeader;
import view.MainTest;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;

public class main {

    public static void main(String []args) throws FileNotFoundException, ParseException {
        FileOperations fileOperations=new FileOperations();
        ArrayList<InvoiceHeader> headers;
        headers=fileOperations.readFile();
        for(InvoiceHeader header:headers)
        {
            System.out.println(header.getInvoiceNum());
            System.out.println(header.getInvoiceDate());
            System.out.println(header.getCustomerName());
        }
        JFrame frame=new JFrame("asdasd");
        frame.setContentPane(new MainTest().newd);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
