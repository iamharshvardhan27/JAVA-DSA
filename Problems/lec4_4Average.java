import java.util.*;
public class lec4_4Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers for avg: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float avg = (a+b+c)/3;
        System.out.println("Average is "+avg);
        sc.close();
    }
}