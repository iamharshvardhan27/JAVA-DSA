public class lec12Functions {
    /* 
        Methods -> Methods are the block of code that gets executes when it is called.
        We always declare the methods outside the main method and call the method in main method.
        In void methods it is not compulsory to write the return statement in the method. 
        BUT in other than void methods it is compolsory to write return statemant at the last of that method.
        
        Syntax -> 
            
            returnType method_name(){
                //body
                return statement;
            }

            returnType method_name(type para1 , type para2){
                //body
                return ststement;
            }
        
     */



    public static void printHelloworld(){
        System.out.println("Hello World");
    }

    public static int sum( int a , int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        printHelloworld();
        System.out.println(sum(10,20));
    }
}
