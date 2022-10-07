import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String guestName = sc.next();

        String hostName = sc.next();

        String mix = guestName+hostName;

        char[] parts = mix.toCharArray();

        String lettersFound = sc.next();

        char[] parts2 = lettersFound.toCharArray();

        bubbleSort(parts);
        bubbleSort(parts2);

        int counter = 0;

        for (int i = 0; i < parts.length; i++) {
            if (parts.length == parts2.length) {
                if (parts[i] == parts2[i]) {
                    continue;
                } else {
                    counter = -1;
                    break;
                }
            }else {
                counter = -1;
                break;
            }
        }

        if (counter!=-1){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    public static void bubbleSort(char[] parts) {

        for (int j=0; j<parts.length; j++) {
            for (int i = 1; i < parts.length-j; i++) {

                if (Character.compare(parts[i], parts[i - 1])<0){
                    char prev = parts[i - 1];

                    parts[i - 1] = parts[i];
                    parts[i] = prev;
                }
            }
        }

    }
}

//JUAN = 74+85+65+78 =
//JOSE = 74+79+83+69 =
//mix = 607
//JJEAAAAAA = 607