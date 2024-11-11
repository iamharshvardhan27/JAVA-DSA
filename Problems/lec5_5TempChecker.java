import java.util.*;
public class lec5_5TempChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = 103.5;
        String check = (temp >= 100)? "You have fever":"You dont have fever";
        System.out.println(check);
        sc.close();
    }
}