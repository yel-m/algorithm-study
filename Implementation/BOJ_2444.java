import java.util.Scanner;

public class BOJ_2444 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for(int i = n; i > 0; i--) {
      for(int j = 0; j < i-1; j++) {
        System.out.print(" ");
      }
      for(int j = 0; j < 2*(n-i)+1; j++) {
        System.out.print("*");
      } 
      System.out.println();
    }

    for(int i = n-1; i > 0; i--) {
      for(int j = n-1; j >= i; j--) {
        System.out.print(" ");
      }
      for(int j = 0; j < 2 * i - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}