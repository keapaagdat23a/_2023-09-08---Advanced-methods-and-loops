package prep;

import java.util.Scanner;

public class NestedForDemo {
  int energyLevel = 50;
  int happiness = 50;
  int motivationLevel = 50;

  public static void main(String[] args) {
    new NestedForDemo().run();
  }

  private void run() {
    printWelcomeMessage();
    askAboutLevels();
    showChainingDemo();
    // askAboutLevels();
    showNestingDemo();
  }

  private void printWelcomeMessage() {
    System.out.println("\nWELCOME TO NESTING AND CHAINING DEMO\n");
  }

  private void askAboutLevels() {
    Scanner in = new Scanner(System.in);

    System.out.print("What is your energy level (0-100)? ");
    energyLevel = in.nextInt();
    in.nextLine(); // Scanner bug
    System.out.print("What is your happiness level (0-100)? ");
    happiness = in.nextInt();
    in.nextLine(); // Scanner bug
    System.out.print("What is your motivation level (0-100)? ");
    motivationLevel = in.nextInt();
    in.nextLine(); // Scanner bug
    System.out.print("");
  }

  public void showChainingDemo() {

    System.out.println("\nChaining Demo:");
    if (energyLevel >= 50) {
      System.out.println("You have the energy.");
    }
    if (happiness >= 50) {
      System.out.println("You have the happiness.");
    }
    if (motivationLevel >= 50) {
      System.out.println("You have the motivation");
    }
    System.out.println("\nEnd of chaining demo.");
  }

  public void showNestingDemo() {
    System.out.println("\nNesting Demo:");
    if (energyLevel >= 50) {
      System.out.println("You have the energy.");
      if (happiness >= 50) {
        System.out.println("You have the happiness.");
        if (motivationLevel >= 50) {
          System.out.println("You have the motivation");
        }
      }
    }
    System.out.println("\nEnd of nesting demo.");
  }
}
