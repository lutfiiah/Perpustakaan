package perpustakaan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alva Shaquilla R
 */
import java.awt.Dialog;
import java.util.ArrayList;

public class DonasiBukuController {
    
    public void showFormDonasiBuku() {
        Perpustakaan.formDonasiBuku = new FormDonasiBuku();
        Perpustakaan.formDonasiBuku.tampilkan();
    }

    // Perbaikan method tambahBuku
     public void tambahBuku(String judul) {
       BukuProvider bukuProvider = BukuProvider.getInstance();

        // Cek apakah buku sudah ada di dalam koleksi
        for (Buku buku : bukuProvider.getBukuCollection()) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                DialogUI dialogUI = new DialogUI("Buku sudah ada dalam koleksi!");
                dialogUI.pack();
                dialogUI.setLocationRelativeTo(null);
                dialogUI.setVisible(true);
                return; // Keluar dari method jika buku sudah ada
            }
        }

        // Tambahkan buku baru ke koleksi
        bukuProvider.addBuku(new Buku(judul));
        DialogUI dialogUI = new DialogUI("Buku berhasil ditambahkan!");
        dialogUI.pack();
        dialogUI.setLocationRelativeTo(null);
        dialogUI.setVisible(true);
        
    }

      
    }

    


