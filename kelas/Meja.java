package kelas;

public class Meja {
    private int nomorMeja;
    private Pelanggan pelanggan;
    private Menu[] menu;

    public Meja(int nomorMeja) {
        this.nomorMeja = nomorMeja;
        this.menu = new Menu[10]; // maksimum 10 pesanan per meja
    }

    public int getNomorMeja() {
        return nomorMeja;
    }

    public void setNomorMeja(int nomorMeja) {
        this.nomorMeja = nomorMeja;
    }

    // Data Pelanggan perMeja //
    // menampilkan pelanggan perMeja
    public Pelanggan getPelanggan() {
        return pelanggan;
    }
    // Mendata Pelanggan perMeja
    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    // Data Menu perMeja //
    // menampilkan pelanggan perMenu
    public Menu[] getMenu() {
        return menu;
    }
    // Mendata Pelanggan perMeja 
    public void setMenu(Menu menu) {
        boolean pesananDitambahkan = false;
        for (int i = 0; i < this.menu.length; i++) {
            if (this.menu[i] == null) {
                this.menu[i] = menu;
                pesananDitambahkan = true;
                break;
            }
        }
        //jika "pesanaDitambahkan" masih 'false'
        if (!pesananDitambahkan) {
            System.out.println("Maaf, tidak dapat menambahkan pesanan lagi. Sudah mencapai batas maksimum 10 pesanan.");
        }
    }
    
    // untuk mengecek apakah meja kosong
    public boolean isKosong() {
        boolean mejaKosong = true;
        
        // Periksa apakah ada pelanggan
        if (pelanggan != null) {
        mejaKosong = false;
        }
        
        // Periksa apakah ada menu yang dipesan
        for (Menu m : menu) {
            if (m != null) {
            mejaKosong = false;
            break;
            }
        }
        
        return mejaKosong;
    }
}
