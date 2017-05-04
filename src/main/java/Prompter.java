import java.util.Scanner;

public class Prompter {
  public Jar initJar () {
    String itemName;
    int maxItemsNum;
    
    
    Scanner scanner = new Scanner(System.in); 
    System.out.println("What type of item");
    itemName = scanner.nextLine();
    System.out.printf("What is the maximum amount of %s?%n", itemName);
    maxItemsNum = scanner.nextInt();
    
    Jar newJar = new Jar(itemName, maxItemsNum);
    return newJar;
  }
  
  public void showInitialMessage(Jar jar) {
  //DEBUG
  //System.out.printf("This jar has %d items%n", jar.getNumberOfItems());
   System.out.printf("How many %s are in the jar? Pick a number between 1 and %d.%n", 
                    jar.getItemName(),
                    jar.getMaxItemsNum()); 
  }
  
  public int askGuess(Jar jar) {
    int guess;    
    Scanner scanner = new Scanner(System.in); 
    System.out.println("What's your guess, stranger?");
    guess = scanner.nextInt();    
    return guess;
  }
  
  public void checkGuess(Jar jar, int guess) {
    if (guess > jar.getMaxItemsNum()) {
      System.out.printf("Your guess must be less than %d.", jar.getMaxItemsNum());
    } else {
      jar.incrementTries();
      if (!jar.isWon(guess)) {
          System.out.println("Ooops, try again"); 
          if (guess > jar.getNumberOfItems()) {
            System.out.println("Your guess is too high"); 
          } else {
            System.out.println("Your guess is too low"); 
          }
        } 
    }
  }
  
  public void showResult(Jar jar) {
      if (jar.getTries() > 1) {
        System.out.printf("You got it in %d attempts%n", jar.getTries());
      } else {
        System.out.printf("You got it in %d attempt%n", jar.getTries());
      }

  }
  
  
  

      
    
}