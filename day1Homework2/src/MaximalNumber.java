public class MaximalNumber {

    public static void main(String[] args) {

        int num1 = 24;
        int num2 = 25;
        int num3 = 26;
        int maximalNum = num1;

        if (maximalNum < num2) {
            maximalNum = num2;
        } else if (maximalNum < num3) {
            maximalNum = num3;
        }

        System.out.println("En buyuk sayi : "+maximalNum);
    }
}