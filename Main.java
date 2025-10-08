class Add {
  public int add(int a, int b) {
    return a + b;
  }

  public double add(double a, double b) {
    return a + b;
  }
}

public class Main {
  public static void main (String[] args) {
    Add a1 = new Add();
    int result = a1.add(5,10);
    System.out.println("Sum: " + result);
  } 
}