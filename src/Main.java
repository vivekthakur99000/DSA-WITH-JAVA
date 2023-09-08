import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        FIRST PROGRAM
//        System.out.println("Hello world!");


//        TO TAKE A INPUT FOR USER

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your name ");
        String name = sc.next();        //        it will only print only one line
        String fullName = sc.nextLine(); // it will print the whole line
        System.out.println("Hello " +name);
    }
}