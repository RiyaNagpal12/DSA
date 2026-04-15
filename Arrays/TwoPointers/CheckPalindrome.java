/*
Approach: Two Pointer Technique

- Use two pointers:
  left → start of string
  right → end of string

- Compare characters at both ends:
    → if mismatch → not palindrome
    → if match → move both pointers inward

- Continue until pointers meet

Time Complexity: O(n)
Space Complexity: O(1)
*/
public class CheckPalindrome{
  public static boolean palindrome(String str){
    int low = 0;
    int high = str.length() -1;
    while(low<high){
      if( str.charAt(low)!=str.charAt(high)){
        return false ;}
      low++;
      high--;
    }

    return true ;

  }
    public static void main(String[] args) {
        String str = "madam";

        if (palindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
        
