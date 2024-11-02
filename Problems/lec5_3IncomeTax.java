import java.util.*;
public class lec5_3IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income: ");
        int income = sc.nextInt();
        double tax = 0;
        if(income <= 500000){
            System.out.println("No Tax");
        }
        else if (income>500000 && income<1000000)
        {
            tax = (income*0.2);
            System.out.println("Tax: "+tax);
        }
        else{
            tax = (income*0.3);
            System.out.println("Tax: "+tax);
        }
        sc.close();
    }
}
