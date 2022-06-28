import java.util.Arrays;



public class StringRunner {
  public static void main(String[] args) {
    Integer[] inputInt = { 1, 2, 3 };
    String[] inputStr = { "Cake", "Donut", "Cupcake" };

    System.out.println(Problem.convertToString(inputInt)); // [1, 2, 3]
    // System.out.println(Problem.convertToString(inputStr)); // [Cake, Donut,
    // Cupcake]
  }
}

class Problem {
  // declare the convertToString method here
  public static <E> String convertToString(E[] array){
    return Arrays.toString(array);
  }
}
