import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

      int num,count=0;
      System.out.println("Enter number");
      Scanner scn=new Scanner(System.in);
       num=scn.nextInt();
       scn.nextLine();

       System.out.println("Enter name");
       String name=scn.nextLine();
      
      for(int i=1;i<=num;i++){
        if(num%i==0){
            count++;
        }
        }
        if(count==2){
            System.out.println(name+".."+num + " IS A PRIME NUMBER");
        }else{
            System.out.println(name+".."+num + "IS A NON-PRIME NUMBER");
        }
    }
}