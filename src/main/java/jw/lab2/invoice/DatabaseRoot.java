package jw.lab2.invoice;

import java.util.HashMap;

public class DatabaseClients {

  HashMap<String, Client> clients;

  public DatabaseClients() {
    clients = new HashMap<>();
  }

  public void addClient(String client) {
    Client newClient = new Client(client);
    clients.put(client, newClient);
  }

  public String[] loadClients() {
    String[] clientsNames = new String[clients.size()];
    int i = 0;
    for (String cli : clients.keySet()) {
      clientsNames[i] = cli;
      i++;
    }
    return clientsNames;
  }

  public String[] loadInvoices(String client) {
    return clients.get(client).loadInvoices();
  }

  public String[] loadElements(String client, String invoice) {
    return clients.get(client).loadElements(invoice);
  }

  public void addElement(String client, String invoice, String article, int price, int amount) {
    if (clients.containsKey(client) == false) {
      addClient(client);
    }
    clients.get(client).addElement(invoice, article, price, amount);
  }

}
