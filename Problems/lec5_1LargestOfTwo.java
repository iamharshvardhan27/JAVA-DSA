import java.util.*;
public class lec5_1LargestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number: ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("The largest number is: "+a);
        }
        else{
            System.out.println("The largest number is: "+b);
        }
        sc.close();
    }
}