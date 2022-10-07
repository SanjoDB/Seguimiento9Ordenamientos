import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int j = 0; j < t; j++) {

            PriorityQueue<Integer> s = new PriorityQueue<>(Collections.reverseOrder());

            int[] nk = new int[2];

            for (int i = 0; i < nk.length; i++) {
                nk[i] = sc.nextInt();
            }

            int n = nk[0];
            int k = nk[1];

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                s.offer(a[i]);
            }

            long counter = 0;

            for (int i = 0; i < k+1; i++) {
                counter += s.poll();
            }

            System.out.println(counter);
        }
    }
}
