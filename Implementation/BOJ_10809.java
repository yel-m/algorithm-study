import java.util.Scanner;
import java.util.Arrays;

public class BOJ_10809 {

  public static int NUM_OF_ALPHABET = 26;
  public static int NONE = -1;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();

    String[] alphabets = s.split("");
    int[] indexesOfAlphabet = new int[NUM_OF_ALPHABET];
    Arrays.fill(indexesOfAlphabet, NONE);
    
    for(int i = 0; i <= NUM_OF_ALPHABET; i++) {
      for(int j = 0; j < alphabets.length; j++) {
        if(i + 'a' == alphabets[j].charAt(0) && indexesOfAlphabet[i] == NONE) {
          indexesOfAlphabet[i] = j;
        }
      }
    }

    for(int i = 0 ; i < NUM_OF_ALPHABET; i++) {
      System.out.print(indexesOfAlphabet[i] + " ");
    }
    
    
    
  }
}
