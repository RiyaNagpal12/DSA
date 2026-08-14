public class solution{
  public static int countstudents(int books[] , int maxpages){
    int student=1;
    int pages=0;
    for(int i=0;i<books.length;i++){
      if(pages+books[i]<=maxpages){
        pages+=books[i];}
      else{
        student++;
        pages = books[i];
      }
    }

    return student;
  }
  public static int bookallocation(int books[] , int student){

    int low = Integer.MIN_VALUE;
    int high = 0;
    for(int i =0;i<books.length;i++){
      low=Math.max(low , books[i]);
      high+=books[i];
    }
    while(low<=high){
      int mid =(low+high)/2;
      int students = countstudents(books  , mid);
      if(students> student){
        low=mid+1;
      }
      else{

        high = mid-1;
      }

    }

    return low;
  }

}
  
    
