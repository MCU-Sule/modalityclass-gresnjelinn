package com.example.pt03modality2072028.model;

public class ItemKopi {
    private String nama;
    private double harga;
    private double diskon;

    public ItemKopi(String nama, double harga, double diskon) {
        this.nama = nama;
        this.harga = harga;
        this.diskon = diskon;
    }

    @Override
    public String toString() {
        if (diskon == 0) {
            return nama + " " + harga;
        } else {
            return nama + " " + (1-diskon) * harga + " (Original Price : " +
                    harga + ") Discount : " + diskon * 100 + "%";
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }
}
