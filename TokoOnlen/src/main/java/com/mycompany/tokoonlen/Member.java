/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tokoonlen;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public abstract class Member implements User{
    private ArrayList <String> namaMember = new ArrayList <>();
    private ArrayList <String> alamat = new ArrayList <>();
    private ArrayList <String> telepon = new ArrayList <>();
    private ArrayList <Integer> saldo = new ArrayList <>(); 
    
    public Member(){
        //Member default 1
        namaMember.add("Husbant");
        alamat.add("Jl. Amogus");
        telepon.add("08957213");
        saldo.add(5000000);
    }
    
    public int getJmlMember(){
        return namaMember.size();
    }
    
     @Override
    public void setNama(String Nama) {
        namaMember.add(Nama);
    }
    public void setNama(String Nama, int index)
    {
        namaMember.add(Nama);
    }

    @Override
    public void setAlamat(String Alamat) {
        alamat.add(Alamat);
    }

    @Override
    public void setTelepon(String Telepon) {
        telepon.add(Telepon);
    }
    
    public void setSaldo (int Saldo){
        saldo.add(Saldo);
    }
    
    public void editSaldo (int index, int saldo){
        this.saldo.set(index, saldo);
    }

    @Override
    public String getNama(int Nama) {
        return namaMember.get(Nama);
    }

    @Override
    public String getAlamat(int Alamat) {
        return alamat.get(Alamat);
    }

    @Override
    public String getTelepon(int Telepon) {
        return telepon.get(Telepon);
        
    }
    public int getSaldo (int Saldo){
        return saldo.get(Saldo);
    }
    public abstract void PrintMember(int id);
    public abstract void DaftarMember(String nama, String NoTelp, String Alamat, int saldomu);
}
