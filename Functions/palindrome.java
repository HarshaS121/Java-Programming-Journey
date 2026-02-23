package Functions;

public class palindrome {
    public static boolean isPalindrome(int n){
      
        if(n<0) return false;

        int originalNumber=n;
        int reverseNumber=0;

        while(n>0){
            int lastDigit=n%10;
            reverseNumber=(reverseNumber*10)+lastDigit;
            n=n/10;
        }
        return originalNumber == reverseNumber;

    }

    public static void main(String[] args) {
        int myNum=1323;
        if(isPalindrome(myNum)){
            System.out.println(myNum + " it is a palindrome");
        }else{
            System.out.println(myNum + " not an palindrome");
        }
    }
}
