package Mid_week7;
//Print multiplication table of 24, 50 and 29 using loop.
public class Pro2_loop {
    public static void main(String[] args) {
        int n=24;
        int n1=50;
        int n2=29;

        for(int i=1;i<=10;i++){
            System.out.println(n+" * " +i+ "=" +n*i);

        }
        for (int j=1;j<=10;j++){
            System.out.println(n1+" * " +j+ "=" +n1*j);
        }
        for (int k=1;k<=10;k++){
            System.out.println(n2+" * " +k+ "=" +n2*k);
        }

    }

}
