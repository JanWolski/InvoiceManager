package jw.lab2.invoice;

public class Client {

  HashMap <String, Invoice> invoices;

  public void addInvoice(String invoice) {
    Invoice newInvoice = new Invoice(invoice)
    invoices.put(invoice, newInvoice);
  }

  public String[] loadInvoices(String client) {
    String[] invoicesNames = new String[invoices.length];
    int i = 0;
    for (String inv : invoices.keySet()) {
      invoicesNames[i] = inv;
    }
    return invoicesNames;
  }
  
  public void addElement(String client, String invoice, String article, int price, int amount){
    clients[client].addElement(invoice, article, price, amount);
  }
  
  public String[] loadElements(String client, String invoice){
    return clients[client].loadElements(invoice);
  }
}
