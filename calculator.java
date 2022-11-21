import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int n1,n2,op;

        System.out.println("enter your option");
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Addition\n2.Substraction\n4.Multiplication\n4.Division");
        op=sc.nextInt();

        switch(op)
        {
            case 2:
                System.out.println("enter first number");
                n1=sc.nextInt();
                System.out.println("enter Secomd number");
                n2=sc.nextInt();
                int a=n1-n2;
                System.out.println("after Substraction :"+a);
        }





    }
}
