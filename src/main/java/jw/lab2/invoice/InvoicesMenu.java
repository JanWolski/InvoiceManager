package jw.lab2.invoice;

public class InvoicesMenu extends Menu {

  private String client;
  private Prompt prompt;

  public InvoicesMenu(IDatabaseAdapter database, Menu parentMenu) {
    super(database, parentMenu);
    prompt = new Prompt(database);
  }

  public void addRecord() {
    prompt.input(client);
    loadMenu();
  }

  public void loadRecords(String arg) {
    client = arg;
    records = database.loadInvoices(client);
  }

  public void selectRecord(String arg) {
    database.loadInvoices(client);
  }
}
