package jw.lab2.invoice;

public class Element {
  String article;
  int price;
  int amount;

  public Element(String article, int price, int amount){
    this.article = article;
    this.price = price;
    this.amount = amount;
  }

  public String getDataString() {
    String info = article + " price: " + price + " amount: " + amount;
    return info;
  }

}
