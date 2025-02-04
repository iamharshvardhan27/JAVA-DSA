public class lec13FunctionOverloadingByNoOfPara {

    public static int sum( int a , int b){
        System.out.println("with 2 parameters ");
        return a + b;
    }

    public static float sum(int a , int b , int c){
        System.out.println("with 3 parameters ");
        return a + b;
    }

    public static void main(String[] args) {
        sum(1,1);
        sum(1, 2 ,3);
    }
}

