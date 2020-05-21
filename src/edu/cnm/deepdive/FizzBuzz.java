package edu.cnm.deepdive;

public class FizzBuzz {

  public static void main(String[] args)  {
    for (int counter = 1; counter < 100; counter++)  {   //Repeat from 1 to 100
      String status = getStatus(counter);
      System.out.println(status);

      }
      }

  static String getStatus(int counter) {
    String status = "";
    //  --Check whether the current counter value is fizz, buzz, or both.
    //  --Print the number, or fizz, or buzz, or fizzbuzz, as appropriate.
    boolean counterIsFizz = (counter % 3 == 0);
    boolean counterIsBuzz = (counter % 5 == 0);
    counterIsBuzz = (counter % 5 == 0);
    // TODO Compute and assign boolean values to counterIsFizz and counterIsBuzz, based on whether
    //  counter is divisible by 3 and 5
//       if (counter % 3 == 0)  {               == compares left and right, = means one is equal to another
//          counterIsFizz = true;
//       } else {
//          counterIsFizz = false;

    //TODO Print the number, or fizz, or buzz, or fizzbuzz, as appropriate.
    // If counterIsFizz and counterisBuzz, print fizzbuzz;
    //   otherwise, if counterIsFizz, then print fizz;
    //   otherwise, if counterIsBuzz, then print buzz;
    //   otherwise, print counter.
    if (counterIsFizz) {
       status += "fizz";  //System.out.println("fizz");
    }
    if (counterIsBuzz) {
       status += "buzz";   //System.out.println("buzz");
    }
    if (status.isEmpty()){
       status += counter;  //System.out.println(counter);
    }
    return status;
  }


}

