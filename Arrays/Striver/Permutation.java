public class Permutation {
  public static void permutation (int arr[] , int visited[] , ArrayList<Integer>temp){
    if(temp.size()==arr.length){ 
      System.out.println(temp);
      return ;}

    for(int i=0;arr.length ;i++){
      temp.add(arr[i]);
      visited[i]=true ;

      permutation(arr , visited , temp);

      temp.remove(temp.size()-1);
      visited[i]=false;
    }
  }

  
      
      
      
