package jw.lab2.invoice;

import java.util.Scanner;

/**
 * Main class, launches program, manages user interactions.
 */
public class UserInterface {
  
  private Menu menu;
  private IDatabaseAdapter database;
  
  
  UserInterface() {
    database = new ClassDatabaseAdapter();
    menu = new ClientsMenu(database, null);
  }
  
  /**
   * Starts program.
   */
  public void start() {
    System.out.println("Invoice Manager copyright (c) 2021 Jan Wolski");
    menu.loadMenu();
  }
  
  public static void main(String[] args) {
    UserInterface userInterface = new UserInterface();
    userInterface.start();
  }
}
