// The MathProblem class will contain the fields, constructor, and
// instance methods that define the state and behavior of a
// MathProblem object.
// Goal: Figure out how to re-print a question when previously answered wrong without creating new question
import java.util.*;
public class MathProblem {
// private Random rand
  private Random rand;
// private int correctAnswer;
  private int correctAnswer;
// private boolean solved;
  private boolean solved;
// constructer for each quiz
  public MathProblem(Random rand) {
    this.rand = rand; }  
// public String getQuestion
// this method creates the question in string form and returns it
// along with this it grabs the correct answer to the string
  public String getQuestion() {
    return "test"; }
// public boolean giveAnswer
// given, not input - answer should be passed via a parameter
// depending on wether they match it will return true or false
// true if it is correct and false if otherwise
// this will then determine the feedback
// throws illegalexception if problem have already been solved
  public void giveAnswer(int questionAnswer) {
  }
// public boolean answeredCorrectly
  public boolean answeredCorrectly() {
    return true; }
// public string feedback
// prints feedback informing the user on if the problem is solved or not
// required 4 different strings for each
// each string must begin with either :
// Correct!
// or 
// Incorrect
// In this helper method use if statements
// after a string of feeback is printed print a new line
// if inccorect, on a new line below it print try again... then the new line
  public String getFeedback() {
    return ""; }
 }