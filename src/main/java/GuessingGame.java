public class GuessingGame {
    public static void main(String[] args) {
      // first give out an error message stating the minimum type of arguments
      /*if (args.length != 2) {
        System.out.println("Usage: java Hangman <item type> <max number>");
        System.err.println("Please provide the correct arguments");
        System.exit(1);
      }*/
      
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
