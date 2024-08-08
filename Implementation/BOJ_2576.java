import java.util.Scanner;

public class BOJ_2576 {

  public static int COUNT = 7;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int minOdd = Integer.MAX_VALUE;
    int numOfOdd = 0;
    int sumOfOdd = 0;

    for(int i = 0; i < COUNT; i++) {
      int tmp = sc.nextInt();
      if(isOdd(tmp)) {
        if(tmp < minOdd) {
          minOdd = tmp;
        }
        sumOfOdd += tmp;
        numOfOdd++;
      }
    } 

    if(numOfOdd == 0) {
      System.out.println(-1);
      return;
    }

    System.out.println(sumOfOdd);
    System.out.println(minOdd);
    
  }

  public static boolean isOdd(int n) {
    return (n % 2 != 0);
  }
}