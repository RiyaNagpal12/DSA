/* Problem: Find intersection of two arrays

✔ Approach:
- Sorted both arrays
- Used two-pointer technique for traversal
- Compared elements to find common values
- Avoided duplicates while adding to result

✔ Complexity:
- Time: O(n log n)
- Space: O(1)

✔ Key Concept:
Two-pointer technique on sorted arrays */


import java.util.*;
public class FindIntersection{
  public static int[] findintersection(int arr1[] , int arr2[]){
    int i=0;
    int j =0;
    ArrayList <Integer>result = new ArrayList <>();

  Arrays.sort(arr1);
    Arrays.sort(arr2);

  while( i<arr1.length && j<arr2.length ){
    if(arr1[i]==arr2[j]){
      if(result.isEmpty() || result.get(result.size() -1)!= arr1[i]){ // remove duplicates 
        result.add(arr1[i]);}
      
        i++;
        j++;
      
    }

    else if (arr1[i] <arr2[j] ){
      i++;
    }

    else{
      j++;}
  }
    
        // convert list to array
        int[] ans = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            ans[k] = result.get(k);
        }



        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};

        int[] res = findintersection(arr1, arr2);

        System.out.print("Intersection: ");
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
    
    
