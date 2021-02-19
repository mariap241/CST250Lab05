
package edu.ru.lab05;


public class MainClass {
   
    
    public static void main(String[] args){
        
       String word = "racecar";
        System.out.println("The word '"+ word + "' is a palindrome: ");
        System.out.println(isPalindrome(word));
        
    }
    
    
    public static boolean isPalindrome(String word){
        
        int i = 0;
        int j = word.length()-1;
        
        while (j>i){
            if(word.charAt(i) != word.charAt(j)){
                return false;
            }
            i = i + 1;
            j = j - 1;
            
        }
        
        return true;
    }
}
