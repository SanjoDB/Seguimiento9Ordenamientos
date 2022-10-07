import java.util.ArrayList;
import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> sum = new ArrayList<>();

        String s = sc.next();

        String[] parts = s.split("\\+");

        for(int i=0; i<parts.length; i++){
            sum.add(
                    Integer.parseInt(parts[i])
            );
        }

        insertionSort(sum);

        for (int i=0; i<sum.size(); i++){
            if(sum.size()-1==i){
                System.out.print(sum.get(i));
            }else {
                System.out.print(sum.get(i) + "+");
            }
        }

    }

    public static void insertionSort(ArrayList<Integer> sum) {

        for (int j=1; j<sum.size(); j++) {
            for (int i = 0; i < j; i++) {

                if (sum.get(j) < sum.get(i)) {

                    int prev = sum.remove(j);
                    sum.add(i, prev);
                    break;
                }
            }
        }

    }
}
