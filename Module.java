public class Module {
  private int mass;

  public Module(int m) {
    mass = m;
  }

  // recursively calculate required fuel
  public int totalRequiredFuel(int totalFuel) {
    if (totalFuel <= 0) // base case
      return 0;
    else
      return totalFuel + totalRequiredFuel(totalFuel/3-2);
  }
}
