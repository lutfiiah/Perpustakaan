/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author Tiara
 */

import java.util.ArrayList;

public class Peminjaman {
    private ArrayList<BukuDipinjam> daftarBuku;

    public Peminjaman() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(BukuDipinjam bukuDipinjam) {
        daftarBuku.add(bukuDipinjam);
    }

    public ArrayList<BukuDipinjam> getDaftarBuku() {
        return daftarBuku;
    }

    public void hapusBuku(BukuDipinjam bukuDipinjam) {
        daftarBuku.remove(bukuDipinjam);
    }
}
