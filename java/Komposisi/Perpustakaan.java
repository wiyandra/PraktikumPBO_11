package Komposisi;

import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    private List<Buku> bukuList;
    
    public Perpustakaan() {
        this.bukuList = new ArrayList<>();
    }
    
    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }
    
    public void infoPerpustakaan() {
        for (Buku buku : bukuList) {
            buku.infoBuku();
        }
    }
}
