/*
 *  Jordan Chou
 *  December 20, 2019
 *  Advent of Code: Day 1
 */

public class Module {
  private int mass;

  public Module(int m) {
    mass = m;
  }

  public int getMass() {
    return mass;
  }

  // recursively calculate required fuel
  public int totalRequiredFuel(int totalFuel) {
    if (totalFuel <= 0) // base case
      return 0;
    else
      return totalFuel + totalRequiredFuel(totalFuel/3-2);
  }
}
