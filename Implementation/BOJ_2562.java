import java.util.Scanner;

public class BOJ_2562 {

  public static int COUNT = 9;

  public static void main(String[] args) {

    int max = Integer.MIN_VALUE;
    int index = 0;
    
    
    Scanner sc = new Scanner(System.in);
    
    for(int i = 0; i < COUNT; i++) {
      int n  = sc.nextInt();
      if(n > max) {
        max = n;
        index = i+1;
      }
    }

    System.out.println(max);
    System.out.println(index);

  }
}