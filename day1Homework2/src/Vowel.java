public class Vowel {

    public static void main(String[] args) {

        char harf = 'I';

        switch (harf) {
            case 'A':
            case 'I':
            case '0':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("Înce sesli harf");
        }
    }
}
