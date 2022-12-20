package collection;

import java.util.List;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {

private static double computePower(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return ((x * 2) + 3) * computePower(x, n - 1);
        }
    }

  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) {
    return input.map(x -> computePower(x, 5));
  }

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) {
     return input.flatMap(s -> List.of(s.substring(0, 1).toUpperCase() + s.substring(1), s));
  }

}
