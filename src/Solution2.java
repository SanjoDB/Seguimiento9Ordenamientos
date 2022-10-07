import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] ids = new int[n];

        for (int i = 0; i < ids.length; i++) {
            ids[i] = sc.nextInt();
        }

        bubbleSort(ids);

        int counter = 0;
        int counter2 = 0;
        int prev = 0;

        /*
        for(int i=0; i<ids.length; i++){
            for (int j=1+i; j<ids.length; j++){
                if(ids[i]!=0) {
                    if (ids[i] == ids[j]) {
                        counter++;
                        if (counter == 2) {
                            counter2 = -1;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (counter2==-1){
                break;
            }else {
                counter2+=counter;
                counter=0;
            }
        }
         */
        for(int i=0; i<ids.length; i++){

                if(ids[i]!=0) {
                    if (ids[i] == prev) {
                        counter++;
                        if (counter == 2) {
                            counter2 = -1;
                            break;
                        }
                    }else {
                        prev = ids[i];
                        counter=0;
                    }
                }
            counter2+=counter;
        }

        System.out.println(counter2);

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
