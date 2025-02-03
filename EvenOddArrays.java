// Name: Your Name
// PRN: Your PRN
// Batch: Your Batch

import java.util.ArrayList;
import java.util.Scanner;

public class EvenOddArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        System.out.println("Enter numbers (enter -1 to stop):");
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) break;

            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        System.out.println("Even Numbers: " + even);
        System.out.println("Odd Numbers: " + odd);
        scanner.close();
    }
}
