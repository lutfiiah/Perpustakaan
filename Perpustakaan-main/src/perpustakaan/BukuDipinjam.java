/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

public class BukuDipinjam {
    private Buku buku;
    private int lama;

    public BukuDipinjam(Buku buku, int lama) {
        this.buku = buku;
        this.lama = lama;
    }

    public Buku getBuku() {
        return buku;
    }

    public int getLama() {
        return lama;
    }
    
    public void setLama(int lama){
        this.lama = lama;
    }
}