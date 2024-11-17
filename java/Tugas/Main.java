package Tugas;

public class Main {
    public static void main(String[] args) {
        // Membuat Pengarang
        Pengarang pengarang1 = new Pengarang("J.K. Rowling");
        Pengarang pengarang2 = new Pengarang("George R.R. Martin");

        // Membuat Buku
        Buku buku1 = new Buku("Harry Potter and the Philosopher's Stone", pengarang1);
        Buku buku2 = new Buku("A Game of Thrones", pengarang2);

        // Membuat Perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();

        // Menambahkan Buku ke Perpustakaan
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        // Menampilkan semua buku di Perpustakaan
        perpustakaan.tampilkanSemuaBuku();

        // Menghapus Perpustakaan (dan buku-bukunya)
        perpustakaan.hapusPerpustakaan();
        perpustakaan.tampilkanSemuaBuku();
    }
}
