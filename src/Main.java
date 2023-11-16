import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Welcome to calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st number");
        double var1 = sc.nextDouble();
        System.out.println("Enter your 2nd number");
        double var2 = sc.nextDouble();
        System.out.println("Enter your choice\n1:Addition ");
        int choice = sc.nextInt();
        if(choice==1){
            double var3 = var1+var2;
            System.out.println("Addition of your input is :"+var3);
        }
        else {
            System.out.println("Invalid option");
        }
    }
}