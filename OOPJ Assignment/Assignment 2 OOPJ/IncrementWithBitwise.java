public class IncrementWithBitwise {
    public static void main(String[] args) {
        int num = 5;
        int incremented = -~num; 
        System.out.println("Incremented value: " + incremented);
    }
}
