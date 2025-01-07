package testing.org;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner inputs = new Scanner(System.in);

        System.out.println("Write User Name: ");
        String usrName = inputs.nextLine();

        System.out.println("How old are you? ");
        int age = inputs.nextInt();

        System.out.println("How much you earn? ");
        double salaryAmount = inputs.nextDouble();


        final double tax = 0.18;
       // boolean payTax;
        double finalSalary;

        if(salaryAmount >= 5000){
           // payTax = true;
            //Calculate Tax
            finalSalary = salaryAmount - (salaryAmount * tax);
            System.out.println("Hey " + usrName + " you're " + age + " years old and your salary is R" + salaryAmount + "  but after Tax is R" + finalSalary );
        }else{
          //  payTax = false;
            System.out.println("You ain't got no stress about Tax");
        }


    }
}