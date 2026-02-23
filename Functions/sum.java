package Functions;

public class sum {
    public static int SumOfDigit(int n){

        int originalNumber=n;
        int sum=0;

        while(n>0){
            int numbers=n%10;
            sum=sum+numbers;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(SumOfDigit(23456));
    }
}
