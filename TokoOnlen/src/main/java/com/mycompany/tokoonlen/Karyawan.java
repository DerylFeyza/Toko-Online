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
public abstract class Karyawan implements User{
    private ArrayList <String> namaKaryawan=new ArrayList <>();
    private ArrayList <String> alamat = new ArrayList <>();
    private ArrayList <String> telepon = new ArrayList <>();
    private ArrayList <Integer> jabatan = new ArrayList <Integer>();
    private String ListJabatan[] = {"CEO - Chief Executive Officer","Manager","Employee","Intern"};
    
    public Karyawan(){
        // Karyawan Default pertama
        namaKaryawan.add("Dreamybull XX");
        alamat.add("JL. Ambatukam No.69");
        telepon.add("089823421");
        jabatan.add(0);
        
        // Karyawan Default kedua
        namaKaryawan.add("Suisei");
        alamat.add("JL. Stella");
        telepon.add("08026969");
        jabatan.add(1);
        
        // Karyawan Default tiga
        namaKaryawan.add("Kim Jong Il");
        alamat.add("JL. Atom");
        telepon.add("0809751123");
        jabatan.add(2);
        
    }
    public String getJabatanList(int jabatan){
       return ListJabatan[this.jabatan.get(jabatan)];
    }
    
    public int getJmlKaryawan(){
        return namaKaryawan.size();
    }

    @Override
    public void setNama(String Nama) {
        namaKaryawan.add(Nama);
    }

    @Override
    public void setAlamat(String Alamat) {
        alamat.add(Alamat);
    }

    @Override
    public void setTelepon(String Telepon) {
        telepon.add(Telepon);
    }
    
    public void setJabatan(int Jabatan){
        jabatan.add(Jabatan);
    }

    @Override
    public String getNama(int Nama) {
        return namaKaryawan.get(Nama);
    }

    @Override
    public String getAlamat(int Alamat) {
        return alamat.get(Alamat);
    }

    @Override
    public String getTelepon(int Telepon) {
        return telepon.get(Telepon);
    }
    
    public int getJabatan(int Jabatan) {
        return jabatan.get(Jabatan);
    }
   
    public abstract void PrintKaryawan(int id);

}
    

   