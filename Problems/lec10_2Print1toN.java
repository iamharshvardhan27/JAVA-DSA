import java.util.*;
public class lec10_2Print1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers from 1 you want to print : ");
        int n = sc.nextInt();
        int count = 1;
        while( count <= n ){
            System.out.print(count+" ");
            count++;
        }
        sc.close();
    }
}
