public class armstrong {
    public static boolean isArmstrong(int n){
        int originalNum=n;
        int armstrong=0;
        int digits = String.valueOf(n).length();

        while(n>0){
            int lastDigit=n%10;
            armstrong=armstrong+(int)Math.pow(lastDigit,digits);
            n=n/10;
        }
        return originalNum == armstrong;
    }

    public static void main(String[] args) {
        int num=1634;
        if(isArmstrong(num)){
            System.out.println(num + " yes its armstrong");
        }else{
            System.out.println(num + " no it is not a armstrong");
        }
    }
}
