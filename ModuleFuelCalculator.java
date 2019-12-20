/*
 *  Jordan Chou
 *  December 20, 2019
 *  Advent of Code: Day 1
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class ModuleFuelCalculator {
  public static void main(String[] args) {
    int sumOfFuel = 0;
    Scanner scanner = null;

    try {
      // Open file
      scanner = new Scanner(new File("weight.txt"));

      //Read each line and add to sum
      while (scanner.hasNextLine()) {
        sumOfFuel += Integer.parseInt(scanner.nextLine())/3 - 2;
      }
    }
    catch (IOException ex) {
      System.err.println("An IOException was caught");
      ex.printStackTrace();
    }
    finally {
      // Close the file
        scanner.close();
    }

    System.out.println("The sum of fuel required for all modules is " + sumOfFuel);
  }
}
