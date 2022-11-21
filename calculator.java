import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int n1,n2,op;

        System.out.println("enter your option");
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Addition\n2.Substraction\n4.Multiplication\n4.Division\n5.Exit");
        op=sc.nextInt();

        switch(op)
        {

            case 1:
                System.out.println("enter first number");
                n1=sc.nextInt();
                System.out.println("enter Secomd number");
                n2=sc.nextInt();
                int a=n1=n2;
                System.out.println("after addition:"+a);

            case 2:
                System.out.println("enter first number");
                n1=sc.nextInt();
                System.out.println("enter Secomd number");
                n2=sc.nextInt();
                int b=n1-n2;
                System.out.println("after substraction:"+b);



            case 3:
                System.out.println("enter first number");
                n1=sc.nextInt();
                System.out.println("enter Secomd number");
                n2=sc.nextInt();
                int c=n1*n2;
                System.out.println("after Multiplication:"+c);

            case 4:
                System.out.println("enter first number");
                n1=sc.nextInt();
                System.out.println("enter Secomd number");
                n2=sc.nextInt();
                int d=n1/n2;
                System.out.println("after division:"+d);
        }





    }
}
