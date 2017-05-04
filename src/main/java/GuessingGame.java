public class GuessingGame {
    public static void main(String[] args) {    
      Prompter prompter = new Prompter();
      Jar jar = prompter.initJar();
      jar.fill();
      prompter.showInitialMessage(jar);
      int guess;
      do {
        guess = prompter.askGuess(jar);
        prompter.checkGuess(jar, guess);
      } while (!jar.isWon(guess)); 
      prompter.showResult(jar);
    }
}
