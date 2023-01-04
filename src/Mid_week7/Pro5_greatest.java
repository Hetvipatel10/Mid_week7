package Mid_week7;
//Take two int values from user and print greatest among them.
public class Pro5_greatest {

    public static void main(String[] args) {
        int num1=50;
        int num2=20;
        if(num1==num2)
            System.out.println("both are equal");
        else if (num1>num2) {
            System.out.println(num1 + "is greatest");
        }else
            System.out.println(num2 + "is greatest");
    }
}
