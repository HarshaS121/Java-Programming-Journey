//count digit

package Java_Revision;

import java.util.Scanner;

public class que2 {
    public static void main(String[] args) {
        long n,count=0;
        System.out.println("enter number");
        Scanner scn=new Scanner(System.in);
        n=scn.nextLong();

        long temp=n;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        System.err.println(count);

        long div=(long)Math.pow(10, count-1);

        while(div !=0){
            long quotient=n/div;
            System.out.println(quotient);

            n=n%div;
            div=div/10;
        }
        scn.close();
    }
}
