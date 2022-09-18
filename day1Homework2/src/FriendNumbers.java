public class FriendNumbers {

    public static void main(String[] args) {

        int sayi1 = 222;
        int sayi2 = 284;
        int toplaml = 0;
        int toplam2 = 0;

        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                toplaml = toplaml + i;
            }
        }
        for (int i = 1; i < sayi2; i++) {
            if (sayi2 == 0) {
                toplam2 = toplam2 + i;
            }
        }
        if (sayi1 == toplam2 && sayi2 == toplaml) {
            System.out.println("bu iki sayı arkadaştır");
        } else {
            System.out.println("bu iki sayı arkadaş değildir");
        }
    }

}
