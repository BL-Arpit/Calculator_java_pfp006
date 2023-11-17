import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        System.out.println("Welcome to calculator");
        int option=0;
        do{
            Functions f = new Functions();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your 1st number");
            double var1 = sc.nextDouble();
            System.out.println("Enter your 2nd number");
            double var2 = sc.nextDouble();
            System.out.println("Enter your choice\n1:Addition\n2:Subtraction\n3:Multiplication\n4:Division ");
            int choice = sc.nextInt();
            double var3;
            switch (choice) {
                case 1 -> System.out.println("Addition of your input is :" + f.addition(var1, var2));
                case 2 -> System.out.println("Addition of your input is :" + f.subtraction(var1, var2));
                case 3 -> System.out.println("Addition of your input is :" + f.multiplication(var1, var2));
                case 4 -> System.out.println("Addition of your input is :" + f.division(var1, var2));
                default -> System.out.println("Invalid option");
            }
            System.out.println("To exit the programme press 1");
            option = sc.nextInt();
        }while (option!=1);
    }
}