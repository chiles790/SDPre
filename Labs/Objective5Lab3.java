import java.util.Scanner;

public class Objective5Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userNum;
    int num2 = 0;

    System.out.println("Please enter a number: ");
    userNum = scanner.nextInt();

    if(userNum >= num2) {
      System.out.println(userNum + " is greater than or equal to " + num2);
    }
    else if(userNum <= num2) {
      System.out.println(userNum + " is less than or equal to " + num2);
    }

    scanner.close();
  }
}
