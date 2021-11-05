package jw.lab2.invoice;

public class InvoiceMenu extends Menu {

  private String client;

  public InvoiceMenu(IDatabaseAdapter database, Menu parentMenu) {
    super(database, parentMenu);
  }

  public void addRecord() {
    database.addInvoice(client);
  }

  public void loadRecords(String arg) {
    client = arg;
    records = database.loadInvoices(client);
  }

  public void selectRecord(String arg) {
    database.loadInvoices(client);
  }

  void addElement(String client, String invoice, String article, int price, int amount){

  }

  String[] loadElements(String client, String invoice){
    
  }
}
