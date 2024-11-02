import java.util.Scanner;
class CharLoop {
  public static void main(String[] args) {
    //C version//
    
    //read in string
    Scanner scan = new Scanner(System.in);
    String myString = scan.nextLine();
    //set all variable to 0
    int countVowels = 0, countUpper = 0, countDigit = 0, countWhiteSpace = 0;
    //for loop for all variables
    for(int i = 0; i < myString.length(); i++){
      if(myString.charAt(i) == 'A' || myString.charAt(i) == 'a'){
        countVowels++;
      }
      if(myString.charAt(i) == 'E' || myString.charAt(i) == 'e'){
        countVowels++;
      }
      if(myString.charAt(i) == 'I' || myString.charAt(i) == 'i'){
        countVowels++;
      }
      if(myString.charAt(i) == 'O' || myString.charAt(i) == 'o'){
        countVowels++;
      }
      if(myString.charAt(i) == 'U' || myString.charAt(i) == 'u'){
        countVowels++;
      }
      if(Character.isUpperCase(myString.charAt(i))){
        countUpper++;
      }
      if(Character.isDigit(myString.charAt(i))){
        countDigit++;
      }
      if(Character.isWhitespace(myString.charAt(i))){
        countWhiteSpace++;
      }
    }
    //output vowels
    System.out.println("vowels = " + countVowels);
    //output uppercase characters
    System.out.println("upper = " + countUpper);
    //output digits
    System.out.println("digits = " + countDigit);
    //output whitespace
    System.out.println("whitespace = " + countWhiteSpace);

    
    //B version//
    
    //set all vowel variables to 0
    int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0, maxVowelCount = 0;
    String maxVowel = " ";
    //for loop to max vowel count
    for(int i = 0; i < myString.length(); i++){
      if(myString.charAt(i) == 'A' || myString.charAt(i) == 'a'){
        countA++;
      }
      if(myString.charAt(i) == 'E' || myString.charAt(i) == 'e'){
        countE++;
      }
      if(myString.charAt(i) == 'I' || myString.charAt(i) == 'i'){
        countI++;
      }
      if(myString.charAt(i) == 'O' || myString.charAt(i) == 'o'){
        countO++;
      }
      if(myString.charAt(i) == 'U' || myString.charAt(i) == 'u'){
        countU++;
      }
      if(countA > maxVowelCount){
        maxVowelCount = countA;
        maxVowel = "a";
      }
      if(countE > maxVowelCount){
        maxVowelCount = countE;
        maxVowel = "e";
      }
      if(countI > maxVowelCount){
        maxVowelCount = countI;
        maxVowel = "i";
      }
      if(countO > maxVowelCount){
        maxVowelCount = countO;
        maxVowel = "o";
      }
      if(countU > maxVowelCount){
        maxVowelCount = countU;
        maxVowel = "u";
      }
    }
    //output max vowel count
    System.out.println("vowel " + maxVowel + " occurs the most = " + maxVowelCount);

  }
}