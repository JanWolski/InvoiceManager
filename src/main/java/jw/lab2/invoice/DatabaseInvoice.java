package jw.lab2.invoice;

import java.util.HashMap;

public class Invoice {
  HashMap<String, Element> elements;

  String name;

  public Invoice(String name) {
    elements = new HashMap<>();
    this.name = name;
  }

  public void addElement(String article, int price, int amount) {
    Element newElement = new Element(article, price, amount);
    elements.put(article, newElement);
  }

  public String[] loadElements() {
    String[] elementsData = new String[elements.size()];
    int i = 0;
    for (String elem : elements.keySet()) {
      elementsData[i] = elements.get(elem).getDataString();
    }
    return elementsData;
  }
}
