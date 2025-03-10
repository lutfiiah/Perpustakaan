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

public class PeminjamanController {
    private Peminjaman peminjaman;
    private PeminjamanManager peminjamanManager;

    public PeminjamanController() {
        peminjaman = new Peminjaman();
        peminjamanManager = new PeminjamanManager();
    }

    public void showFormPeminjaman() {
        Perpustakaan.formPeminjaman = new FormPeminjaman();
        Perpustakaan.formPeminjaman.tampilkan();
    }

    public ArrayList<Buku> cariBuku(String judul) {
        BukuProvider bukuProvider = BukuProvider.getInstance();
        return bukuProvider.selectBuku(judul);
    }

    public void pinjam(BukuDipinjam bukuDipinjam) {
        peminjaman.tambahBuku(bukuDipinjam);
    }

    public void konfirmasiPeminjaman() {
        if (peminjaman.getDaftarBuku().size() > 10) {
            DialogUI dialogUI = new DialogUI("Jumlah buku yang dipinjam melebihi batas maksimal 5 buku");
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
        } else {
            peminjamanManager.save(peminjaman);
            DialogUI dialogUI = new DialogUI("Peminjaman Buku Anda telah dikonfirmasi");
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
        }
    }
}
