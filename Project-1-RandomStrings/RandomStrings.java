// NAME: Nandini Patel
//CLASS: CPSC 200
//DATE: 02/10/2022 - version A, 02/11/2022 - version B, 02/12/2022 - version C
//VERSION: grade version completed A, B, or C 
//TIME: 2 hours 50 minutes
//STATUS: I had a difficult time in outputing a string that exchanges letters at the random number position. That section was the only section that took the longest to complete. I couldn't properly compute the code such that it can exchange the letters since there was an error saying that the output lengths do not match properly. EX: start: 0 end: 2 expected: 7 

import java.util.*;

class RandomStrings {
  public static void main(String[] args) {
    // create random object

    // C version code
    Scanner scan = new Scanner(System.in);
    String myString;
    myString = scan.nextLine();
    System.out.println("the string is: " + myString);

    Random rand = new Random();
    rand.setSeed(100);
    System.out.println(rand.nextInt());

    int num = myString.length();
    int random = (int) (Math.random() * num - 1);
    System.out.println(random);

    System.out.println(myString);
    System.out.println(myString.substring(0, random) + myString.substring(random + 1));

    // B version code
    int random2 = (int) (Math.random() * num - 1);
    int random3 = random2 + 1;
    System.out.println(random2);
    System.out.println(random3);

    System.out.println(myString.substring(random2 + 1, random3 + 1) + myString.substring(0, random2 + 1)
        + myString.substring(random3 + 1));

    // A version code
    StringBuilder sb1 = new StringBuilder(myString);
    System.out.println(sb1.reverse());

    int random4 = (int) (Math.random() * num - 1);
    StringBuilder sb2 = new StringBuilder(myString.substring(random4 + 1));
    System.out.println(random4);
    System.out.print(myString.substring(0, random4+1));
    System.out.println(sb2.reverse());

  }
}