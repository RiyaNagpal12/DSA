/* ✔ Problem: Find union of two arrays

✔ Approach:
- Sorted both arrays
- Used two-pointer technique (merge logic)
- Compared elements and added smaller one
- Skipped duplicates to maintain uniqueness
- Handled remaining elements after traversal

✔ Complexity:
- Time: O(n log n)
- Space: O(1)

✔ Key Concept:
Merge-based approach (similar to merge sort) */
import java.util.*; 

public class UnionArray {

    public static int[] union(int arr1[], int arr2[]) {

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
          if(arr1[i]<arr2[j]){
      

              if(result.isEmpty()  || result.get(result.size() -1 ) != arr1[i]){
                result.add(arr1[i]);

              }
            i++ ; 

              }

          else if (arr2[j]<arr1[i]){
            if(result.isEmpty() ||  result.get(result.size() -1) != arr2[j]){
              result.add( arr2[j]) ;
            }
            j++;
          }

          else {
            if(result.isEmpty() || result.get(result.size() -1 ) != arr1[i] ){
              result.add(arr1[i]);

            }
            i++;
            j++;}
        }

          while( i<arr1.length){
            
              if(result.isEmpty()  || result.get(result.size() -1 ) != arr1[i]){
                result.add(arr1[i]);

              }

            i++;
          }

          while (j<arr2.length ){
              if(result.isEmpty() ||  result.get(result.size() -1) != arr2[j]){
              result.add( arr2[j]) ;
            }
            j++;
          }



          
            

        int[] ans = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            ans[k] = result.get(k);
        }

        return ans;
    }
}

public static void main(String[] args) {
    int[] arr1 = {1,2,2,1};
    int[] arr2 = {2,3,4};

    int[] res = union(arr1, arr2);

    System.out.print("Union: ");
    for (int num : res) {
        System.out.print(num + " ");
    }
}
