import java.util.Random;

public class Jar {
 private String itemName;
 private final int maxItemsNum;
  private int numberOfItems;
  private int tries;
  
  public Jar(String itemName, int maxItemsNum) {
    this.itemName = itemName;
    this.maxItemsNum = maxItemsNum;
    tries = 0;
  }
  
  public int getNumberOfItems() {
    return this.numberOfItems; 
  }
  
  public String getItemName() {
    return this.itemName; 
  }
  
  public int getMaxItemsNum() {
    return this.maxItemsNum; 
  }
  
  public int getTries() {
    return this.tries; 
  }
  
  public void fill() {
      Random random = new Random();
      this.numberOfItems = random.nextInt(maxItemsNum)+1;
  }
  
  public boolean isWon(int guess) {
    return guess == this.numberOfItems;
  }
  
  public void incrementTries() {
    this.tries++;
  }
  

  

} 