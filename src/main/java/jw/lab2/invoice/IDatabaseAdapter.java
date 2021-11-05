package jw.lab2.invoice;

public interface IDatabaseAdapter {

  void addClient(String client);

  String[] loadClients();


  void addInvoice(String client, String invoice);

  String[] loadInvoices(String client);


  void addElement(String client, String invoice, String article, int price, int amount);

  String[] loadElements(String client, String invoice);

}
