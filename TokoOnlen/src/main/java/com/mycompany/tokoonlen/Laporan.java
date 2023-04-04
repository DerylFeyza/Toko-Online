/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokoonlen;

/**
 *
 * @author ASUS
 */
public class Laporan {
    public void laporan(Barang barang){
        int x = barang.getJmlItem();
        System.out.println("\nTabel Barang\n");
        System.out.println("ID \tNama Barang \t\tStok \tHarga");
        for (int i = 0; i < x; i++) {
            System.out.println(i+"\t"+barang.getBarang(i)+"\t\t"+barang.getStok(i)+"\t"+barang.getHarga(i));
        }
    }
    public void laporan(Member member){
        int x = member.getJmlMember();
        System.out.println("\nTabel Member\n");
        System.out.println("ID \tNama \t\tAlamat \t\tTelepon \tSaldo");
        for (int i = 0; i < x; i++) {
            System.out.println(i+"\t"+member.getNama(i)+"\t\t"+member.getAlamat(i)+"\t"+member.getTelepon(i)+"\t"+member.getSaldo(i));
        }
    }
    public void laporan(Transaksi transaksi, Barang barang){
        int x = transaksi.getJmlTransaksi();
        System.out.println("\nTabel Transaksi\n");
        System.out.println("Nama Barang \tQty \tHarga \tJumlah");
        int total=0;
        for (int i = 0; i < x; i++) {
            int jumlah = transaksi.getBanyaknya(i)*barang.getHarga(transaksi.getIdBarang(i));
            total+=jumlah;
            System.out.println(barang.getBarang(transaksi.getIdBarang(i))+"\t"+
                               transaksi.getBanyaknya(i)+"\t"+barang.getHarga(transaksi.getIdBarang(i))+"\t"+jumlah);
        }
        System.out.println("Total Omset: "+total);
    }
}
