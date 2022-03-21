// The MathProblem class will contain the fields, constructor, and
// instance methods that define the state and behavior of a
// MathProblem object.
import java.util.Random.*;

class MathProblem {
  
 

  // keeps track of how many quizzes have been taken, starting value is 1
  private int numberQuiz;
  // keeps track of how many questions are required to be correct in order to pass
  // gets its value from input
  
  private int requiredCorrect;
  // keeps track of how many questions have been answered correctly
  // this is important because it signals when the end of a test
  // also is printed at the end of all the quizzes
  private int numberCorrect;
  
  // keeps track of the total amount of questions asked (this counts for re-asked questions)
  // everytime a question answer is inpiuted the value has + 1 to it
  // is used at the end of test and end resaults 
  private int numberQuestions;
  
  // keeps track of all inputed answers and has + 1 to it whenever a answer is inputted
  // is printed at end of quiz aswell as end results 
  private int numberAttempts;
  
  private int questionAsked;
  
  // printed at end results and prints the percent out of 100 that you got in total
  private double percentScore;
  
  // used to work as a way to retake a test 
  // if the user inputs a n then reatke becomes false and prints end results 
  private boolean retakeAnswer = true;
  
  // is used to print a error message if the requried correct is <= 0
  public static void quizBegin(int numberQuiz, int requiredCorrect) {
    if (requiredCorrect <= 0) {
      throw new IllegalArgumentException("Must be > 0. Number of correct answers required? ");
    }
    
  }

  
  
  
}