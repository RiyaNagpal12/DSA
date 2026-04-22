/*
Problem: Generate All Permutations of a String

Description:
Given a string, generate all possible permutations (arrangements) of its characters.
A permutation is a rearrangement of characters where order matters.

Approach:
- Use Recursion and Backtracking.
- At each step:
  1. Pick one character from the string.
  2. Remove that character from the remaining string.
  3. Append it to the current answer.
  4. Recursively generate permutations for the remaining string.
- Base Case:
  - When the input string becomes empty, print the accumulated result.

Key Logic:
- str.substring(0, i) + str.substring(i + 1) removes the current character.
- ans + current builds the permutation step-by-step.

Output:
For input "abc", the permutations are:
abc
acb
bac
bca
cab
cba

Time Complexity:
O(n! * n)
- n! permutations
- Each takes O(n) time to construct

Concepts Used:
- Recursion
- Backtracking
- String manipulation
*/

class ques30{

    public static void Permutation(String str , String ans ){

        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i =0 ;i<str.length();i++){
            char current = str.charAt(i);
            String newstr= str.substring(0,i) + str.substring(i+1 ) ; // for removing current 
            Permutation(newstr, ans + current);

        }
    }
    public static void main(String[] args) {
        String str ="abc";
        Permutation(str, "");
        
    }
}
