package jw.lab2.invoice;
public class MenuElements extends Menu {

  private String client;
  private String invoice;
  private Prompt prompt;

  public MenuElements(IDatabaseAdapter database, Menu parentMenu) {
    super(database, parentMenu);
    prompt = new Prompt(database);
    header = "===Invoice===";
  }

  public void addRecord() {
    prompt.input(client);
    loadMenu();
  }

  public void loadRecords(String... args) {
    client = args[0];
    invoice = args[1];
    header = "===" + client + " invoices===";
    records = database.loadInvoices(client);
  }

  public void selectRecord(String arg) {
    database.loadInvoices(client);
  }
}
