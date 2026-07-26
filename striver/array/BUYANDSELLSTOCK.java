public class solution{
  public static int profit(int stock[]){
    int minbuy = stock[0];
    int profit = 0;
    for(int i =1 ; i< stock.length ; i++){
      profit = Math.max(profit , stock[i]-minbuy);
      if(minbuy > stock[i] ){
        minbuy = stock[i];
      }
    }
    return profit;
  }
  
