import java.util.Scanner;

class Lesson1_3 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Input a double");
    double x = scan.nextDouble();
    System.out.println("Do It again");
    double y = scan.nextDouble();

    System.out.println(y + "        " + x); 
  
  }
}
