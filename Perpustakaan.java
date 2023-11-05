import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Buku {
    String judul;
    String pengarang;
    String penerbit;
    int tahun;
    int kategori;

    public Buku(String judul, String pengarang, String penerbit, int tahun, int kategori) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
        this.kategori = kategori;
    }
}

public class Perpustakaan {

    public static void main(String[] args) {


        List<Buku> DataAray = new ArrayList<>();
        Stack<Buku> data = new Stack<>();

        data.add(new Buku("Komputer & Pemrograman", "Abdul Kadir", "Andi Offset", 2003, 3));
        data.add(new Buku("Dasar Pemrograman Java", "Abdul Kadir", "Andi Offset", 2004, 1));
        data.add(new Buku("PBO dengan Java", "Indrajani", "Elexmedia", 2007, 1));

        while (!data.isEmpty()) {
            DataAray.add(data.pop());
        }

        System.out.println("======================================================================================");
        System.out.println("Daftar Buku Java yang Tersedia");
        System.out.println("======================================================================================");
        System.out.println("No\tJudul\tPengarang\tPenerbit\tTahun\tKategori");
        System.out.println("======================================================================================");


        int bukuLawas = 0;
        int bukuBaru = 0;

        for (int i = 0; i < DataAray.size(); i++) {
            Buku buku = DataAray.get(i);
            System.out.println((i + 1) + "\t" + buku.judul + "\t" + buku.pengarang + "\t" + buku.penerbit + "\t" + buku.tahun + "\t" + kategoriToString(buku.kategori));

            if ( buku.tahun < 2004) {
                bukuLawas++;
            } else {
                bukuBaru++;
            }

        }

       


        int[] jumlahBukuPerKategori = new int[4];

        for (Buku buku : DataAray) {
            jumlahBukuPerKategori[buku.kategori - 1]++;
        }


        System.out.println("Jumlah buku yang tersedia: " + DataAray.size());
        System.out.println("Buku Teknik: " + jumlahBukuPerKategori[0]);
        System.out.println("Buku Manajemen: " + jumlahBukuPerKategori[1]);
        System.out.println("Buku Fiksi: " + jumlahBukuPerKategori[2]);
        System.out.println("Buku Lainnya: " + jumlahBukuPerKategori[3]);
        System.out.println("Buku Lawas: " + bukuLawas);
        System.out.println("Buku Baru: " + bukuBaru);
    }

    public static String kategoriToString(int kategori) {
        switch (kategori) {
            case 1:
                return "Teknik";
            case 2:
                return "Manajemen";
            case 3:
                return "Fiksi";
            default:
                return "Lainnya";
        }
    }
} 