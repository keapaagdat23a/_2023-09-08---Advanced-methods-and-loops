public class OverloadingDemo {
  public static void main(String[] args) {
    new OverloadingDemo().run();
  }

  private void run() {
    println("Hey you");
    println(3);
    createPerson("Patty");
    createPerson("Patty", 2000);
  }

  private void createPerson(String text, int i) {
    System.out.printf("%nCreating %s, born in %d", text, i);
  }

  private void createPerson(String text) {
    System.out.printf("%nCreating %s, born in unknown year", text);
  }

  void println(String text) {
    System.out.println("[" + text + "]");
  }

  void println(int i) {
    System.out.println("[" + i + "]");
  }
}

