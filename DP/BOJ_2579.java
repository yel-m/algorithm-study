package DP;

import java.util.Scanner;

public class BOJ_2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        int numOfSteps = sc.nextInt();
        int[] steps = new int[301]; // numOfSteps+1 로 설정하면 ArrayIndexOutOfBounds 에러
        int[] dp = new int[301];


        for(i = 1; i <= numOfSteps; i++) {
            steps[i] = sc.nextInt();
        }

        dp[1] = steps[1];
        dp[2] = steps[1] + steps[2];
        dp[3] = steps[3] + Math.max(steps[1], steps[2]);

        for(i = 4; i <= numOfSteps; i++) {
            dp[i] = steps[i] + Math.max(steps[i-1] + dp[i-3], dp[i-2]);
        }

        System.out.println(dp[numOfSteps]);

    }
}




