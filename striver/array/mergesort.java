public class solution{
  public static void mergesort(int arr[] , int low , int high){
    if(low>=high){
      return ;
    }
    int mid = (low+high)/2;
    mergesort(arr , low , mid-1);
    merge(arr , mid , high);
    merge(arr , low , mid , high);
  }

  public static void merge(int arr[] , int low , int mid ;int high){
    int temp[]= new int[arr.length];
    int i=low;
    int j = mid+1;
    int k=0;
    while(i<=mid && j<=high){
      if(arr[i]<arr[j]){
        temp[k++]=arr[i++];
      }
      else if (arr[i]>arr[j]){
        temp[k++]=arr[j++];
      }

    }
    while(i<=mid){
      temp[k++]=arr[i++];

    }
    while(j<=high){
      temp[k++]=arr[j++];

    }

    for(int i =low ; i<=high ;i++){
      arr[i]=temp[i-low];
    }
  }
}
      
    
