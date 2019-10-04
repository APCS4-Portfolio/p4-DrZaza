import java.util.Scanner;
class Palindrome 
{
  public static void checkPalindrome(String s) 
  { 
    // reverse the given String 
    
    String reverse = new StringBuffer(s).reverse().toString(); 
  
    // check whether the string is palindrome or not 

    if(s.equals(reverse))
      System.out.println("Yes, that is a palindrome!"); 
  
    else
      System.out.println("No, that is not a palindrome.");
  } 
  public static void main (String[] args)      
  { 
   boolean typing = true;
   System.out.println("\u000C");
   System.out.println("Welcome to the Palindrome Program!");
   System.out.println("Press \"Q\" at any time to quit");
   while(typing==true){
       System.out.println("----------");
       System.out.println("Enter a String:");
       
       Scanner i = new Scanner(System.in);
       String x = "";
      while(typing==true){
        x = i.nextLine();
        switch(x){
            case "q":
                System.out.println("Thanks for playing!");
                typing = false;
                break;
            case "Q":
                System.out.println("Thanks for playing!");
                typing = false;
                break;
            default:
                break;
        }
        if(x.length() == 1&&typing==true){
           System.out.println("Must be more than one character to be a Palindrome");
        }
        else{
           break;
        }
       }
      while(typing==true){
       x = replaceCharacter(x);
       checkPalindrome(x.toLowerCase());
       break;
    }
   }
  }
  static String replaceCharacter(String input){
        String alphaAndDigits0 = input.replaceAll("[\\s]", "");
        String alphaAndDigits = alphaAndDigits0.replaceAll("[^a-zA-Z0-9 ]","");
        return alphaAndDigits;
    } 
}

    

