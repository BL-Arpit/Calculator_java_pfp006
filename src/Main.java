import java.util.Scanner;

public class Main{
    public static double addition(double a , double b){
        return a+b;
    }
    public static double subtraction(double a , double b){
        return a-b;
    }
    public static double multiplication(double a , double b){
        return a*b;
    }
    public static double division(double a , double b){
        return a/b;
    }
    public static void main(String[] args){
        System.out.println("Welcome to calculator");


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st number");
        double var1 = sc.nextDouble();
        System.out.println("Enter your 2nd number");
        double var2 = sc.nextDouble();
        System.out.println("Enter your choice\n1:Addition\n2:Subtraction\n3:Multiplication\n4:Division ");
        int choice = sc.nextInt();
        double var3;
        switch (choice) {
            case 1 -> System.out.println("Addition of your input is :" + addition(var1, var2));
            case 2 -> System.out.println("Addition of your input is :" + subtraction(var1, var2));
            case 3 -> System.out.println("Addition of your input is :" + multiplication(var1, var2));
            case 4 -> System.out.println("Addition of your input is :" + division(var1, var2));
            default -> System.out.println("Invalid option");
        }
    }
}