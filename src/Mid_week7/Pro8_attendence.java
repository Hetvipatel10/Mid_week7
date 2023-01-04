package Mid_week7;

import java.util.Scanner;

//A student will not be allowed to sit in exam if his/her attendence is less than 75%.
//Take following input from user
//Number of classes held
//Number of classes attended.
//And print
//percentage of class attended
//Is student is allowed to sit in exam or not.
public class Pro8_attendence {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no of class held");
        int n=sc.nextInt();
        System.out.println("enter no of class attend");
        int a=sc.nextInt();


        if (n/a*100>75){
            System.out.println("you are allowed to sit in exam with" +n/a*100+ "percentage of attendence");

        }else {
            System.out.println("you are not allowed to sit in exam with " +n/a*100+ "percentage of attendence");
        }
    }
}
