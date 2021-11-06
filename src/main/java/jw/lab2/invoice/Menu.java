package jw.lab2.invoice;

import java.util.Scanner;

public abstract class Menu {

  Menu parentMenu;
  IDatabaseAdapter database;

  Scanner inputReader;
  String[] records;

  public Menu(IDatabaseAdapter database, Menu parentMenu) {
    this.database = database;
    this.parentMenu = parentMenu;
    inputReader = new Scanner(System.in);
  }

  public abstract void addRecord();

  public abstract void loadRecords(String arg);

  public abstract void selectRecord(String arg);

  public void loadMenu() {
    loadMenu(null);
  }
  
  public void loadMenu(String arg) {
    loadRecords(arg);
    showMenu();
  }

  public void showMenu() {
    printRecords();
    input();
  }

  public void printRecords() {
    for (int i = 0; i < records.length; i++) {
      System.out.println(Integer.toString(i + i) + ") " + records[i]);
    }
    System.out.println("\n0) Add record.");
    if (parentMenu != null) {
      System.out.println("\n-1) Go back.");
    }
  }

  public void input() {
    int option = inputReader.nextInt();
    if (option == 0) {
      addRecord();
    } else if (option == -1 && parentMenu != null) {
      goBack();
    } else {
      selectRecord(records[option - 1]);
    }
  }

  public void goBack() {
    parentMenu.showMenu();
  }

}
