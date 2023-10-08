import java.util.Scanner;

public class pecahanuang {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // pecahan uang
            int uangTotal, sisaUang;
            int[] uang = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 100};

            // inputan uang 
            System.out.print("Masukkan uang Rp: ");
            uangTotal = input.nextInt();
            sisaUang = uangTotal;

            // eksekusi
            for (int i = 0; i < uang.length; i++) {
                if (uang[i] >= 1000) {
                    int lembar = sisaUang / uang[i];
                    if (lembar > 0) {
                        System.out.println(lembar + " Lembar " + uang[i] + " Ribuan");
                        sisaUang = sisaUang % uang[i];
                    }
                } else {
                    int perak = sisaUang / uang[i];
                    if (perak > 0) {
                        System.out.println(perak + " Pecahan " + uang[i] + " Perak");
                        sisaUang = sisaUang % uang[i];
                    }
                }
            }
        }
    }
}
