//Nandini Patel
//Programming Exam #3
//I was unable to name the class for this code as ArrayList as it showed me errors within the code of line 43. Therefore, I had to name the class Arrays. I hope you can excuse this slight issue. 
import java.util.*;

class Arrays {
  public static void main(String[] args) {
    
    //read in 30 next ints
    Scanner scan = new Scanner(System.in);
    int n1 = scan.nextInt();
    int n2 = scan.nextInt();
    int n3 = scan.nextInt();
    int n4 = scan.nextInt();
    int n5 = scan.nextInt();
    int n6 = scan.nextInt();
    int n7 = scan.nextInt();
    int n8 = scan.nextInt();
    int n9 = scan.nextInt();
    int n10 = scan.nextInt();
    int n11 = scan.nextInt();
    int n12 = scan.nextInt();
    int n13 = scan.nextInt();
    int n14 = scan.nextInt();
    int n15 = scan.nextInt();
    int n16 = scan.nextInt();
    int n17 = scan.nextInt();
    int n18 = scan.nextInt();
    int n19 = scan.nextInt();
    int n20 = scan.nextInt();
    int n21 = scan.nextInt();
    int n22 = scan.nextInt();
    int n23 = scan.nextInt();
    int n24 = scan.nextInt();
    int n25 = scan.nextInt();
    int n26 = scan.nextInt();
    int n27 = scan.nextInt();
    int n28 = scan.nextInt();
    int n29 = scan.nextInt();
    int n30 = scan.nextInt();
    
    //create ArrayList 
    ArrayList<Integer> array = new ArrayList<Integer>();
    
    //add all scanned ints into ArrayList
    array.add(n1);
    array.add(n2);
    array.add(n3);
    array.add(n4);
    array.add(n5);
    array.add(n6);
    array.add(n7);
    array.add(n8);
    array.add(n9);
    array.add(n10);
    array.add(n11);
    array.add(n12);
    array.add(n13);
    array.add(n14);
    array.add(n15);
    array.add(n16);
    array.add(n17);
    array.add(n18);
    array.add(n19);
    array.add(n20);
    array.add(n21);
    array.add(n22);
    array.add(n23);
    array.add(n24);
    array.add(n25);
    array.add(n26);
    array.add(n27);
    array.add(n28);
    array.add(n29);
    array.add(n30);
    
    //calculate average of all num and print
    //use double for average 
    double average = (double) (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10 + n11 + n12 + n13 + n14 + n15 + n16 + n17 + n18 + n19 + n20 + n21 + n22 + n23 + n24 + n25 + n26 + n27 + n28 + n29 + n30) / 30;
    System.out.println(average);
    
    //remove Nth temp and set equal to out of bound num
    for(int N=0; N < array.size(); N++){
      if (N % 2 == 0){
        array.set(N,-99999);
      }
    }
    
    //remove out of bound num and print new ArrayList
     int index = 0;
     while(index < array.size()){
        if(array.get(index)== -99999){
          array.remove(index);
          index++;
         }
      }
   System.out.println(array);

    //find temps > average and print 
    if(n1 > average){
      System.out.println(n1);
    }
    if(n2 > average){
      System.out.println(n2);
    }
    if(n3 > average){
      System.out.println(n3);
    }
    if(n4 > average){
      System.out.println(n4);
    }
    if(n5 > average){
      System.out.println(n5);
    }
    if(n6 > average){
      System.out.println(n6);
    }
    if(n7 > average){
      System.out.println(n7);
    }
    if(n8 > average){
      System.out.println(n8);
    }
    if(n9 > average){
      System.out.println(n9);
    }
    if(n10 > average){
      System.out.println(n10);
    }
    if(n11 > average){
      System.out.println(n11);
    }
    if(n12 > average){
      System.out.println(n12);
    }
    if(n13 > average){
      System.out.println(n13);
    }
    if(n14 > average){
      System.out.println(n14);
    }
    if(n15 > average){
      System.out.println(n15);
    }
    if(n16 > average){
      System.out.println(n16);
    }
    if(n17 > average){
      System.out.println(n17);
    }
    if(n18 > average){
      System.out.println(n18);
    }
    if(n19 > average){
      System.out.println(n19);
    }
    if(n20 > average){
      System.out.println(n20);
    }
    if(n21 > average){
      System.out.println(n21);
    }
    if(n22 > average){
      System.out.println(n22);
    }
    if(n23 > average){
      System.out.println(n23);
    }
    if(n24 > average){
      System.out.println(n24);
    }
    if(n25 > average){
      System.out.println(n25);
    }
    if(n26 > average){
      System.out.println(n26);
    }
    if(n27 > average){
      System.out.println(n27);
    }
    if(n28 > average){
      System.out.println(n28);
    }
    if(n29 > average){
      System.out.println(n29);
    }
    if(n30 > average){
      System.out.println(n30);
    }
    
  }
}