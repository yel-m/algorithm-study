import java.util.Scanner;

public class BOJ_3460 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    for(int i = 0; i < t; i++) {
      int n = sc.nextInt();
      int trial = 0; 

      while(n != 0) {
        if(n % 2 != 0) { // 나머지가 1일 때
          System.out.print(trial + " ");
        }
        n /= 2;
        trial++;
      }  
    }  
  }
}