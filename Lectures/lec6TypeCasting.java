public class lec6TypeCasting {
    public static void main(String[] args) {
        // Type casting ( Explicit conversion / Narrowing )

        // converting the float to int 
        // float mymarks = 99.20f;
        // int marks = mymarks; 
        //not allowed by java gives error - possible lossy conversion from float to int

        // but if we want to do the conversion forcefully then we can do it by type casting 
        float mymarks = 99.20f;
        int marks = (int) mymarks;
        System.out.println(marks); //99
        
    }
}
