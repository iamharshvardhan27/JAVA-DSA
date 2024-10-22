public class lec7TypePromotion {
    public static void main(String[] args) {
        // Type Promotion in Java

        /* 
        // type promotion rule 1 => java automatically converts the byte , short , char into int while evaluating the expression
        char a = 'a';
        char b = 'b';
        System.out.println(b-a); //1 bacause java converted both into int and then performed the operation
        */
        
        /* 
        char a = 'a';
        short b = 100;
        System.out.println(b+a); //197
        */

        
        //but if we make a opration of byte float char and want the result in byte 
        // byte a = 25;
        // short b = 5;
        // char c = 'c';
        //byte e = a + b + c; //possible lossy conversion from int to byte
        //but if we want the result in byte itself so we will use typecasting
        // System.out.println((byte) a+b+c);


        // type promotion rule 2 => if a opration consists of int , long , float , short , byte , char then java automatically converts the whole result into largest possible datatype ( type which having largest datatype )

        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        double e = a+b+c+d; //as it is largest datatype so we have to store the result in double as per the 2nd rule
        System.out.println(e);

    }
}

