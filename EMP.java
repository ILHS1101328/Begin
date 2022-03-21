import java.util.*;
import java.util.Random.*;
// The EMP class will contain static void main() and all the other static
// methods that make up your "program" - like our earlier programs where
// we weren't defining our own custom objects. Your code here will USE
// objects created by your MathProblem class.

class EMP {
  
  public static void main(String[] args) {
    Scanner Console = new Scanner(System.in);
    introduction();
    int quizBegin;
    }
  
  public static void introduction() { 
    System.out.println("Welcome to the EMP! (Elementary Math Program)");
    System.out.println("This program allows you to take a series of quizzes");
    System.out.println("with a mix of addition, subtraction, multiplication,");
    System.out.println("and division problems. It will keep track of your");
    System.out.println("scores on each quiz, and give you a summary of your");
    System.out.println("results at the end. Good skill!");
    System.out.println();
  }

  // MathProblem quizBegin = new MathProblem();
  
  static int quizBegin(int numberQuiz, Scanner Console) {
    System.out.print("Quiz #" + numberQuiz + ": Number of correct answers required? ");
    int requiredCorrect = Console.nextInt();
    return requiredCorrect;

  }
  
    
  }
