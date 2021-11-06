package jw.lab2.invoice;

public class MenuInvoices extends Menu {

  private String client;
  private Prompt prompt;

  public MenuInvoices(IDatabaseAdapter database, Menu parentMenu) {
    super(database, parentMenu);
    prompt = new Prompt(database);
    header = "===Invoice===";
  }

  public void addRecord() {
    prompt.input(client);
    loadMenu();
  }

  public void loadRecords(String... arg) {
    client = arg[0];
    header = "===" + client + " invoices===";
    records = database.loadInvoices(client);
  }

  public void selectRecord(String arg) {
    database.loadInvoices(client);
  }
}
