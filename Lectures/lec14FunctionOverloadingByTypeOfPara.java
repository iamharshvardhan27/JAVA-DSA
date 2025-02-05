public class lec14FunctionOverloadingByTypeOfPara {
    public static int sum(int a, int b){
        System.out.println("by int function");
        return a+b;
    }

    public static float sum(float a , float b){
        System.out.println("by float function");
        return a+b;
    }

    public static void main(String[] args) {
        sum(2,35);
        sum(1.2f,3.4f);
        sum(1.2f,35);
    }
}
