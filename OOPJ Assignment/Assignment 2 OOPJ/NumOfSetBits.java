public class NumOfSetBits {
    public static void main(String[] args) {
		
        int num = 29; 
        int count = 0;
        
        while (num > 0) {
            num = num & (num - 1);
            count++;
        }
        
        System.out.println("Number of Set bits : " + count);
    }
}