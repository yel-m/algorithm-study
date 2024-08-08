import java.util.Scanner;

public class BOJ_1546 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    double[] scores = new double[n];
    double max = Double.MIN_VALUE;
    double sum = 0;

    for(int i = 0; i < n; i++) {
      scores[i] = sc.nextInt();
      if(scores[i] > max) {
        max = scores[i];
      }
    }

    for(int i = 0; i < n; i++) {
      sum += scores[i] / max*100;   
    }

    System.out.println(sum / n);
    
  }
}