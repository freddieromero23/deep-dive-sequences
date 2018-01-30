package edu.cnm.deepdive.recursion;

public class Fibonacci {

  public static long rabbits(int generation) {
    if (generation <= 0) {
      return 0;
    }
    if (generation == 1) {
      return 1;
    }
    return rabbits(generation - 1) + rabbits(generation - 2);
  }

}
