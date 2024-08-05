import java.util.*;

public class Cau1 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String elements[] = input.split(" ");
        int size = Integer.parseInt(elements[0]); // 0 <= n <= 1000
        int array[] = new int[size];
        int sumDifferentNumber = size != 0 ? 1 : 0;

        for (int i = 0; i < array.length; i++) {
            int element  = Integer.parseInt(elements[i+1]);
            if (element < 0 || element > 1000) continue;
            boolean check = false;
            for (int j = 0; j < i; j++) {
                if (array[j] == element) {
                    sumDifferentNumber++;
                    check = true;
                    break;
                }
            }
            if (check == false) {
                array[i] = element;
            }
        }

        System.out.println(sumDifferentNumber);

        sc.close();
    }

    // For test
    // public static void main(String[]args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int array[] = new int[n]; // int array[]; 
    //     for (int i = 0; i < n; i++) {
    //         array[i] = sc.nextInt(); //nextLine
    //     }
    //     for (int i = 0; i < array.length; i++) {
    //         System.out.println(array[i]);
    //     }
    // }
}