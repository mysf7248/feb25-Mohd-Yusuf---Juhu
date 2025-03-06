public class TypeCasting {
    public static void main(String[] args) {
        // Implicit Type Casting (Widening)
        int num = 50;
        double d = num;
        System.out.println("Implicit Casting (int to double): " + d);

        // Explicit Type Casting (Narrowing)
        double value = 99.99;
        int intValue = (int) value;
        System.out.println("Explicit Casting (double to int): " + intValue);
    }
}
