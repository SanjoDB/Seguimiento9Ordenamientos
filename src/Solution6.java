import java.util.Scanner;

public class Solution6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int j = 0; j < t; j++) {

            int n = sc.nextInt();

            int[] s = new int[n];

            for (int i = 0; i < s.length; i++) {
                s[i] = sc.nextInt();
            }

            bubbleSort(s);

            int counter = 0;

            for (int i = 1; i < s.length; i++) {
                if (i == 1) {
                    counter = s[i] - s[i - 1];
                } else {
                    if (s[i] - s[i - 1] < counter) {
                        counter = s[i] - s[i - 1];
                    }
                }
            }

            System.out.println(counter);
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
