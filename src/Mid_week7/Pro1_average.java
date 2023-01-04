package Mid_week7;

import java.util.Scanner;

//Take 10 integers from keyboard using loop and print their average value on the
//screen.
public class Pro1_average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 1;
        int avg = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("enter number ");
            sum = sum + sc.nextInt();
            avg = sum / 10;
        }
        System.out.println("sum is " + sum);
        System.out.println("Avg is " + avg);


    }
}