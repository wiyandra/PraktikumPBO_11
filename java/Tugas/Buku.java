package Tugas;

public class Buku {
    private String judul;
    private Pengarang pengarang; // Agregasi dengan Pengarang

    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
        if (pengarang != null) {
            System.out.print("Pengarang: ");
            pengarang.infoPengarang();
        } else {
            System.out.println("Pengarang Tidak Ditemukan.");
        }
    }

    public String getJudul() {
        return judul;
    }
}
