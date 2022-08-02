import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa");
        int n = input.nextInt();

        String nama[] = new String[n];
        int nilai[] = new int[n];
        String status[] = new String[n];

        for ( int i=0 ; i < n; i++){
            System.out.println("Mahasiswa Ke : " +(i+1));
            System.out.print("Nama : ");
            nama[i] = input.next();

            System.out.print("Nilai : ");
            nilai[i] = input.nextInt();

            if ( nilai[i] <= 65 ){
                status[i] = "Tidak Lulus";
            } else {
                status[i] = "Lulus";
            }
        }

        System.out.println("No\tNama\tNilai\tStatus");
        for (int i = 0; i < n; i++){
            System.out.println(i+1 + "\t" + nama[i] + "\t" + nilai[i] + "\t\t" + status[i]);
        }
    }
}
