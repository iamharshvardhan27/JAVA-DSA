import java.util.*;
public class lec4_3AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius : ");
        float r = sc.nextFloat();
        float area = 3.142f*(r*r);
        System.out.println("Area of Circle : "+area);
        sc.close();
    }    
}
