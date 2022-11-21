import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int n1,n2,op;
        boolean flag=true;
     while (flag) {
         System.out.println("-----------------------------------");
         System.out.println("enter your option");
         Scanner sc = new Scanner(System.in);
         System.out.println("1.Addition\n2.Substraction\n4.Multiplication\n4.Division\n5.Exit");
         op = sc.nextInt();

         switch (op) {

             case 1:
                 System.out.println("enter first number");
                 n1 = sc.nextInt();
                 System.out.println("enter Secomd number");
                 n2 = sc.nextInt();
                 int a = n1 = n2;
                 System.out.println("after addition:" + a);
                 break;

             case 2:
                 System.out.println("enter first number");
                 n1 = sc.nextInt();
                 System.out.println("enter Secomd number");
                 n2 = sc.nextInt();
                 int b = n1 - n2;
                 System.out.println("after substraction:" + b);
                 break;


             case 3:
                 System.out.println("enter first number");
                 n1 = sc.nextInt();
                 System.out.println("enter Secomd number");
                 n2 = sc.nextInt();
                 int c = n1 * n2;
                 System.out.println("after Multiplication:" + c);
                 break;

             case 4:
                 System.out.println("enter first number");
                 n1 = sc.nextInt();
                 System.out.println("enter Secomd number");
                 n2 = sc.nextInt();
                 try {
                     int d = n1 / n2;
                     System.out.println("after division:" + d);
                 }
                 catch (ArithmeticException e)
                 {
                     System.out.println("Divided by zero operation cannot possible");
                 }

                 break;

             case 5:
                 flag=false;
                 break;


             default: {
                 System.out.println("no option selected");
                 break;
             }

         }
     }




    }
}
