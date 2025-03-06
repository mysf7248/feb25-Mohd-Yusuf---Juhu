public class PowerOfTwo
 {
    public static void main(String[] args) {
		
        int num = 16;
        boolean isPowerOfTwo = (num > 0) && ((num & (num - 1)) == 0);
        
        System.out.println(num + " is power of 2: " + isPowerOfTwo);
    }
}


