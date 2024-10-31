import java.util.*;
public class lec10Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        1.While Loop -> executes the block of code as long as the condition is true.
        syntax -> 
        while (condition) {
            //body
        }

        Eg.Print the hello world 10 times in single row ->

        int counter = 0;
        while(counter<10){
            System.out.print("Hello world ");
            counter++;
        }
        */




        /*
        2.For Loop -> executes the block of code as long as the condition is true. and mostly used when the end condition is known
        syntax -> 
        for(initialization;condition;updatation) {
            //body
        }

        Eg.Print the hello world 10 times ->

        for(int i = 1; i<=10 ; i++){
            System.out.println("Hello World");
        }
        */        



         /*
        3.Do - while Loop -> executes the block of code atleast once and then it checks the condition and executes the block of code as long as the condition is true. 
        syntax -> 
        do{
            //body
        }
        while(condition)

        Eg. print hello world 10 times  ->

        int counter = 1;
        do{
            System.out.println("Hello World");
            counter++;
        }
        while(counter <= 10); 
        */



        /* 
        Break statement
        Break statement is used to terminate the loop or switch statement prematurely.
        eg ->
        int counter = 1;
        while(counter <= 5 ){
            if (counter==3) {
                break;
            }
            System.out.println(counter);
            counter++;
        */



        /* 
        Continue
        Continue statement is used to skip the current iteration of the loop and move to the next iteration.
        eg ->
        for(int i = 1; i<=5; i++){
            if (i==3) {
                continue;
            }
            System.out.println(i);
        }
        */

        sc.close();
    }
}