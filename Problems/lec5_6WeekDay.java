import java.util.*;
public class lec5_6WeekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day of Week :");
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("its Monday");
                break;
            case 2:
                System.out.println("Its Tuesday");
                break;
            case 3:
                System.out.println("Its Wednesday");
                break;
            case 4:
                System.out.println("Its Thursday");
                break;
            case 5: 
                System.out.println("Its Friday");
                break;
            case 6:
                System.out.println("Its Saturday");
                break;
            case 7:
                System.out.println("Its Sunday");
                break;
            default :
                System.out.println("Invalid Input");
        }
        sc.close();
    }
}
