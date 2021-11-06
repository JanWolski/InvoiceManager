package jw.lab2.invoice;

public class ClassDatabaseAdapter implements IDatabaseAdapter {
  DatabaseClients database;

  public ClassDatabaseAdapter() {
    database = new DatabaseClients();
  }

  @Override
  public void addClient(String client) {
    database.addClient(client);
  }

  @Override
  public String[] loadClients() {
    return database.loadClients();
  }

  @Override
  public void addInvoice(String client, String invoice) {
    database.addInvoice(client,invoice);
      
  }

  @Override
  public String[] loadInvoices(String client) {
    return database.loadInvoices(client);
  }
  
  @Override
  public void addElement(String client, String invoice, String article, int price, int amount){
    database.addElement(client, invoice, article, price, amount);
  }
  
  @Override
  public String[] loadElements(String client, String invoice){
    return database.loadElements(client, invoice);
  }

}
