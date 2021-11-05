package jw.lab2.invoice;

public class ClientsMenu extends Menu {

  private Menu invoiceMenu;

  public ClientsMenu(IDatabaseAdapter database, Menu parentMenu) {
    super(database, parentMenu);
    invoiceMenu = new InvoiceMenu(database, this);
  }

  public void addRecord() {
    database.addClient("Client");
  }

  public void loadRecords(String arg) {
    records = database.loadClients();
  }

  public void selectRecord(String arg) {
    invoiceMenu.loadMenu(arg);
  }
}