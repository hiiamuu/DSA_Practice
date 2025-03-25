public class CountDigit {
    // Count digits in a number
    public static void main(String[] args) {
        int count = 0;
        int num = 1234567890;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Number of digits:" + count);
    }
    
}