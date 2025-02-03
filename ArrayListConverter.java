// Name: Nidhi
// PRN: 23070126080
// Batch: aiml b1

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListConverter {
    public static void main(String[] args) {
        // Convert Array to ArrayList
        String[] array = {"Java", "Python", "C++", "JavaScript"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("ArrayList: " + arrayList);

        // Convert ArrayList to Array
        String[] convertedArray = arrayList.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(convertedArray));
    }
}
