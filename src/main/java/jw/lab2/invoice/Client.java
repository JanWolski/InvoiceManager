package jw.lab2.invoice;

import java.util.HashMap;


public class Client {

  String name;

  HashMap <String, Invoice> invoices;

  public Client(String name) {
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void addInvoice(String invoice) {
    Invoice newInvoice = new Invoice(invoice);
    invoices.put(invoice, newInvoice);
  }

  public String[] loadInvoices() {
    String[] invoicesNames = new String[invoices.size()];
    int i = 0;
    for (String inv : invoices.keySet()) {
      invoicesNames[i] = inv;
    }
    return invoicesNames;
  }
  
  public void addElement(String invoice, String article, int price, int amount){
    if (invoices.containsKey(invoice) == false) {
      addInvoice(invoice);
    }
    invoices.get(invoice).addElement(article, price, amount);
  }
  
  public String[] loadElements(String invoice){
    return invoices.get(invoice).loadElements();
  }
}
