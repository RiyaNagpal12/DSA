/*
 * Program: Find the 3rd Maximum Number in an Array (Without Sorting)
 *
 * Problem Statement:
 * Given an array of integers, find the third largest DISTINCT element.
 *
 * Approach:
 * 1. Maintain three variables: first, second, third (largest values).
 * 2. Traverse the array once.
 * 3. Update values accordingly while skipping duplicates.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Advantages:
 * - Handles duplicate elements correctly.
 * - More efficient than sorting approach.
 *
 * Edge Case:
 * - If less than 3 distinct numbers exist, print appropriate message.
 */
public class ThirdMax {
    public static void main(String[] args) {
        int arr[] = {10, 5, 20, 20, 8, 25, 15};

        Integer first = null, second = null, third = null;

        for (Integer num : arr) {
            if (num.equals(first) || num.equals(second) || num.equals(third)) {
                continue;
            }

            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            } else if (second == null || num > second) {
                third = second;
                second = num;
            } else if (third == null || num > third) {
                third = num;
            }
        }

        if (third == null) {
            System.out.println("Less than 3 distinct numbers");
        } else {
            System.out.println("3rd max number = " + third);
        }
    }
}
