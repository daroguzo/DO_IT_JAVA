package algorithm.day1;

import java.util.Scanner;

/**
 * 구간 합
 * 구간 합 구하기
 * 실버3
 * 2092ms
 */
public class Q11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] array = new int[n + 1];
        int[] answers = new int[m];

        array[0] = 0;

        for (int i = 1; i <= n; i++) {
            int input = sc.nextInt();
            array[i] = array[i - 1] + input;
        }

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            answers[i] = array[y] - array[x - 1];
        }

        for (int i : answers) {
            System.out.println(i);
        }
    }
}
