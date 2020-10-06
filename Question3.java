import java.util.Scanner;

class Lesson1_3 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Java is a programming language, true or false?");
    boolean x = scan.nextBoolean();
    System.out.println("Only numbers can be stored by variables in Java, true or false?");
    boolean y = scan.nextBoolean();
    System.out.println("There are only 2 possible values which can be held by a boolean variable, true or false?");
    boolean z = scan.nextBoolean();

    System.out.println("Question 1 - Your answer: " + x + ". Correct answer: true");  
    System.out.println("Question 2 - Your answer: " + y + ". Correct answer: false");  
    System.out.println("Question 1 - Your answer: " + z + ". Correct answer: true");  
  
  }
}
