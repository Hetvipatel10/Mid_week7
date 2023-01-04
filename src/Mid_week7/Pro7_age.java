package Mid_week7;

import java.util.Scanner;

//Take input of age of 3 people by user and determine oldest and youngest among
//them.
public class Pro7_age {
    public static void main(String[] args) {
        int age1,age2,age3,max,min;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the age of first person: ");
        age1=sc.nextInt();

        System.out.println("Enter the age of Second person: ");
        age2=sc.nextInt();

        System.out.println("Enter the age of third person: ");
        age3=sc.nextInt();

        if (age1>age2 && age1>age3)
            System.out.println("First person is the oldest");
        else if (age2>age1 && age2>age3)
            System.out.println("second person is the oldest");
        else if (age3>age1 && age3>age2)
            System.out.println("third person is the oldest");
        else {
            System.out.println("all have equal ages");
        }
            if (age1<age2 && age1<age3)
                System.out.println("first person is the youngest");
            else if (age2<age1 && age2<age3)
                System.out.println("second person is the youngest");
            else if (age3<age1 && age3<age2)
                System.out.println("third person is the youngest");
            sc.close();
            }


    }



