import java.util.*;

public class Solution {

    public static List<List<Integer>> pascal(int rows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            result.add(Compute(i));
        }

        return result;
    }

    public static List<Integer> Compute(int row) {

        long ans = 1;

        List<Integer> list = new ArrayList<>();

        list.add((int) ans);

        for (int i = 1; i <= row; i++) {

            ans = ans * (row - i + 1);
            ans = ans / i;

            list.add((int) ans);
        }

        return list;
    }

    public static void main(String[] args) {

        System.out.println(pascal(5));
    }
}}

    
  
