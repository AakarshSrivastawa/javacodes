import java.util.Scanner;

class exception.handling_2 extends Exception {
  public InterviewException(String errorMessage) {
    super(errorMessage);
  }
}

public class interviewexception {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Enter your name: ");
      String name = scanner.nextLine();
      if (name.isEmpty()) {
        throw new InterviewException("Name cannot be empty.");
      }

      System.out.print("Enter your age: ");
      int age = scanner.nextInt();
      if (age < 18) {
        throw new InterviewException("You are not eligible for this interview.");
      }

      System.out.print("Enter your email address: ");
      String email = scanner.next();
      if (!email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
        throw new InterviewException("Invalid email address.");
      }

      System.out.print("Enter your phone number: ");
      String phone = scanner.next();
      if (!phone.matches("\\d{10}")) {
        throw new InterviewException("Invalid phone number.");
      }

      System.out.println("Interview details:");
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Email: " + email);
      System.out.println("Phone: " + phone);
    } catch (InterviewException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      scanner.close();
    }
  }
}
