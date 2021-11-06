package jw.lab2.invoice;

import java.util.Scanner;

public class Prompt {

  Scanner inputReader;
  IDatabaseAdapter database;

  public Prompt(IDatabaseAdapter database) {
    inputReader = new Scanner(System.in);
    this.database = database;
  }

  public void input() {
    String client;
    System.out.print("Insert name of client: ");
    client = inputReader.next();
    input(client);

  }

  public void input(String client) {
    

    String invoice;
    System.out.print("Insert name of invoice: ");
    invoice = inputReader.next();

    int articlesNumber;
    System.out.print("Choose number of articles: ");
    articlesNumber = inputReader.nextInt();

    String name;
    int price;
    int amount;

    for (int i = 0; i < articlesNumber; i++){
      System.out.print("Enter article name: ");
      name = inputReader.next();
      System.out.print("Enter article price: ");
      price = inputReader.nextInt();
      System.out.print("Enter article amount: ");
      amount = inputReader.nextInt();
      database.addElement(client, invoice, name, price, amount);
    }
    
  }
 
}
