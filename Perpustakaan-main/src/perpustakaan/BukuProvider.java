package perpustakaan;

import java.util.ArrayList;

public class BukuProvider {
    
    private static BukuProvider instance; // Singleton instance
    private ArrayList<Buku> bukuCollection;
    
    public BukuProvider() {
        bukuCollection = new ArrayList<>();
        bukuCollection.add(new Buku("Sherlock Holmes"));
        bukuCollection.add(new Buku("Topeng Kaca"));
        bukuCollection.add(new Buku("Doraemon"));
        bukuCollection.add(new Buku("Petualangan Doraemon"));
        bukuCollection.add(new Buku("Thomas and Friends"));
        bukuCollection.add(new Buku("The Return of Sherlock Holmes"));
        bukuCollection.add(new Buku("The Adventure of Sherlock Holmes"));
    }
    
    // Getter untuk instance BukuProvider (Singleton)
    public static BukuProvider getInstance() {
        if (instance == null) {
            instance = new BukuProvider();
        }
        return instance;
    }
    
    public ArrayList<Buku> selectBuku(String judul) {
        ArrayList<Buku> foundBuku = new ArrayList<>();
        
        for (Buku buku : this.bukuCollection) {
            if (buku.judul.toLowerCase().contains(judul.toLowerCase())) {
                foundBuku.add(buku);
            }
        }
        return foundBuku;
    }

    // 🔹 Fungsi Baru: Menambahkan Buku ke Koleksi
    public boolean tambahBuku(String judul) {
        // Cek apakah buku sudah ada di dalam koleksi
        for (Buku buku : bukuCollection) {
            if (buku.judul.equalsIgnoreCase(judul)) {
                return false; // Buku sudah ada, tidak ditambahkan
            } 
        }
        // Tambahkan buku baru
        bukuCollection.add(new Buku(judul));
        return true; // Berhasil ditambahkan
    }
    
    public ArrayList<Buku> getBukuCollection() {
        return bukuCollection;
    }

    // Method untuk menambahkan buku baru ke koleksi
    public void addBuku(Buku buku) {
        bukuCollection.add(buku);
    }

}