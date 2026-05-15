public class Reverse { 
public static void reverse (String str){ 
  String reverse ="";
  for (int i= str.length()-1;i>=0;i--){
    reverse = reverse + str.charAt(i);
  } 
  System.out.println(reverse);}
  public static void main(String [] args ){ 
  String str = "Riya";
    reverse(str);
  }
}
