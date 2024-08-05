import java.util.Scanner;

public class BOJ_5598 {

  static int CAESAR_DISTANCE = 3;
  static int CIRCLE_DISTANCE = 26;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String caesar = sc.next();

    String[] caesarArr = caesar.split("");

    for(int i = 0; i < caesarArr.length; i++) {
        int caesarAscii = caesarArr[i].charAt(0);
      if(caesarAscii <= 'C') caesarAscii += CIRCLE_DISTANCE;

        System.out.print((char)(caesarAscii - CAESAR_DISTANCE));
    }
  }
}