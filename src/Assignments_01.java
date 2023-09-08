//import java.util.Scanner;

public class Assignments_01 {
    public static void main(String[] args) {
//        Write a program to print whether a number is even or odd, also take input from the user.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int num = sc.nextInt();
//        if(num%2==0){
//            System.out.println(num + " is even");
//        }else {
//            System.out.println(num + " is odd");
//        }

//        Take name as input and print a greeting message for that particular name.
//        System.out.println("enterthename");
//        String name = sc.nextLine();
//        System.out.println("Hello " +name);

//        Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest
//        System.out.println("enter principal");
//            double principal = sc.nextDouble();
//        System.out.println("enter interest rate");
//            double rate = sc.nextDouble();
//            System.out.println("enter time in years");
//            int time = sc.nextInt();
//
//            double amount  =  (principal * rate * time)/100;
//        System.out.println(amount);

//        Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
//        System.out.println("Enter two numbers");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println("Enter opertaor +,-,*,/");
//        char operator = sc.next().charAt(0);
//        if (operator == '+'){
//            System.out.println(a+b);
//        }else if (operator == '-'){
//            System.out.println(a-b);
//        }else if (operator == '*'){
//            System.out.println(a*b);
//        }else{
//            System.out.println(a/b);
//        }

//        Input currency in rupees and output in USD.
//        System.out.println("Enter amount is rs");
//        double rupees = sc.nextDouble();
//
//        double usd = rupees / 82.990;
//        System.out.println(usd);



//        To calculate Fibonacci Series up to n numbers.

       int n= 10;
        int f= 0 ,s=1;
       for(int i=0;i<=n;i++){
           int next = f + s;
           System.out.println(next);
           f = s;
           s=next;
       }


    }
}
