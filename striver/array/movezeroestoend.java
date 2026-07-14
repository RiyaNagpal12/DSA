public  class movezeroestoend{
  public static void movezeroe(int arr[]){
    int i = 0;
    for(int j =0;j<arr.length ;j++){
      if(arr[j]!=0){
        int temp =arr[j];
        arr[j]= arr[i];
        arr[i]=temp;
        i++;
      }
    }
    
        
    
