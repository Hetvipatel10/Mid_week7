package Mid_week7;

import java.util.Scanner;

//Take values of length and breadth of a rectangle from user and check if it is square or not.
public class Pro4_square {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length: ");
        double l=sc.nextDouble();

        System.out.println("Enter the beadth: ");
        double b=sc.nextDouble();

        if (l>=b)
            System.out.println("square..");
        else
            System.out.println("Not a square..");

        }
    }

