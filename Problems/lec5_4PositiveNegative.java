import java.util.*;
public class lec5_4PositiveNegative {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        String check = (a >= 0)? "Positive" : "Negative";
        System.out.println(check);
        sc.close();
    }
}
