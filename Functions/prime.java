package Functions;

public class prime {
    public static Boolean isPrime(int n){
       if(n<=1) return false;

       boolean check =true;

       for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            check=false;
            break;
        }
       }
       return check;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(7));
        
    }
}
