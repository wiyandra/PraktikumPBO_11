package Tugas;

public class Pengarang {
    private String namaPengarang;

    public Pengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    public void infoPengarang() {
        System.out.println("Nama Pengarang: " + namaPengarang);
    }

    public String getNamaPengarang() {
        return namaPengarang;
    }
}
