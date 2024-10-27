import java.util.*;
public class lec9ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Conditional Statements

        /* 
        //if-else
        int age = 22;
        if(age >= 18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not an adult");
        }
        */


        /* 
        //else-if 
        int age = 14;
        if( age >= 18 ){
            System.out.println("Adult");
        }
        else if(age <= 18 && age >= 13){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Child");
        }
        */

        /* 
        //Tarnary Operaator 
        // variable = (condition) ? statement1 : statement2;
        int larger = ( 2 > 1 ) ? 2 : 1;
        System.out.println(larger);

        String check = ( 20%2==0 ) ? "Even":"odd";
        System.out.println(check);
        
        int marks = 32;
        String result = ( marks >= 35 ) ? "Pass" : "Fail";
        System.out.println(result);
        */



        // Switch Statement 
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Input Operation:\n1.Add\n2.Sub\n3.Mult\n4.Div\n5.Mod");
        int option = sc.nextInt();
        switch (option){
            case 1:{
                System.out.println("Addition: "+(a+b));
                break;
            }
            case 2:{
                System.out.println("Subtraction: "+(a-b));
                break;
            }
            case 3:{
                System.out.println("Multiplication: "+(a*b));
                break;
            }
            case 4:{
                System.out.println("Division: "+(a/b));
                break;
            }
            case 5:{
                System.out.println("Modulus: "+(a%b));
                break;
            }
        }
        sc.close();
    }
}