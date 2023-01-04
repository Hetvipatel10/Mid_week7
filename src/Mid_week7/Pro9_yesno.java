package Mid_week7;

import java.util.Scanner;

public class Pro9_yesno {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("no of class held");
        int n=sc.nextInt();
        System.out.println("no of class attend");
        int a=sc.nextInt();
        System.out.println("did student have any medical issue \"true or false?\"");
        boolean medical=sc.nextBoolean();

        if (medical || (n/a*100<75)){
            System.out.println("you are allowed to sit in exam with "+n/a*100+ "percentage of attendence");

        }
        else {
            System.out.println("you are not allowed to sit in exam with" +n/a*100+ "percentage of attendence");
        }

          }
}
