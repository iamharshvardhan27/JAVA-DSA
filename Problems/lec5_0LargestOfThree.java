import java.util.*;
public class lec5_0LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if( a > b && a > c ){
            System.out.println(a + " is the largest");
        }
        else if ( b > a && b > c ){
            System.out.println(b + " is the largest");
        }
        else{
            System.out.println(c + " is the largest");
        }
        sc.close();
    }
}