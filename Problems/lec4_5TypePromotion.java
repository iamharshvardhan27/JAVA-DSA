public class lec4_5TypePromotion {
    public static void main(String[] args) {
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        int result = (f * d) + ( i % c) - (d * s);
        System.out.println(result); // as it is giving error cant convert double to int
        // System.out.println( (f * d) + ( i % c) - (d * s) ); 


        // Answer : so the result will be double 
    }    
}
