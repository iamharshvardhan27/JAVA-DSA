import java.util.*;
public class lec4Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //INTEGER
        System.out.println("Enter a Integer : ");
        int a = sc.nextInt();
        System.out.println(a);

        //CHARECTER / WORD 
        System.out.println("Enter a Word : ");
        String mychar = sc.next();
        System.out.println(mychar);

        //STRING
        System.out.println("Enter a string: ");
        String mystr = sc.nextLine();
        System.out.println(mystr);
        sc.close();
    }
}
