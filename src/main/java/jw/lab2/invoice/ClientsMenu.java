package jw.lab2.invoice;

import java.util.Scanner;


public class ClientsMenu extends Menu {

  private Menu invoiceMenu;
  private Prompt prompt;

  public ClientsMenu(IDatabaseAdapter database, Menu parentMenu) {
    super(database, parentMenu);
    prompt = new Prompt(database);
    invoiceMenu = new InvoicesMenu(database, this);
  }

  public void addRecord() {
    prompt.input();
    loadMenu();
  }

  public void loadRecords(String arg) {
    records = database.loadClients();
  }

  public void selectRecord(String arg) {
    invoiceMenu.loadMenu(arg);
  }
}