import java.util.*;
public class lec11Patterns1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 
        1.Star pattern 
        *
        **
        ***
        ****
        System.out.println("Enter no of lines for star pattern : ");
        int n = sc.nextInt();
        for ( int i = 1; i<=n; i++ ){
            for(int j = 1; j<=i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        */


        /* 
        2.Inverted Star pattern 
        ****
        ***
        **
        *
        System.out.println("Enter no of lines for inverted star pattern : ");
        int n = sc.nextInt();
        for( int i = n; i>=1; i--){
            for( int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */



        /* 
        3.Numeric half pyramid pattern 
        1
        12
        123
        1234
        System.out.println("Enter no of lines for numeric half pyramid pattern : ");
        int n = sc.nextInt();
        for( int i = 1; i <= n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        */



        /* 
        4.alphabetical half pyramid pattern 
        A
        BC
        DEF
        GHIJ
        System.out.println("Enter no of lines for alphabetical half pyramid pattern : ");
        int n = sc.nextInt();
        char ch = 'A';
        for (int i = 1; i<=n; i++){
            for ( int j = 1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        */

        sc.close();

    }
}
