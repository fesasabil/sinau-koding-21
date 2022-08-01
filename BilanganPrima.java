public class BilanganPrima {

    public static void main(String[] args) {
        int akhir = 20;
        int angka;

        for (int i = 0; i <= akhir; i++) {
            angka = 0;

            for(int j = 1; j <= i; j++) {
                if(i%j == 0) {
                    angka++;
                }
            }

            if(angka == 2) {
                System.out.println(i + " adalah bilangan prima");
            } else {
                System.out.println(i + " bukan bilangan prima");
            }
        }
    }
}