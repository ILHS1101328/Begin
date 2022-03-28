// Goals

import java.util.*;
class MathProblem {
  Random rand = new Random();
  Scanner Console = new Scanner(System.in);
  // Private int number quiz
  private int numberQuiz;
  // Private int required correct
  private int requiredCorrect;
  // Private int number correct
  private int numberCorrect;
  // private boolean correct
  private boolean correct;
  // private boolean false
  private boolean incorrect;
  // private int attempts
  private int numberAttempts;
  // private int questions asked
  private int questionsAsked;
  // private double final percent
  private double finalPercent;
  // private boolean retake
  private boolean retake;
  // type constructer below
  
  // public method that recieves the required correct
  // re-asks the question if input for required correct is < 0
  public void requiredCorrectMethod(int numberQuiz, int requiredCorrect) {
    this.numberQuiz = this.numberQuiz + 1;
    this.requiredCorrect = this.requiredCorrect;
    while (requiredCorrect <= 0) {
      System.out.print("Must be > 0. Number of correct answers required? ");
      requiredCorrect = Console.nextInt();
    } 
  }
  // public static method that returns the question
  // for each question even reasked question add to the variables
  // such as correct, incorrect, 
  public getQuestion(int requiredCorrect, int numberCorrect, int numberQuiz, random rand) {
    this.numberCorrect = this.numberCorrect;
    while (requiredCorrect <= numberCorrect && numberQuiz == 1) {
      int number1 = rand.nextInt();
      int number2 = rand.nextInt();
      int equationtype = rand.nextInt();
      if (equationtype == 1) {
        int answer = number1 + number2;
        System.out.print(number1 + "+" + number2 + "= ? ");
      } else {
        int answer = number1 - number2;
        System.out.print(number1 + "-" + number2 + "= ? ");
      }
    }
    return;
  }
  // public method that comapares the input to the exact answer
  // the input compared to the to the answer will return to a certain feeback that will be printed 
  public compareAnswer() {

    return;
  }
  // inside of it is a random int that determines a random println
  // private method that chooses good feedback
  public goodfeedback(Random rand, int numberCorrect) {
    int gf = rand.nextInt(5);
    if (gf == 1) {
      System.out.print("Correct! You did");
    }
    if (gf == 2) {
      System.out.print("Correct! ");
    }
    if (gf == 3) {
      System.out.print("Correct! ");
    }
    if (gf == 4) {
      System.out.print("Correct! ");
    }
    if (gf == 5) {
      System.out.print("Correct! ");
    }
    
  }
  // method that gives incorrect feedback is answer is wrong
  public badfeedBack(Random rand) {
  int bfeed = rand.nextInt();
    return String ;
  }
  // method that prints the results after quiz is complete
  public quizResults() {
    
  }

  // method that determines wether to retake the quoz
  public boolean retake() {
  this.retake = this.retake;
  return retake;
    }
  //method that prints resualts overall
  public overallResults(int finalPecent, int att) {
    
  }
}
    





// // The MathProblem class will contain the fields, constructor, and
// // instance methods that define the state and behavior of a
// // MathProblem object.

// // Questions :
// //
// //
// //
// //
// // Import the random file
// import java.util.*;
// // REMEBER TO GO BACK AND READ OVER THE ROCK PAPER SCISSORS ASSIGNMENT TO LEARN HOW PRINTS WORK USING RANDOM
// // REVEIW CAR CLASS FORMAT AND USE THAT AS A BASE FOR FORMATTING
// class MathProblem {
//   Random rand = new Random();

// // Create a private int for the following
// // quizNumber - keeps track of the number of quizs taken
//   private int quizNumber;
// // requiredCorrect - recieves its value from input, if required correct is equal to the number correct then end
//   private int requiredCorrect;
// // numberCorrect - has +1 to it if a question is answered correctly
//   private int numberCorrect;
// //
//   private boolean correct;
// // numberAttempts - everytime a answer is input to a question it has +1 to it (this counts for re-asked questions)
//   private int numberAttempts;
// // questionsAsked - each time a question is asked (even if it is re-asked) has +1 to it as well as it is printed at the end
//   private int questionsAsked;
// // final percent - in end of quiz results which is also gonna be used at very end of the code
//   private double finalPercent;
// // private boolean that checks to see if reatake is wanted
//   private boolean retake = true;

//   // constructer
//   private 
  
// // a public static void that holds a if statements that says, while required correct is <= 0 re-ask the question
//   // along with a specific message explaining why this error is showing up
//   public static void quizBegin(int numberQuiz, int requiredCorrect) {
//     while (requiredCorrect <= 0) {
//       throw new IllegalArgumentException("Must be > 0. Number of correct answers required? ");
      
//     }
//   }
// // a privite method that has no param's and returns a string with mathproblems question

//   // getquestion (random) along with a method that checks the number of test and then from there that determines the level of math being done such as Level 1 being random + and - along with random numbers 1 to 10 Level 2 being random x and / ranging from large numbers 
//   // a while loop containing 3 random ints, type of equation, 
//   private static void getQuestion(int numberQuiz,int requiredCorrect, int numberCorrect, Random rand) {
//     while (numberQuiz == 1 && numberCorrect < requiredCorrect) {
//       int num1 = rand.nextInt((10) + 1);
//       int num2 = rand.nextInt((4) + 1);
//       int type = rand.nextInt(2);
//       if (type == 1) {
//         int answer = num1 + num2;
//         System.out.print(num1 + "+" + num2 + "= ? ");
//       } else {
//         int answer = num1 - num2;
//         System.out.print(num1 + "-" + num2 + "= ? ");
//       }
//     }
//     while (numberQuiz == 2 && numberCorrect < requiredCorrect) {
//       int num1 = rand.nextInt((50) + 1);
//       int num2 = rand.nextInt((1) + 1);
//     }
//   }
//     // while quiz number is = to 1, use only - & + 
//       // 2 random int variables that follow the first test number requirements
//       // this effects the range of each number for instince it starts simply
//     // while quiz number is = to 2 use only x & /
//       // 2 random ints that follow quiz two 
  
// // a private method that checks the the question and finds the answer to the random equation
  
//     // gets the answer to comare to the input answer w

  
// // a private method that compares the input answer to the real answer and returns true if correct and false if incorrect (boolean)

// // figure a way to add the feedback //

// // REMEBER TO ADD THE ATTEMPTS AND THE NUMBER OF CORRECT //

// // a private method that checks to see if a answer is correct or false and depending on that it decides a appropiate feedback println (random)

// // a private method that checks to see if it was answered correct and if so continue to the next question

// // a method that compares the amount of required to correct and the and the numbered answered correctly
//   // if they they are equal print the quiz end results along with a method put above that gets the perecent out of 100% that the person got 

// // a private method that prints all of the nessacery ints needed to check every box of the results
//   // this is the results for every quiz taken
// }