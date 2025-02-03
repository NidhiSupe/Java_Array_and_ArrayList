// Name: Nidhi
// PRN: 23070126080
// Batch: Aiml B1

public class SmallestDistancePair {
    public static int findSmallestDistanceIndex(int[] arr) {
        if (arr.length < 2) return -1;

        int minIndex = 0;
        int minDistance = Math.abs(arr[1] - arr[0]);

        for (int i = 1; i < arr.length - 1; i++) {
            int distance = Math.abs(arr[i + 1] - arr[i]);
            if (distance < minDistance) {
                minDistance = distance;
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 15, 2, 17, 9, 20};
        int index = findSmallestDistanceIndex(arr);
        System.out.println("Index of the first number in the smallest distance pair: " + index);
    }
}