import java.util.*;
public class lec4_6Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost of Pencil , Pen and Eraser : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float total = a+b+c;
        float aftertax = total +((total*18)/100);

        System.out.println("Total Bill : " + aftertax);
        sc.close();
    }
}
