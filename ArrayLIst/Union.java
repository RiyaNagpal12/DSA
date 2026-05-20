public class union {
  public static void union (int arr1[], arr2[]){
    ArrayList<Integer> list = new ArrayList<>();
    int i =0 ;
    int j=0; 
    while (i<=arr1.length && j<=arr2.length ){
      if ( arr1[i] < arr2[j] ) {
        if ( list.size() ==0 || list.get(list.size() -1)!=arr[i]){
          list.add(arr[i]);}
          i++;}
      if ( arr1[i] > arr2[j] ) {
        if ( list.size() ==0 || list.get(list.size() -1)!=arr[j]){
      list.add(arr[j]);}
          j++;} 
    }
    while (i<arr1.length){
      if (list.get(list.size()-1)!= arr[i]{
        list.add(arr[i] );
      }
      i++;}
  }
  j++;} 
    }
    while (j<arr2.length){
      if (list.get(list.size()-1)!= arr[j]{
        list.add(arr[j] );
      }
      j++;}
  }
for (int num : list) {

            System.out.print(num + " ");

        }

    }

    public static void main(String[] args) {

        int arr1[] = {1, 2, 2, 3, 4, 5};

        int arr2[] = {2, 3, 4, 4, 5, 6};

        union(arr1, arr2);

    }

}



        
