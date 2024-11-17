package Tugas;

import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    private ArrayList<Buku> daftarBuku; // Komposisi dengan Buku

    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    // Metode untuk menambahkan buku
    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    // Metode untuk menampilkan informasi semua buku
    public void tampilkanSemuaBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Perpustakaan tidak memiliki buku.");
        } else {
            System.out.println("Daftar Buku di Perpustakaan:");
            for (Buku buku : daftarBuku) {
                buku.infoBuku();
                System.out.println("-------------------");
            }
        }
    }
    
    // Menghapus perpustakaan beserta buku-bukunya
    public void hapusPerpustakaan() {
        daftarBuku.clear();
        System.out.println("Semua buku di perpustakaan telah dihapus.");
    }
}
