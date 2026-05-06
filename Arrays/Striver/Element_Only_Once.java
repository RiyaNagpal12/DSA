import java.util.*;

public class Element_Only_Once {

    public static int element(int arr[]) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }

        return arr[arr.length - 1]; // last element case
    }
}
