import java.util.Scanner;

public class Solution4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int j = 0; j < t; j++) {

            int[] nk = new int[2];

            for (int i = 0; i < nk.length; i++) {
                nk[i] = sc.nextInt();
            }

            int n = nk[0];
            int k = nk[1];

            int[] w = new int[n];
            for (int i = 0; i < n; i++) {
                w[i] = sc.nextInt();
            }

            bubbleSort(w);

            int counter = 0;
            int counter2 = 0;

            if(k<=n-k) {
                for (int i = 0; i < k; i++) {
                    counter += w[i];
                }
                for (int i = k; i < w.length; i++) {
                    counter2 += w[i];
                }
            }else {
                for (int i = 0; i < n-k; i++) {
                    counter += w[i];
                }
                for (int i = n-k; i < w.length; i++) {
                    counter2 += w[i];
                }
            }


            System.out.println(counter2 - counter);

        }
    }

    public static void bubbleSort(int[] ids) {

        for (int j=0; j<ids.length; j++) {
            for (int i = 1; i < ids.length-j; i++) {

                if (ids[i]<ids[i - 1]){
                    int prev = ids[i - 1];

                    ids[i - 1] = ids[i];
                    ids[i] = prev;
                }
            }
        }

    }
}