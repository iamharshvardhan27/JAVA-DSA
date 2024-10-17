import java.util.*;
public class lec5TypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // CONVERTING INT TO LONG
        //int a = 20;
        //long b = a;
        // this is valid type casting. as long is large in size as compare to int;

        //CONVERTING CHAR TO INT 
        char mychar = 'a';
        int number = mychar;
        System.out.println(number);

        char a = 'a';
        System.out.println((int)a); // direct type conversion

        //CONVERTING LONG TO INT 
        long a = 20;
        int b = a;
        System.err.println(b);
        // this conversion is not allowed as its giving error : incompatible types: possible lossy conversion from long to int
    }
}
