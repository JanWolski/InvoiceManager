package jw.lab2.invoice;

HashMap <String,Client> clients;

public class ClientDatabase {

    public void addClient(String client) {
      Client newClient = new Client(client)
      clients.put(client, newClient);
    }
  
    public String[] loadClients() {
      String[] clientsNames = new String[clients.length];
      int i = 0;
      for (String cli : clients.keySet()) {
        clients[i] = cli;
        i++;
      }
      return clientsNames;
    }
  
    public void addInvoice(String client, String invoice) {
      clients[client].addInvoice(invoice);
        
    }
  
    public String[] loadInvoices(String client) {
      return clients[client].loadInvoices();
    }
    
    public void addElement(String client, String invoice, String article, int price, int amount){
      clients[client].addElement(invoice, article, price, amount);
    }
    
    public String[] loadElements(String client, String invoice){
      return clients[client].loadElements(invoice);
    }
}
