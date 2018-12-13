import java.util.*;
import java.lang.*;
public class recursiveS {
    public static void main(String args[]){
        System.out.println("Enter a string you would like to be reversed, or done to exit.");
        Scanner s = new Scanner(System.in);//looking for input
        String inp1 = s.nextLine();//input to string
        recursiveS set = new recursiveS();//obj
        System.out.println("The reverse of "+inp1+" is: "+ set.reverse(inp1));//output of pali
        System.out.println(set.palindromeCheck(inp1));
    }
    private String reverse(String inp1 ){
        String done = "done";
        if((inp1 == null) || (inp1.length() <=1)){//not reversed cases
            return inp1;
         }
         else if((inp1.equals(done))){//exits
             System.out.println("goodbye.");
             System.exit(0);
        }
             return reverse(inp1.substring(1)) + inp1.charAt(0);//recursive return
    }
private String palindromeCheck(String inp1) {
        String n = "This is not a palindrome";
        String y = "This is a palindrome";
    int length = inp1.length()-1;
    for(int i=0;i<length;i++,length-- ) {
        if (inp1.charAt(i) != inp1.charAt(length)) {
            return n;
        }
    }
    return y;
    }

}
