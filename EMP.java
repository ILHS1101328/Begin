import java.util.*;
class EMP {
  public static void main(String[] args) {
    Scanner Console = new Scanner(System.in);
    Random rand = new Random();
    // Introduction method
    introduction();
    // Summary method
    summary();
  }
  // introduction method defined
  // explains the point of the code 
  // prints once
  public static void introduction() {
    System.out.println("Welcome to the EMP! (Elementary Math Program)");
    System.out.println("This program allows you to take a series of quizzes");
    System.out.println("with a mix of addition, subtraction, multiplication,");
    System.out.println("and division problems. It will keep track of your");
    System.out.println("scores on each quiz, and give you a summary of your");
    System.out.println("results at the end. Good skill!");
    System.out.println();
  }

  // required correct gets info from constructer
  // then returns the required
  public requiredCorrectMethod(int numberQuiz, Scanner Console) {
    System.out.print("Quiz #" + numberQuiz + ": Number of correct answers required? ");
    int requiredCorrect = Console.nextInt();
    if (requiredCorrect > 0) {
      return requiredCorrect;
    }
  }
  // method that gets the question
  public getQuestion(int numberQuiz, int number1, int number2, Scanner Console) {
    while (numberQuiz ) {
      
    }
  }
  // after questions are answered print the results that include the % and the attempts compared to questions
  public quizresults() {
    
  }


}