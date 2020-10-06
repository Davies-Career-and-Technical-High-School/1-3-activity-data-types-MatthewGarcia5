import java.util.Scanner;

class Lesson1_3 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("What is your name?");
    String x = scan.nextLine();
    System.out.println("Hi " + x + ", how old are you?");
    int y = scan.nextInt();

    System.out.println(x + " is " + y + " years old."); 
  
  }
}
