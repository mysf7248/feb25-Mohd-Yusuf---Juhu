public class WrapperConversion {
    public static void main(String[] args) {
        Integer num = 100;
        Double d = num.doubleValue(); // ConvertING int to double
        System.out.println("Integer to Double: " + d);

        Double doubleValue = 99.99;
        Integer intValue = doubleValue.intValue(); // ConvertING double to int
        System.out.println("Double to Integer: " + intValue);
    }
}
