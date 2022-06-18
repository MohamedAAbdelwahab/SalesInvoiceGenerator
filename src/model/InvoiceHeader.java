package model;

import java.sql.Date;
import java.util.ArrayList;

public class InvoiceHeader {

    int invoiceNum;
    Date invoiceDate;
    String customerName;
    ArrayList<InvoiceLine> invoiceLines = new ArrayList<InvoiceLine>();
}
