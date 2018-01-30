package edu.cnm.deepdive.iteration;

import java.math.BigInteger;

public class Fibonacci {

  public static BigInteger rabbits(int generation) {
    BigInteger prev = BigInteger.ONE;
    BigInteger current = BigInteger.ZERO;
    for (int i = 0; i < generation; i++) {
      BigInteger temp = prev.add(current);
      prev = current;
      current = temp;
    }
    return current;
  }

}
