package jw.lab2.invoice;

public interface IDatabaseAdapter {

  String[] loadClients();


  String[] loadInvoices(String client);


  void addElement(String client, String invoice, String article, int price, int amount);

  String[] loadElements(String client, String invoice);

}
