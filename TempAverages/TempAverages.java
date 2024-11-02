import java.util.Scanner;
class TempAverages {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    double d1, d2, d3, d4, d5, d6, d7;
    d1 = scan.nextDouble();
    d2 = scan.nextDouble();
    d3 = scan.nextDouble();
    d4 = scan.nextDouble();
    d5 = scan.nextDouble();
    d6 = scan.nextDouble();
    d7 = scan.nextDouble();
    double averageOddDays = (d1 + d3 + d5 + d7) / 4;
    double averageEvenDays = (d2 + d4 + d6) / 3;
    
    System.out.println(String.format("%.2f",averageEvenDays) + " " + String.format("%.2f", averageOddDays));
  }
}