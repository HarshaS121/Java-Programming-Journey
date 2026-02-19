package Java_Revision;

import java.util.Scanner;

public class que3 {
    public static void main(String[] args) {
        int n;
        Scanner scn=new Scanner(System.in);
        n=scn.nextInt();

        while (n>0) {
            int r=n%10;
            System.out.println(r);
            n=n/10;
        }
    }
}

//2345 -->
//5
//4
//3
//2
